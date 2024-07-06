package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args) {
		DBconnector crud=new DBconnector();
		
		Connection connect=null;
		PreparedStatement pst=null;
		
		String query="update students set name=? where id=2";
		connect=crud.dbConnect();
		
		try {
			pst=connect.prepareStatement(query);
			pst.setString(1, "Anand vijay");
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
