package test;

public class Auto {

	String modelo;
	int precio;
	// estructura de un arreglo: <type>[] variable_name    ->     int[ ] misNumeros;
	// Es un arreglo vacio porque para crearlo es en el main
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int cantidad = 0;
		for (int posicion = 0; posicion<asientos.length ; posicion ++) {
			// Solo para que cuente los objetos, no suma esos espacios vacios
			if(asientos[posicion] != null) {
				cantidad ++;
			}
		}
		return cantidad; 
	}
	
	String verificarIntegridad() {
		// los metodos de instancia solo son usados por los objetos
		// nombre_objeto.registro(atributo) = nombre_objeto.motor(quien tambien es un objeto).registro(atributo del motor)
		if (this.registro == this.motor.registro) {
			// Si esto es verdad entramos a verificar aqui
			// ahora, tenemos una lista que contiene objetos de la clase asientos
			for (int posicion = 0; posicion<asientos.length ; posicion ++) {
				// cuando se crea una lista, todo lo que contiene en cada casilla es null
				// luego, necesitamos descartar que la casilla que vamos a evualar sea un objeto
				// De esta forma nos evitamos tener un error
				if(asientos[posicion] != null) {
					if(asientos[posicion].registro != this.registro) {
						return("Las piezas no son originales");
					
					} else {
							return("Auto original");
					}
				}
			}
		}
		// Como nunca entro al if porque no fue cierto esa verdad, termina el if
		// Y con esto terminamos el metodo, quien retorna un string
		return ("Las piezas no son originales");
	}
}

