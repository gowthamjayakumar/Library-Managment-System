package librarymanag;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
public class Librarymanag {

    
    public static void main(String[] args) {
        
        try {
            
            
        String host = "jdbc:derby://localhost:1527/Library2";
        String uName = "gowtham";
        String uPass =  "gowtham";
        Connection con = DriverManager.getConnection(host, uName, uPass);
        
            java.sql.Statement stmt = con.createStatement();
        String SQL;
            SQL = "SELECT * FROM LIBRARY";
            java.sql.ResultSet rs = stmt.executeQuery( SQL );
        
        while (rs.next( )) {
        
            int book_id = rs.getInt("BOOK_ID");
        String book_name = rs.getString("BOOK_NAME");
        String author_name = rs.getString("AUTHOR_NAME");
        int edition = rs.getInt("EDITION");
        String department = rs.getString("DEPARTMENT");
        String availability = rs.getString("AVAILABILITY");
        
        String p = ( book_id + " " + book_name + " " + author_name + edition + " " + department + " " + availability );
        System.out.println(p);
        }
        }
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }
    }
}
