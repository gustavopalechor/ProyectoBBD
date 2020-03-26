package vista;

import java.util.Scanner;

import modelo.Tema;

public class Lectura {
	public Tema leerTema() {
		Scanner scan= new Scanner(System.in);
		Tema t= new Tema();
		System.out.println("Dime un titulo de tema:");
		t.setNombreTema(scan.nextLine());
		System.out.println("Dime el autor del tema:");
		t.setAutorTema(scan.nextLine());
		scan.close();
		return t;
	}
}
