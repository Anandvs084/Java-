package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.SQLException;

public class Delete {
	public static void main(String[] args) {
		
	
	DBconnector crud=new DBconnector();
	
	Connection connect=null;
	PreparedStatement pst=null;
	
	String query="delete from students where id=1";
	
	
	try {
		connect=crud.dbConnect();
		pst=connect.prepareStatement(query);
					
		int i=pst.executeUpdate();
		if(i!=0) {
			System.out.println("Successfully inserted");
			}
		else {
			System.out.println("Failed to insert");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
