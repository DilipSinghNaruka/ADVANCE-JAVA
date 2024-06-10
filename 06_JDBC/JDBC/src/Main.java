import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Students";

        //Database credentials
        String username = "root";
        String password = "root";

        //Establish the connection
        try(Connection connection = DriverManager.getConnection(url,username, password)){
            System.out.println("JAI SHREE RAM CONNECTED TO DATABASE. ");
        }catch(SQLException e){
            System.out.println("Not Connected");
        }

    }
}