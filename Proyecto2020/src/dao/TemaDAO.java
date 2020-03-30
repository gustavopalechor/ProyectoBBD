package dao;

import java.sql.SQLException;

import modelo.Tema;

public class TemaDAO {
	public static void insertarUnTema(Tema t) throws SQLException{
			EnlaceJDBC enlace= new EnlaceJDBC();
			
			String sqlInsert = "INSERT INTO temas (nombre_tema, autor_tema) VALUES ('"+t.getNombreTema() +"','"+
			t.getAutorTema()+"')";
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
		
		String sqlDelete = "DELETE FROM temas WHERE id_tema="+id;
		enlace.insertar(sqlDelete);
}
	
}
