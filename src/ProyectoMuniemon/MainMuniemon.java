package ProyectoMuniemon;

import java.util.Scanner;

public class MainMuniemon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcionUsuario = 0;
		
		Muniemon m1 =  new Muniemon();
		
		System.out.println("Bienvenido al menu principal de MUNIEMON :D");
		
		do {
			System.out.println("¿Que opcion deseas escoger?: ");
			System.out.println("1. Dar de alta a un Muniemon");
			System.out.println("2. Mostrar Muniemon");
			System.out.println("3. Salir del programa");
			opcionUsuario = sc.nextInt();
			sc.nextLine();
			
			if (opcionUsuario == 1) {
				System.out.println("¡Vamos a darle de alta a un Muniemon >:D!");
				System.out.println("Nombre del Muniemon: ");
				m1.setNombre(sc.nextLine());
				
				System.out.println("¿Cuanda vida va a tener el Muniemon? (Un numero entero): ");
				m1.setVida(sc.nextInt());
				
				System.out.println("¿Cuanto ataque va a tener el Muniemon? (Numero entero):");
				m1.setAtaque(sc.nextInt());
				
				System.out.println("¿Cuanta defensa va a tener el Muniemon? (Numero entero): ");
				m1.setDefensa(sc.nextInt());
				
				System.out.println("¿De que tipo va a ser el Muniemon? (1.Agua / 2.Tierra / 3.Fuego / 4.Planta)");
				int opcionTipo = sc.nextInt();
				if (opcionTipo == 1) {
					m1.setTipoMuniemon(TipoMuniemon.AGUA);
				}
				if (opcionTipo == 2) {
					m1.setTipoMuniemon(TipoMuniemon.TIERRA);
				}
				if (opcionTipo == 3) {
					m1.setTipoMuniemon(TipoMuniemon.FUEGO);
				}
				if (opcionTipo == 4) {
					m1.setTipoMuniemon(TipoMuniemon.PLANTA);
				}
			}
			
			else if (opcionUsuario == 2) {
				System.out.println(m1);
			} 
			
		} while (opcionUsuario != 3);
	}
	
}
