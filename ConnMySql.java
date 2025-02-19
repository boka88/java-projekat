import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.*;


public class ConnMySql {

    public static Connection konekcija = null;

    public ConnMySql() {
        // URL, korisničko ime i lozinka za povezivanje sa bazom
        String url = "jdbc:mysql://localhost:3306/products_db"; // URL baze podataka
        String username = "root";  // Korisničko ime (podrazumevano: "root")
        String password = "bin123";  // Lozinka (prilagodite prema vašem okruženju)

        // Povezivanje sa bazom podataka
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            konekcija = connection;
            /*System.out.println("Uspešno ste povezani sa bazom!");

            // Kreiranje SQL upita
            String query = "SELECT * FROM products"; // Pretpostavimo da imate tabelu "products"
            konekcija = connection;
            // Izvršavanje upita
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {
                
                // Obrada rezultata
                while (resultSet.next()) {
                    int productId = resultSet.getInt("id");
                    String productName = resultSet.getString("name");
                    double productPrice = resultSet.getDouble("price");

                    System.out.println("ID: " + productId + ", Name: " + productName + ", Price: " + productPrice);
                }*/
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException cf) {
            System.out.println("Class not found " + cf);
        }
    }
}
