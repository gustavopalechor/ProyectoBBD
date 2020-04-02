package vista;

import java.util.ArrayList;
import java.util.List;

import control.EscrituraF;
import modelo.Tema;

public class ManejoFichero {
	public static void top10(List<Tema> listaTemas) {
		List<String> contenidoFichero=new ArrayList<String>();
		contenidoFichero.add("\t\t\tLISTADO DE LOS 10 PRIMEROS TEMAS");
		contenidoFichero.add("-----------------------------------------\n\n\n");
		int contador=1;
		while(contador<=10) {
			contenidoFichero.add(contador+": "+listaTemas.get(contador-1).getNombreTema());
			contador++;
		}
		EscrituraF.escribirFichero("Files/top10.txt", contenidoFichero);
	}
}
