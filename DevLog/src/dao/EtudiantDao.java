package dao;
import model.*;

import java.sql.*;

public class EtudiantDao extends ConnectionDao{
	
	public EtudiantDao() {
		super();
	}

	public boolean isStudent (Student etu) {
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean returnValue = false;
		
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASS);
			ps = con.prepareStatement("SELECT * FROM STUDENT WHERE IDETUDIANT = ?");
			ps.setInt(1, etu.getId());
			
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				returnValue = (rs.getString("MOTDEPASSE").equals(etu.getMotDePasse()));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs != null) {
					rs = null;
				}
			}catch(Exception ignore) {
			}
			try {
				if(ps != null) {
					ps = null;
				}	
			}catch(Exception ignore) {
			}
			try {
				if(con != null) {
					con = null;
				}
			}catch(Exception ignore) {
			}
		}
			
		return returnValue;
	}
	
}
