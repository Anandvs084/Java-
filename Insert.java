package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] args) {
		DBconnector crud=new DBconnector();
		
		Connection connect=null;
		PreparedStatement pst=null;
		
		String query="insert into students(name,mail_id,ph_number) values(?,?,?)";
		connect=crud.dbConnect();
		
		try {
			pst=connect.prepareStatement(query);
			pst.setString(1,"Nandu");
			pst.setString(2,"nandu@gmail.com");
			pst.setString(3,"871234431");			
			int i=pst.executeUpdate();
			if(i!=0) {
				System.out.println("Successfully inserted");
				}
			else {
				System.out.println("Failed to insert");
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
	}


