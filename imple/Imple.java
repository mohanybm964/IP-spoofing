package imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


import dbconn.Dbconn;
import bean.Uploadbean;
import bean.Userregbean;
import inter.Inter;

public class Imple implements Inter {
	
	Connection con;

	@Override
	public int ureg(Userregbean ur) {
		// TODO Auto-generated method stub
		
		int reg=0;
		 
		 con=Dbconn.create();
		 
		 		try {
		 			
		 				PreparedStatement ps=con.prepareStatement("INSERT INTO ipspoof.userregistertbl VALUES(id,?,?,?,?,?)");
		 				ps.setString(1,ur.getName());
		 				ps.setString(2,ur.getPhoeneno());
		 				ps.setString(3,ur.getEmail());
		 				ps.setString(4,ur.getPassword());
		 				ps.setString(5,ur.getIpadd());
		 				reg=ps.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 		
		return reg;

	}

	@Override
	public boolean ulog(Userregbean ur) {
		// TODO Auto-generated method stub
		
		boolean log=false;
		 con=Dbconn.create();
		
		 try {
				PreparedStatement ps=con.prepareStatement("SELECT * FROM ipspoof.userregistertbl where email=? and pass=?");
				ps.setString(1,ur.getEmail());
				ps.setString(2,ur.getPassword());
				ResultSet rs=ps.executeQuery();
				log=rs.next();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return log;

		
	}

	@Override
	public int uploadinter(Uploadbean ub) {
		// TODO Auto-generated method stub
		
		int dd=0;
		try
		{
			 con=Dbconn.create();
			 PreparedStatement ps=con.prepareStatement("INSERT INTO ipspoof.upload  VALUES(id,?,?,?,?,?,?,?,?)");
			 ps.setString(1, ub.getFilename());
			 ps.setString(2, ub.getFilekey());
			 ps.setString(3, ub.getFilecateg());
			 ps.setString(4, ub.getFiles());
			 ps.setString(5, ub.getFileprior());
			 ps.setString(6, ub.getFiledescript());
			 ps.setString(7, ub.getEncrypt());
			 ps.setString(8, ub.getDecrypt());
			 
			 
			 
			 dd=ps.executeUpdate();	
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return dd;

		
		
	}

	@Override
	public int uploadinter2(Uploadbean fub) {
		// TODO Auto-generated method stub
		
		int dd=0;
		try
		{
			 con=Dbconn.create();
			 PreparedStatement ps=con.prepareStatement("INSERT INTO ipspoof.upload2  VALUES(id,?,?,?,?,?,?,?,?,?)");
			 ps.setString(1, fub.getFilename());
			 ps.setString(2, fub.getFiletype());
			 ps.setString(3, fub.getFilekey());
			 ps.setString(4, fub.getFilesize());
			 ps.setString(5, fub.getFilecontent());			 
			 ps.setString(6, fub.getEncrypt());
			 ps.setString(7, fub.getDecrypt());		
			 ps.setString(8, fub.getFilecateg());		
			 ps.setString(9, fub.getFileprior());
			 dd=ps.executeUpdate();	
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return dd;

		
	}

	@Override
	public int requestinter(Uploadbean rb) {
		// TODO Auto-generated method stub
		
		int dd=0;
		try
		{
			 con=Dbconn.create();
			 PreparedStatement ps=con.prepareStatement("INSERT INTO ipspoof.request  VALUES(id,?,?,?,?,?,?)");
			 ps.setString(1, rb.getFilename());			
			 ps.setString(2, rb.getFilekey());			 						 	
			 ps.setString(3, rb.getFilecateg());		
			 ps.setString(4, rb.getFileprior());
			 ps.setString(5, rb.getUsername());
			 ps.setString(6, rb.getIpaddress());
			 dd=ps.executeUpdate();	
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return dd;

	}

	@Override
	public int responsinter(Uploadbean rp) {
		// TODO Auto-generated method stub
		
		int dd=0;
		try
		{
			 con=Dbconn.create();
			 PreparedStatement ps=con.prepareStatement("INSERT INTO ipspoof.respons VALUES(id,?,?,?,?,?,?,?)");
			 ps.setString(1, rp.getFilename());			
			 ps.setString(2, rp.getFilekey());			 						 	
			 ps.setString(3, rp.getFilecateg());		
			 ps.setString(4, rp.getFileprior());
			 ps.setString(5, rp.getUsername());
			 ps.setString(6, rp.getIpaddress());
			 ps.setString(7, rp.getFkeyqr());
			 dd=ps.executeUpdate();	
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return dd;

	}

	/*@Override
	public int hackerinter(Uploadbean hr) {
		// TODO Auto-generated method stub
		
		int dd=0;
		try
		{
			 con=Dbconn.create();
			 PreparedStatement ps=con.prepareStatement("INSERT INTO ipspoof.request  VALUES(id,?,?,?,?,?,?)");
			 ps.setString(1, hr.getFilename());			
			 ps.setString(2, hr.getFilekey());			 						 	
			 ps.setString(3, hr.getFilecateg());		
			 ps.setString(4, hr.getFileprior());
			 ps.setString(5, hr.getUsername());
			 ps.setString(6, hr.getIpaddress());
			 dd=ps.executeUpdate();	
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return dd;

	}
*/
	
}
