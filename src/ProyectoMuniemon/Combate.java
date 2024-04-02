package ProyectoMuniemon;

import java.util.Scanner;

public class Combate {
	
	Scanner sc = new Scanner(System.in);
	
	Muniemon muniemon1;
	Muniemon muniemon2;
	
	
	public Combate(Muniemon muniemon1, Muniemon muniemon2) {
		super();
		this.muniemon1 = muniemon1;
		this.muniemon2 = muniemon2;
	}
	
	public Muniemon empezarCombate() {
		Muniemon primero;
		Muniemon segundo;
		
		if (muniemon1.velocidad > muniemon2.velocidad) {
			primero = muniemon1;
            segundo = muniemon2;
		}else {
			primero = muniemon2;
            segundo = muniemon1;
		}
		
		System.out.println(primero.nombre + "Empieza atacando");
		
		while (true) {
            primero.atacar(segundo);
            if (segundo.vida <= 0) {
                return primero;
            }

            segundo.atacar(primero);
            if (primero.vida <= 0) {
                return segundo;
            }
            
            System.out.println("Pulse enter para continuar...");
            sc.nextLine();
		}
	}	
}
