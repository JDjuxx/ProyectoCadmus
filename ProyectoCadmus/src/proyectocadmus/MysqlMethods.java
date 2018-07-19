package proyectocadmus;

import conexion.JDBC;

public class MysqlMethods {

	JDBC conexion = new JDBC();
	
	public void fetchProvince() {
		
		conexion.openConection();
		conexion.closeConection();
		
	}
	
}
