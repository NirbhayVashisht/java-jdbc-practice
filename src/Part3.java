//in the following program we are updating data in the mySQL database
import java.sql.*;

public class Part3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String pass = "abc12";

        try{
            //step 1 : get a connection
            Connection myConn = DriverManager.getConnection(url,user,pass);

            //step 2 : create a statement
            Statement Stmt = myConn.createStatement();

            //step 3 : execute a query
            String query = "Update company set ccity = 'Banglore' where cname = 'Microsoft'";
            Stmt.executeUpdate(query);

            System.out.println("Update completed");

        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }
}
