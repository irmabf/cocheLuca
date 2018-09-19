package control;

import model.Coche;

public class Main {

	public static void main(String[] args) {
		System.out.println("Coche creado");
		
		Coche c1 = new Coche();
		c1.setEsMetalizada(true);
		c1.setAnyoFabricacion(1990);
		c1.setMatricula("9980892OR");
		c1.setTipoSeguro("A todo riesgo");
		c1.setColor("Rojo");


	
		System.out.println(c1.toString());
	}
	
	
	
			
}
