package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Tema;

public class TemaDAO {
	public static void insertarUnTema(Tema t) throws SQLException{
			EnlaceJDBC enlace= new EnlaceJDBC();
			
			String sqlInsert = "INSERT INTO temas (nombre_tema, autor_tema) VALUES ('"+t.getNombreTema() +"','"+
			t.getAutorTema()+"')";
			enlace.insertar(sqlInsert);
	}
	public static void insertarTemaNombre(Tema t) throws SQLException{
		EnlaceJDBC enlace= new EnlaceJDBC();
		
		String sqlInsert = "INSERT INTO temas (nombre_tema) VALUES ('"+t.getNombreTema() +"','"+"')";
		enlace.insertar(sqlInsert);
}
	public static void insertarUnTemaSinAuto(Tema t) throws SQLException{
		EnlaceJDBC enlace= new EnlaceJDBC();
		
		String sqlInsert = "INSERT INTO temas (id_tema, nombre_tema, autor_tema) VALUES (7,'"+t.getNombreTema() +"','"+
		t.getAutorTema()+"')";
		enlace.insertar(sqlInsert);
}
	
	public static void borradoBD(int id) throws SQLException{
		EnlaceJDBC enlace= new EnlaceJDBC();
		
		String sqlDelete = "DELETE FROM temas WHERE id_tema>"+id;
		enlace.insertar(sqlDelete);
}
	public static void insertarUnTemasFichero(List<Tema> listaTemas) throws SQLException{
		EnlaceJDBC enlace;
		enlace = new EnlaceJDBC();
		for (Tema t : listaTemas) {
			String sqlInsert = "INSERT INTO temas (nombre_tema, autor_tema) VALUES ('" + t.getNombreTema() + "','"
					+ "')";
			enlace.insertar(sqlInsert);
		}
}
	public static List<Tema> listadoTemas(){
		List<Tema> listaTemas= new ArrayList<Tema>();
		String sqlQuery="select id_tema, nombre_tema, autor_tema from temas";
		EnlaceJDBC enlace;
		ResultSet rs=null;
		
		
		try {
			enlace = new EnlaceJDBC();
			rs= enlace.seleccionRegistros(sqlQuery);
			while(rs.next()) {
				listaTemas.add(new Tema(rs.getInt(1), rs.getString(2), rs.getString(3)));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return listaTemas;
	}
	
}
