package org.generation.italy.geometria;

import java.util.Scanner;

public class Rettangolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		FormuleRettangolo rettangolo=new FormuleRettangolo();
		
		
		System.out.println("Ciao, inserisci la base e l'altezza del rettangolo");
		//Base
		System.out.print("Base :");
		rettangolo.base=scan.nextInt();
		//Altezza
		System.out.print("Altezza :");
		rettangolo.altezza=scan.nextInt();
		//Area e Perimetro
		rettangolo.Area();
		rettangolo.Perimetro();
		/***********************************/
		System.out.println();
		FormuleRettangolo rettangolo2=new FormuleRettangolo(scan.nextInt(),scan.nextInt());
		rettangolo2.Area();
		rettangolo2.Perimetro();
		
	
	
	
	
	
		scan.close();
	}

}
