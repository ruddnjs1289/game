package dao;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.java.dao.DBConnection;

import model.Member;
import model.inventory;


public class inventoryDao {
	private inventoryDao() {}
	private static inventoryDao  instance= new inventoryDao();
	public static inventoryDao getinstance() {
		return instance;
	}
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
	
	public int save(inventory inventory ) {
		conn=DBConnection.getConnection();
		
		try {
			pstmt=conn.prepareStatement("insert into inventory values(?)");
			
			pstmt.setString(1, inventory.getWeapon());
			pstmt.executeUpdate();
			return 1;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return -1;
		
	}
	public static  ArrayList<inventory> mCheck(){
		
		try {
			String sql="select * from inventory";
			pstmt=conn.prepareStatement(sql);
			rs= pstmt.executeQuery();
			
			while(rs.next()) {
				String weapon=rs.getString("weapon");
				System.out.println("¹«±â"+weapon);
			}
				
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		ArrayList<inventory> into=new ArrayList<inventory>();
		return into;
	}
}
