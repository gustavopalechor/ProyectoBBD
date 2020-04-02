package control;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dao.EstiloDAO;
import dao.InterpreteDAO;
import dao.TemaDAO;
import modelo.Estilo;
import modelo.Tema;
import vista.Escritura;
import vista.Lectura;
import vista.ManejoFichero;

public class IndexProyecto2020 {
	static List<Tema> listaTemas= new ArrayList<>();
	static Set<String> listaEstilos= new HashSet<String>();
	static Set<String> listaInterpretes= new HashSet<String>();
	
	public static void generarListaTemas() {

		List<String> lineasFichero;
		lineasFichero= LecturaFi.lecturaFichero("Files/temas.csv");
		lineasFichero.remove(0);
		for(String s: lineasFichero) {
			String[] fila=s.split(";");
			if(fila[1].contains("\"")) {
				fila[1]=fila[1].replace("\"", "");
			}
			if(fila[1].contains("'")) {
				fila[1]=fila[1].replace("'", "\\'");
			}
			listaTemas.add(new Tema(0,fila[1], null));
		}
	}
	
	public static void generarListaTemasEstilos() {
		List<String> lineasFichero;
		lineasFichero = LecturaFi.lecturaFichero("Files/temas.csv");
		lineasFichero.remove(0);
		for (String s : lineasFichero) {
			// Separacion por líneas
			String[] fila = s.split(";");
			// reemplazar caracteres de titulo
			if (fila[1].contains("\"")) {
				fila[1] = fila[1].replace("\"", "");
			}
			if (fila[1].contains("'")) {
				fila[1] = fila[1].replace("'", "\\'");
			}
			listaTemas.add(new Tema(0, fila[1], null));
			// Tratamientos de estilos
			String[] estilosFila = fila[7].split(",");
			
			for (String estilo : estilosFila) {
				if (estilo.contains("\"")) {
					estilo = estilo.replace("\"", "");
				}
				if (estilo.contains("'")) {
					estilo = estilo.replace("'", "\\'");
				}
				listaEstilos.add(estilo);
			}
			
			
		}
		//Escritura.mostrarString(listaEstilos);
	}

	
	public static void generaraListaTemasEstilosInterpretes() {
		List<String> lineasFichero;
		lineasFichero = LecturaFi.lecturaFichero("Files/temas.csv");
		lineasFichero.remove(0);
		for (String s : lineasFichero) {
			// Separacion por líneas
			String[] fila = s.split(";");
			// reemplazar caracteres de titulo
			if (fila[1].contains("\"")) {
				fila[1] = fila[1].replace("\"", "");
			}
			if (fila[1].contains("'")) {
				fila[1] = fila[1].replace("'", "\\'");
			}
			listaTemas.add(new Tema(0, fila[1], null));
			// Tratamientos de estilos
			
			
			String[] estilosFila = fila[7].split(",");
			for (String estilo : estilosFila) {
				if (estilo.contains("\"")) {
					estilo = estilo.replace("\"", "");
				}
				if (estilo.contains("'")) {
					estilo = estilo.replace("'", "\\'");
				}
				listaEstilos.add(estilo);
			}
			
			//Insercion de Intérpretes
			if(fila[2].contains("\"")) {
				fila[2]= fila[2].replace("\"", "");
			}
			if(fila[2].contains("'")) {
				fila[2]=fila[2].replace("'", "\\'");
			}
			
			listaInterpretes.add(fila[2]);
			
		}
		//Escritura.mostrarString(listaEstilos);
	}
	
	public static void main(String[] args) {
		//Insertar un dato en la tabla Temas de la base de datos
		//Lectura in= new Lectura();
		
		try {
			/* ---------------- Temas ----------------------*/
			//TemaDAO.insertarUnTemaSinAuto(in.leerTema());
			//TemaDAO.borradoBD(7);
			//generarListaTemas();
			//TemaDAO.insertarUnTemasFichero(listaTemas);
			//Escritura.mostrarPantalla(TemaDAO.listadoTemas());
			//List<Tema> listaTemas=TemaDAO.listadoTemas();
			//ManejoFichero.top10(listaTemas);
			//listaTemas.sort(null);
			//Escritura.mostrarPantalla(listaTemas);
			
			/* ---------------- Estilos ----------------------*/
			//generarListaTemasEstilos();
			//Escritura.mostrarString(listaEstilos);
			//EstiloDAO.borradoBDEstilo(1);
			//EstiloDAO.insertarUnEstilo(new Estilo(1,"Rock"));
			
			/* EstiloDAO.insertarEstilosFichero(listaEstilos); EstiloDAO.listadoEstilo(); */
			 
			//Escritura.mostrarEstilo(EstiloDAO.listadoEstilo());
			
			/* ---------------- Interpretees ----------------------*/
			generaraListaTemasEstilosInterpretes();
			//InterpreteDAO.borradoBDInterprete(0);
			InterpreteDAO.insertaInterpreteFichero(listaInterpretes);
			Escritura.mostrarInterprete(InterpreteDAO.listadoInterpretes());
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
