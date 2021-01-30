package personas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nombre ;
		int edad ;
		char sexo ;
		double peso, altura ;
		
		//persona1
		
		System.out.println("Persona 1");
		
		System.out.print("Introduzca su nombre");
		
		nombre = sc.next() ;
		
		System.out.print("Introduzca su sexo (M/H)");
		
		sexo = sc.next().charAt(0) ;
		
		sc.nextLine() ;
		
		System.out.print("Introduzca su edad");
		
		edad = sc.nextInt() ;
		
		System.out.print("Introduzca su peso");
		
		peso = sc.nextDouble() ;
		
		System.out.print("Introduzca su altura");
		
		altura = sc.nextDouble() ;
		
		Persona p1 = new Persona(nombre,edad,sexo,peso,altura) ;
	
		//persona2

		System.out.println("Persona 2");
		
		System.out.print("Introduzca su nombre");
		
		nombre = sc.next() ;
		
		System.out.print("Introduzca su sexo (M/H)");
		
		sexo = sc.next().charAt(0) ;
		
		sc.nextLine() ;
		
		System.out.print("Introduzca su edad");
		
		edad = sc.nextInt() ;
		
		System.out.print("Introduzca su peso");
		
		peso = sc.nextDouble() ;
		
		System.out.print("Introduzca su altura");
		
		altura = sc.nextDouble() ;
		
		Persona p2 = new Persona(nombre,edad,sexo,peso,altura) ;
		
		//persona3
		System.out.println("Persona 3");
		
		System.out.print("Introduzca su nombre");
		
		nombre = sc.next() ;
		
		System.out.print("Introduzca su sexo (M/H)");
		
		sexo = sc.next().charAt(0) ;
		
		sc.nextLine() ;
		
		System.out.print("Introduzca su edad");
		
		edad = sc.nextInt() ;
		
		System.out.print("Introduzca su peso");
		
		peso = sc.nextDouble() ;
		
		System.out.print("Introduzca su altura");
		
		altura = sc.nextDouble() ;
		
		Persona p3 = new Persona(nombre,edad,sexo,peso,altura) ;
		
		//escritura p1 ;
		
		System.out.println("primera persona");
		
		if(p1.calcularIMC() == -1) {
			
			System.out.println("Estas en tu peso ideal ");
		}
		else if(p1.calcularIMC() == 0) {
			
			System.out.println("Estas por debajo del peso ideal");
		}
		else {
			
			System.out.println("Tienes sobrepeso");
		}
		
		if(p1.esMayorDeEdad() == true) {
			
			System.out.println("es mayor de edad");
		}
		else {
			
			System.out.println("Eres menor de edad");
		}
		
		System.out.println(p1.toString());
		
		//Segunda persona
		
		System.out.println("Segunda persona");
		
		if(p2.calcularIMC() == -1) {
			
			System.out.println("Estas en tu peso ideal ");
		}
		else if(p2.calcularIMC() == 0) {
			
			System.out.println("Estas por debajo del peso ideal");
		}
		else {
			
			System.out.println("Tienes sobrepeso");
		}
		
		if(p2.esMayorDeEdad() == true) {
			
			System.out.println("es mayor de edad");
		}
		else {
			
			System.out.println("Eres menor de edad");
		}
		
		System.out.println(p2.toString());
		
		//tercera persona 
		
		System.out.println("Tercera persona");
		
		if(p3.calcularIMC() == -1) {
			
			System.out.println("Estas en tu peso ideal ");
		}
		else if(p3.calcularIMC() == 0) {
			
			System.out.println("Estas por debajo del peso ideal");
		}
		else {
			
			System.out.println("Tienes sobrepeso");
		}
		
		if(p3.esMayorDeEdad() == true) {
			
			System.out.println("es mayor de edad");
		}
		else {
			
			System.out.println("Eres menor de edad");
		}
		
		System.out.println(p3.toString());
		
		sc.close();
	}
}
