package Ejercicios;

public class PrecioDeUnoTerreno {

	public static void main(String[]args) {
	
		//Declaracion de Variables
		double base = 50, altura = 35, area =0, precioTotal =0;
		
		
		String nom = "El area es: ";
		String Prefinal = "El precio total es: ";
		
		//Calculos
		
		area = base * altura;
		
		precioTotal = 150 * area;
		
		//Mostrar datos
		
		System.out.println(nom + area);
		System.out.println(Prefinal + precioTotal);
		
	}	
}
