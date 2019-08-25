package in.sterling.dcp;
import java.sql.Connection;
import java.sql.SQLException;
import com.mchange.v2.c3p0.ComboPooledDataSource;
public class JDBCDataSource
{
	//singleton design pattern
	//step 1 : create a refrence variable of same class that must be private and static
		private static JDBCDataSource dataSource=null;
	//step 2 : make constantor private
		private JDBCDataSource(){}
	//step 3 : create a refrence variable of connecton pool that must be private
		private ComboPooledDataSource cpds=null;
	//step 4 : create a factory method
	// create a method getInstance() that return a object of same class
		public static JDBCDataSource getInstance()
		{
			if(dataSource==null)
			{
				dataSource = new JDBCDataSource();
				dataSource.cpds = new ComboPooledDataSource();
				try
				{
					dataSource.cpds.setDriverClass("com.mysql.jdbc.Driver");
					dataSource.cpds.setJdbcUrl("jdbc:mysql://localhost:3306/uspayroll");
					dataSource.cpds.setUser("root");
					dataSource.cpds.setPassword("root");
					dataSource.cpds.setInitialPoolSize(10);
					dataSource.cpds.setAcquireIncrement(10);
					dataSource.cpds.setMaxIdleTime(5);
					dataSource.cpds.setMinPoolSize(2);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		return dataSource;
		}
		public Connection getConnection()
		{
			Connection con=null;
			try {	
				if(cpds!=null)
					con=cpds.getConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return con;
		}
}