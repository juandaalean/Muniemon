package ProyectoMuniemon;

public class Muniemon {
	
	String nombre;
	int vida;
	int ataque;
	int defensa;
	TipoMuniemon tipoMuniemon;
	
	
	
	public Muniemon(String nombre, int vida, int ataque, int defensa, TipoMuniemon tipoMuniemon) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.tipoMuniemon = tipoMuniemon;
	}

	@Override
	public String toString() {
		return "Muniemon [nombre= " + nombre + ", vida= " + vida + ", ataque= " + ataque + ", defensa= " + defensa
				+ ", tipoMuniemon= " + tipoMuniemon + "]";
	}
	
	
	public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("Tipo: " + tipoMuniemon);
    }
	
	public void atacar(Muniemon objetivo) {
		if (this.vida <= 0) {
			System.out.println(this.nombre + " No puede atacar porque no tiene vida");
			return;
		}
		
		if (objetivo.vida <= 0) {
			System.out.println("Ha sido derrotado, no puedes atacar mas");
		}
		
		int daño = Math.max(0, this.ataque - objetivo.defensa);
		objetivo.vida -= daño;
		
		System.out.println(this.nombre + " ataca a " + objetivo.nombre + " y le hace " + daño + " puntos de daño");
		
		if (objetivo.vida <= 0) {
			System.out.println(objetivo.nombre + " ha sido derrotado");
		}
	}
}

