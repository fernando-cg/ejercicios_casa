package T8nextlevel;

import java.util.Scanner;

public class ejercicio09 {

	static void maquina(){
		
		int[][] array = new int[3][3] ;
		
		for(int x = 0 ; x < array.length ; x++){
			
			for(int y = 0 ; y < array[2].length ; y++) {
				
			}
		}
		
	}
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in) ;
		
		int menu ;
		
		System.out.println("________________________________");
		System.out.println("|Bienvenido a este tres en raya|");
		System.out.println("--------------------------------");
		
		do {
			
			System.out.println("Por favor elija su modo de juego: ");
			System.out.println("1:jugar contra la máquina") ;
			System.out.println("2:jugar contra un oponente") ;
			System.out.print("Modo de juego:");
			menu = teclado.nextInt() ;
			
		}while(menu != 1 && menu != 2) ;
		
		switch (menu) {
		case 1:
			
			break;
			
		case 2:
			
			break;
		}

		teclado.close();
	}

}
