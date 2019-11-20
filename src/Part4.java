//In the following program we are deleting data from Mysql database

import java.sql.*;

public class Part4 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String pass = "abc12";

        try{
            //get a connection
            Connection con = DriverManager.getConnection(url,user,pass);

            //create a statement
            Statement stmt = con.createStatement();

            //execute a query
            String query = "delete from company where cname = 'Microsoft'";
            int rowsaffected = stmt.executeUpdate(query);
            System.out.println("Rows Affected : " + rowsaffected);
            System.out.println("deletion completed");

        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }

    }
}
