import java.sql.*;

public class App {
    public static void main(String[] args) throws SQLException {
        Connection connection;
        connection=DriverManager.getConnection("jdbc:mysql://localhost/cgi","root","Root@123");
        System.out.println(" connection created"+connection);

        Statement stmt=connection.createStatement();

        ResultSet resultSet= stmt.executeQuery("select * from Sales_Rep");

        while(resultSet.next()){
            Integer Repid;
            Repid=resultSet.getInt("Rep_ID");
            String name=resultSet.getNString("Name");
            String city=resultSet.getString("City");

            System.out.println("Repid "+Repid+" Name "+name+" lives in city "+city);

        }

    }
}
