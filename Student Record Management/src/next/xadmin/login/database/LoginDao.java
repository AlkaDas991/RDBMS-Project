package next.xadmin.login.database;
import next.xadmin.login.bean.LoginBean;
import java.sql.*;

public class LoginDao {
	public boolean validate(LoginBean loginBean) {
		boolean status = false;
		try {
			Connection con =Project.ConnectionProvider.getCon();
			String sql = "select * from adminlogin where uname = ? and pass = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginBean.getUsername());
			ps.setString(2, loginBean.getPassword());
			System.out.println(loginBean.getPassword());
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			System.out.println(status);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}
}