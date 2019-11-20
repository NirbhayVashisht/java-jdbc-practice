//this is Part 1 of the series
/* In the following program we are connecting to mysql database in java*/

import java.sql.*;

public class driver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            //1. Get a connection to database
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","abc12");
            //2. Create a statement
            Statement myStmt = myConn.createStatement();
            //3. Execute a SQL query
            ResultSet myRs = myStmt.executeQuery("select * from company");
            //4. Process the result set
            while (myRs.next()) {
                System.out.println(myRs.getString("cname")+" , "+myRs.getString("ccity"));
            }

        }catch(Exception exc) {
            exc.printStackTrace();
        }
    }

}
