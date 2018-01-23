import java.sql.*;

public class Day6JDBC 
{

	public static void main(String[] args) 
	{
		Connection conn = null;
		// TODO Auto-generated method stub
		try
		{
			//All versions of JDK
			Driver dbDriver = (Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(dbDriver);
			//Oracle JDK
			//Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost/MyDB", "root", "");
			
			Statement stmt = conn.createStatement();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM products WHERE name=?");
			//ps.executeQuery();
			
			//String sql = "CREATE TABLE IF NOT EXISTS products (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(40), price DECIMAL)";
			//ResultSet rs = stmt.executeQuery(sql);//Specifically for SELECT statements
			//String sql = "INSERT INTO products (name,price) VALUES ('Do dad',10.50),('Tiki Back Scratcher', 2),('Water Bottle',15)";
			//String sql = "UPDATE products SET price='10.50' WHERE id=1 LIMIT 1";
			//System.out.println(stmt.executeUpdate(sql));//For INSERT, UPDATE, DELETE
			String sql = String.format("SELECT * FROM products WHERE price < %f",5.5);
//			if(stmt.execute(sql))
//			{
//				ResultSet rs = stmt.getResultSet();
//				ResultSet rs2 = stmt.getResultSet();
//			}
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.format("%d - %s ($ %10.2f)\n",rs.getInt("id"),rs.getString("name"),rs.getDouble("price"));
			}
			
			System.out.println("=====================================");
			rs.beforeFirst();
			
			while(rs.next())
			{
				System.out.println(rs.getString("name"));
			}
			
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
