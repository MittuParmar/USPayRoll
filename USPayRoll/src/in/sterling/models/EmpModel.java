package in.sterling.models;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import in.sterling.dcp.JDBCDataSource;
import in.sterling.dto.EmpDTO;

public class EmpModel {
	
	JDBCDataSource dataSource=JDBCDataSource.getInstance();
	Connection con = dataSource.getConnection();
	
	public boolean addEmp(EmpDTO dto) {
		boolean flag=false;
			try {
				PreparedStatement ps=con.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?,?,?)");
				ps.setString(1,dto.getEmpId());
				ps.setString(2, dto.getSsn());
				ps.setString(3,dto.getFname());
				ps.setString(4,dto.getLname());
				ps.setString(5,dto.getMobile());
				ps.setString(6,dto.getDepartment());
				ps.setString(7,dto.getDesigntion());
				ps.setString(8,dto.getBankNo());
				ps.setString(9,dto.getDate());
				ps.setString(10,dto.getJdate());
				int i=ps.executeUpdate();
				if(i>0)
					flag=true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return flag;
	}	
}
