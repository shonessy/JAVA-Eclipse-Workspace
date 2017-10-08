import java.sql.*;
import java.util.Scanner;

public class TestMetaData {
	private static final String url="jdbc:mysql://localhost:3306/world?useSSL=false";
	private static final String userName="root";
	private static final String password="sifra4sql";
	
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			Connection conn=null;
			Statement stmt=null;
			PreparedStatement pstmt=null;
			String selectQuery="select id, "
							  + "name, "
							  + "District,"
							  + "population "
					   + "from city "
					   + "where CountryCode='yug';";
			String updateQuery="update city set district=? where name='Uzice' ";
			
			try{
				conn=DriverManager.getConnection(url, userName, password);
				System.out.println("Connected to database");
				conn.setAutoCommit(false);
				
				stmt=conn.createStatement();
				System.out.println("The SQL query is: \n\t" + selectQuery);
				System.out.println();
				
				/*String update="update city set district='Mica' where name='Uzice' ";
				stmt.executeUpdate(update);
				conn.commit();*/
				
				
				
				pstmt=conn.prepareStatement(updateQuery);
				System.out.print("Unesite District za Uzice: ");
				pstmt.setString(1, input.nextLine());
				pstmt.executeUpdate();
				conn.commit();
				
				ResultSet rs=stmt.executeQuery(selectQuery);
				ResultSetMetaData rsMD=rs.getMetaData();
				int numColmns=rsMD.getColumnCount();
				
				String columNames[]=new String[numColmns];
				int width=0;
				for(int i=1; i<=numColmns; i++){
					columNames[i-1]=rsMD.getColumnName(i);
					width+=rsMD.getColumnDisplaySize(i);
				}
				
				String format="|%5s\t| %-10s\t| %-20s\t| %-10s\t|";
				String underLine = new String(new char[width]).replace('\0', '-');
				int numRows=0;
				conn.commit();
				
				System.out.println("\nResult of the query is: ");
				System.out.println(String.format(format, columNames));
				System.out.println(underLine);
				while(rs.next()){
					/*int id=rs.getInt("ID");
					String name=rs.getString("Name");
					String district=rs.getString("District");
					int population=rs.getInt("Population");
					System.out.println(String.format(format, id, name, district, population));*/
					String row[]=new String[numColmns];
					for(int i=1; i<=numColmns; i++)
						row[i-1]=rs.getString(i);
					System.out.println(String.format(format, row));
					numRows++;
				}
				System.out.println("\nRows Retrived: " + numRows);
				
			}catch(SQLException e){
				// JDBCTutorialUtilities.printSQLException(e);
				try{
					conn.rollback();
				}catch(SQLException ex){
					//
				}
			}finally{
				if(stmt!=null)try{stmt.close();}catch(SQLException e){/**/}
				if(pstmt!=null)try{pstmt.close();}catch(SQLException e){/**/}
				if(conn!=null)try{conn.close();}catch(SQLException e){/**/}
			}
		
	}

}
