import java.sql.*;

public class TestJDBC {

	public static void main(String[] args) {
		try (
		         // Step 1: Allocate a database "Connection" object
		         Connection conn = DriverManager.getConnection(
		               "jdbc:mysql://localhost:3306/world?useSSL=false", "root", "sifra4sql"); // MySQL
																				//throws SQLException

		         // Step 2: Allocate a "Statement" object in the Connection
		         Statement stmt = conn.createStatement();	//throws SQLException
		      ) {
				 //conn.setAutoCommit(false);
			
		         // Step 3: Execute a SQL SELECT query, the query result
		         //  is returned in a "ResultSet" object.
		         String strSelect = "SELECT * "
		         				  + "FROM city "
		         				  + "where id<50";
		         System.out.println("The SQL query is: " + strSelect); // Echo For debugging
		         System.out.println();
		 
		         ResultSet rset = stmt.executeQuery(strSelect);
		 
		         // Step 4: Process the ResultSet by scrolling the cursor forward via next().
		         //  For each row, retrieve the contents of the cells with getXxx(columnName).
		         System.out.println("The records selected are:");
		         int rowCount = 0;
		         while(rset.next()) {   // Move the cursor to the next row
		            int id=rset.getInt("ID");
		            String name = rset.getString("Name");
		            String countryCode = rset.getString("CountryCode");
		            String district = rset.getString("District");
		            int population = rset.getInt("Population");
		            
		            System.out.println(id + ", " + name + ", " + countryCode + ", " + 
		            		   		   district + ", " + population );
		            ++rowCount;
		         }
		         System.out.println("Total number of records = " + rowCount);
		         //conn.commit();
		         
		      } catch(SQLException ex) {
		         ex.printStackTrace();
		      }
		      // Step 5: Close the resources - Done automatically by try-with-resources
			/*
			 * finally {
        		if (stmt != null) 
        			stmt.close(); 
        		}
        	*/
	}

}
