package control;

import java.sql.SQLException;

import dao.TemaDAO;
import vista.Lectura;

public class IndexProyecto2020 {

	public static void main(String[] args) {
		//Insertar un dato en la tabla Temas de la base de datos
		Lectura in= new Lectura();
		
		try {
			//TemaDAO.insertarUnTemaSinAuto(in.leerTema());
			TemaDAO.borradoBD(7);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
