package test;

public class Asiento {
	String color;
	int precio;
	int registro;

	// el this se usa para asegurar que se va a cambiar el color del objeto que esta llamando al método
	void cambiarColor(String color) {
		if (color == "rojo" || color == "verde" || color == "amarillo" || color == "negro" || color == "blanco"){
			this.color = color;	
		}		
	}
}
