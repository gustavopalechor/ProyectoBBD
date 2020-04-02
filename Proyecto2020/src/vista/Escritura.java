package vista;

import java.util.List;
import java.util.Set;

import modelo.Estilo;
import modelo.Interprete;
import modelo.Tema;

public class Escritura {
	public static void mostrarPantalla(List<Tema> listaT) {
		for(Tema t:listaT) {
			System.out.println(t.toString());
		}
	}

	
	  public static void mostrarEstilo(List<Estilo> lista) {
		  for(Estilo t:lista) {
	  System.out.println(t.toString());
	  } }
	 
	public static void mostrarString(Set<String> lista) {
		for(String t:lista) {
			System.out.println(t);
		}
	}
	
	public static void mostrarInterprete(List<Interprete>listaI) {
		for(Interprete i: listaI) {
			System.out.println(i.toString());
		}
	}
}
