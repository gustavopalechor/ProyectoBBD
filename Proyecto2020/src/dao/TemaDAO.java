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
}
