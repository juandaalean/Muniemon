package ProyectoMuniemon;

import java.util.Scanner;

public class MainMuniemon {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Muniemon muniemon1 = null;
		Muniemon muniemon2 = null;
		
		int opcion;
		do {
			System.out.println();
			System.out.println("Menú de Muniemon:");
			System.out.println("1. Dar de alta al primer Muniemon");
			System.out.println("2. Dar de alta al segundo Muniemon");
			System.out.println("3. Mostrar primer Muniemon");
			System.out.println("4. Mostrar segundo Muniemon");
			System.out.println("5. Atacar primer Muniemon a segundo Muniemon");
			System.out.println("6. Atacar segundo Muniemon a primer Muniemon");
			System.out.println("7. Salir del programa");
			
			opcion = Integer.parseInt(scanner.nextLine());
			
			
			switch (opcion) {
			
			case 1:
				muniemon1 = altaMuniemon(scanner);
				System.out.println("Muniemon 1 creado correctamente.");
				break;
				
			case 2:
				muniemon2 = altaMuniemon(scanner);
				System.out.println("Muniemon 2 creado correctamente.");
				break;
				
			case 3:
				mostrarMuniemon(muniemon1);
				break;
				
			case 4:
				mostrarMuniemon(muniemon2);
				break;
				
			case 5: 
				if (muniemon1 != null && muniemon2 != null) {
					muniemon1.atacar(muniemon2);
				}else {
					System.out.println("Debes crear ambos Muniemones antes de atacar");
				}
				break;
				
			case 6: 
				if (muniemon1 != null && muniemon2 != null) {
					muniemon1.atacar(muniemon2);
				}else {
					System.out.println("Debes crear ambos Muniemones antes de atacar");
				}
				break;
			default:
				System.out.println("Opción inválida. Intente de nuevo.");
				break;
			}
		} while (opcion != 7);
	}

		public static Muniemon altaMuniemon(Scanner scanner) {
	        System.out.println("Ingrese el nombre del Muniemon:");
	        String nombre = scanner.nextLine();

	        System.out.println("Ingrese la vida del Muniemon:");
	        int vida = Integer.parseInt(scanner.nextLine());

	        System.out.println("Ingrese el ataque del Muniemon:");
	        int ataque = Integer.parseInt(scanner.nextLine());

	        System.out.println("Ingrese la defensa del Muniemon:");
	        int defensa = Integer.parseInt(scanner.nextLine());

	        System.out.println("Ingrese el tipo del Muniemon (AGUA, TIERRA, FUEGO, PLANTA):");
	        String tipoString = scanner.nextLine();
	        TipoMuniemon tipoMuniemon = TipoMuniemon.valueOf(tipoString.toUpperCase());

	        return new Muniemon(nombre, vida, ataque, defensa, tipoMuniemon);
	    }
		
		public static void mostrarMuniemon(Muniemon muniemon) {
			if (muniemon != null) {
				System.out.println("Datos del Muniemon:");
				muniemon.mostrarDatos();
			}
			else {
				System.out.println("No se ha creado el Muniemon aun");
			}
		}
}
