package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import modelo.Estilo;
import modelo.Tema;

public class EstiloDAO {
	
	public static void insertarUnEstilo(Estilo t) throws SQLException{
		EnlaceJDBC enlace= new EnlaceJDBC();
		
		String sqlInsert = "INSERT INTO estilos (nombre_estilo) VALUES ('"+t.getNombreEstilo() +"')";
		if(enlace.insertar(sqlInsert)) {
			System.out.println("Se ha insertado correctamente");
		}
		
}
	public static void borradoBDEstilo(int id) throws SQLException{
		EnlaceJDBC enlace= new EnlaceJDBC();
		
		String sqlDelete = "DELETE FROM estilos WHERE id_estilo>"+id;
		enlace.insertar(sqlDelete);
}
	
	
	
	public static List<Estilo> listadoEstilo(){
		List<Estilo> listaEstilo= new ArrayList<Estilo>();
		String sqlQuery="select * from estilos";
		EnlaceJDBC enlace;
		ResultSet rs=null;
		
		
		try {
			enlace = new EnlaceJDBC();
			rs= enlace.seleccionRegistros(sqlQuery);
			while(rs.next()) {
				listaEstilo.add(new Estilo(rs.getInt(1), rs.getString(2)));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return listaEstilo;
	}
	
	
	
	
	public static void insertarEstilosFichero(Set<String> listaEstilo) throws SQLException{
		EnlaceJDBC enlace;
		enlace = new EnlaceJDBC();
		for (String t : listaEstilo) {
			String sqlInsert = "INSERT INTO estilos (nombre_estilo) VALUES ('" +t+ "')";
			enlace.insertar(sqlInsert);
		}
}
	
}
