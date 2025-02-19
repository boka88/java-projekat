import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class Obrada {

    private Connection connection = null;

    public Obrada() {
        //System.out.println("Obrada ucitiana");
        ConnMySql _dbconn = new ConnMySql();
        connection = _dbconn.konekcija;
        //System.out.println("Obrada ucitiana connection " + connection);

        Statement statement = null;

        try {
            statement = connection.createStatement();
            String query = "SELECT * FROM products";

            ResultSet rs = statement.executeQuery(query);
            /*if (rs.next()) {
                System.out.println("Obrada REZULTATI QUERY " + rs.getString("id"));
                System.out.println("Obrada REZULTATA QUERY " + rs.getString("name"));
            }*/
            while (rs.next()) {
                    int productId = rs.getInt("id");
                    String productName = rs.getString("name");
                    double productPrice = rs.getDouble("price");
                    String imagePath = rs.getString("image");

                    System.out.println("ID: " + productId + ", Name: " + productName + ", Price: " + productPrice + ", Image: " + imagePath);
            }            
        } catch (SQLException sqlex) {
            System.out.println("GRESKA OBRADA QIERY " + sqlex);
        } 
    }
}