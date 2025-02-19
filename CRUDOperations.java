import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class CRUDOperations {

    private Connection connection = null;

    public void create(String name, float price, String addDate, String imagePath) {
  
        ConnMySql _dbconn = new ConnMySql();
        connection = _dbconn.konekcija;
        //System.out.println("Obrada ucitiana connection " + connection);

        PreparedStatement statement = null;

        try {
            String query = "INSERT INTO products (name, price, add_date, image) VALUES (?, ?, ?, ?)";
            statement = connection.prepareStatement(query);

            statement.setString(1, name);
            statement.setFloat(2, price);
            statement.setString(3, addDate);
            statement.setString(4, imagePath);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Uspesno dodato");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}