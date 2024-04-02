package ProyectoMuniemon;

import java.util.Scanner;

public class MainMuniemon {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Muniemon[] muniemons = new Muniemon[2];	
		
		int opcion;
		do {
			System.out.println();
			System.out.println("Menú de Muniemon:");
			System.out.println("1. Dar de alta a un Muniemon (maximo 2)");
			System.out.println("2. Mostrar Muniemons");
            System.out.println("3. Empezar combate");
            System.out.println("4. Salir del programa");
            System.out.println("Ingrese una opción:");			
			opcion = Integer.parseInt(scanner.nextLine());
			
			
			switch (opcion) {
			
			case 1:
				System.out.println("Creando primer Muniemon...");
                muniemons[0] = altaMuniemon(scanner);
                System.out.println("Primer Muniemon creado correctamente.");
                System.out.println("Creando segundo Muniemon...");
                muniemons[1] = altaMuniemon(scanner);
                System.out.println("Segundo Muniemon creado correctamente.");
                break;
				
			case 2:
				for (Muniemon muniemon : muniemons) {
					if (muniemon != null) {
						System.out.println("Datos del muniemon");
						muniemon.mostrarDatos();
					}else {
						System.out.println("No se han creado Muniemons aun");
					}
				}
				break;
			case 3:
				if (muniemons[0] != null && muniemons[1] != null) {
					Combate combate = new Combate(muniemons[0], muniemons[1]);
					Muniemon ganador = combate.empezarCombate();
					System.out.println("El Muniemon ganador es:" + ganador.nombre);
				}else {
					System.out.println("Debes crear ambos Muniemones antes de empezar a combatir");
				}
				break;
			case 4:
				System.out.println("Saliendo del programa...");
				break;
				
			default:
				System.out.println("Opción inválida. Intente de nuevo.");
				break;
			}
		} while (opcion != 4);
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

	        System.out.println("Ingrese el tipo del Muniemon (AGUA, FUEGO, PLANTA):");
	        String tipoString = scanner.nextLine();
	        TipoMuniemon tipoMuniemon = TipoMuniemon.valueOf(tipoString.toUpperCase());
	        
	        System.out.println("Ingrese la velocidad del Muniemon:");
	        int velocidad = Integer.parseInt(scanner.nextLine());			

	        return new Muniemon(nombre, vida, ataque, defensa, tipoMuniemon, velocidad);
	    }
}
