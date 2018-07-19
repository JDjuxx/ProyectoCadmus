package proyectocadmus;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;

import conexion.JDBC;

public class MysqlMethods {

	JDBC conexion = new JDBC();
	List<String> list = new LinkedList<String>();
	
	public void fetchProvince() {
		
		conexion.openConection();

		System.out.println("Creating statement");
		
		try {
			
			conexion.setStmt(conexion.getConn().createStatement());
			ResultSet rs = conexion.getStmt().executeQuery("SELECT estado FROM `LUGARGEO` WHERE estado IS NOT NULL;");
			System.out.println("Statement: SELECT estado FROM `LUGARGEO` WHERE estado IS NOT NULL;");
			list.add("Seleccione una opcion");
			
			while(rs.next()) {
				
				String estado = rs.getString("estado");
				list.add(estado);
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		conexion.closeConection();
		
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
}
