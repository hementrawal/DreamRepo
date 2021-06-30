import java.sql.*;

public class InsertDemo {
    public static void main(String[] args)throws SQLException {
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/cgi","root","Root@123");
        System.out.println("connection established  "+ connection);

        PreparedStatement stmt=connection.prepareStatement("insert into Sales_Rep values(?,?,?,?)");
        stmt.setInt(1,7525);
        stmt.setString(2,"Bhavya");
        stmt.setString(3,"jamnagar");
        stmt.setInt(4,2);
        int i=stmt.executeUpdate();
        System.out.println(i+" records inserted");
        connection.close();
    }
}
