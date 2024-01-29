import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WorkingWithDataBase {
		public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException 
		{
			String url="jdbc:mysql://localhost:3306/";
			String dbname="learning";
			String DBdriver="com.mysql.jdbc.Driver";
			String username="root";
			String password="Kumar@59";
			
			Connection conn;
			
			//create object
			Class.forName(DBdriver).newInstance();
			
			//create database connection
			conn=DriverManager.getConnection(url+dbname,username,password);
			
			//insert query
			PreparedStatement ps=conn.prepareStatement("select*from dept");
			
			//execute query
			ResultSet rs=ps.executeQuery();
			
//			while(rs.next())
//			{
//	          
//				System.out.println(rs.getString(3));
//				
//			}
			   
			
//			while(rs.next())
//			{
//	          for(int i=1;i<=8;i++)
//				{
//				System.out.print(rs.getString(i)+"  ");
//				}
//				
//				System.out.println();
//			
//			}			
	}

}
