package ProyectoMuniemon;

public class Muniemon {
	
	String nombre;
	int vida;
	int ataque;
	int defensa;
	TipoMuniemon tipoMuniemon;
	int velocidad;
	
	
	
	public Muniemon(String nombre, int vida, int ataque, int defensa, TipoMuniemon tipoMuniemon, int velocidad) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.tipoMuniemon = tipoMuniemon;
		this.velocidad = velocidad;
	}


	@Override
	public String toString() {
		return "Muniemon [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", tipoMuniemon=" + tipoMuniemon + ", velocidad=" + velocidad + "]";
	}
	

	public void mostrarDatos() {
		System.out.println();
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Tipo: " + tipoMuniemon);
        System.out.println();
    }
	
	public void atacar(Muniemon objetivo) {	
		if (this.vida <= 0) {
			System.out.println(this.nombre + " No puede atacar porque no tiene vida");
			return;
		}
		
		if (objetivo.vida <= 0) {
			System.out.println("Ha sido derrotado, no puedes atacar mas");
		}
		
		int daño = this.ataque;
        if (this.tipoMuniemon == TipoMuniemon.PLANTA && objetivo.tipoMuniemon == TipoMuniemon.AGUA) {
            daño *= 1.5; 
        } else if (this.tipoMuniemon == TipoMuniemon.AGUA && objetivo.tipoMuniemon == TipoMuniemon.FUEGO) {
            daño *= 1.5; 
        } else if (this.tipoMuniemon == TipoMuniemon.FUEGO && objetivo.tipoMuniemon == TipoMuniemon.PLANTA) {
            daño *= 1.5; 
        }
        
		daño -= objetivo.defensa;
		if (daño < 0) {
			daño = 0;
		}
		
		objetivo.vida -= daño;
	
		System.out.println(this.nombre + " ataca a " + objetivo.nombre + " y le hace " + daño + " puntos de daño");
		
		if (objetivo.vida <= 0) {
			System.out.println(objetivo.nombre + " ha sido derrotado");
		}
	}
}

