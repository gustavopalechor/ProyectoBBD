package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import modelo.Estilo;
import modelo.Interprete;

public class InterpreteDAO {
	public static void insertarUnInterprete(Interprete t) throws SQLException{
		EnlaceJDBC enlace= new EnlaceJDBC();
		
		String sqlInsert = "INSERT INTO interpretes (nombre_interprete) VALUES ('"+t.getNombreInterprete() +"')";
		if(enlace.insertar(sqlInsert)) {
			System.out.println("Se ha insertado correctamente");
		}
		
}
	public static void insertaInterpreteFichero(Set<String> listaInterpretes) throws SQLException{
		EnlaceJDBC enlace;
		enlace = new EnlaceJDBC();
		for (String t : listaInterpretes) {
			String sqlInsert = "INSERT INTO interpretes (nombre_interprete) VALUES ('" +t+ "')";
			enlace.insertar(sqlInsert);
		}
}
	
	public static List<Interprete> listadoInterpretes(){
		List<Interprete> listaInterpretes= new ArrayList<>();
		String sqlQuery="select * from interpretes";
		EnlaceJDBC enlace;
		ResultSet rs=null;
		
		
		try {
			enlace = new EnlaceJDBC();
			rs= enlace.seleccionRegistros(sqlQuery);
			while(rs.next()) {
				listaInterpretes.add(new Interprete(rs.getInt(1), rs.getString(2)));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return listaInterpretes;
	}
	public static void borradoBDInterprete(int id) throws SQLException{
		EnlaceJDBC enlace= new EnlaceJDBC();
		
		String sqlDelete = "DELETE FROM interpretes WHERE id_interprete>"+id;
		enlace.insertar(sqlDelete);
}
}
