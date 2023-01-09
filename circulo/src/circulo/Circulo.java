package circulo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/** La clase Circulo calcula y muestra el área y el perímetro
 * de una circunferencia. El radio se lee por consola.
 */

public class Circulo {

	public static void main(String[] args) {
		double radio = 0;
		double area, circunferencia;
		radio = leerTeclado();
		area = calcularArea(radio);
		circunferencia = calcularCircunferencia(radio);
		mostrarResultado(radio, area, circunferencia);
		
	}

	// Calcular área.
	public static double calcularArea(double r) {
		double a;
		a = Math.PI * (r * r);
		return a;
	}
	
	// Calcular el perímetro.
	public static double calcularCircunferencia(double r) {
		double c;
		c = 2 * Math.PI * r;
		return c;
	}
	
	// Lee el radio del círculo por teclado.
	public static double leerTeclado() {
		double radio = 0;
		BufferedReader buffer = new
				BufferedReader(new InputStreamReader(System.in));
		System.out.printf("Escribe el valor del radio: ");
		try {
			radio = Double.parseDouble(buffer.readLine());
		}
		catch (Exception e) {
			System.out.println("Error de lectura de datos");
		}
		return radio;
	}

	// Mostrar resultado.
	public static void mostrarResultado (double r, double area,
										 double circunferencia) {
		System.out.println("Radio: " + r);
		System.out.println("Área: " + area);
		System.out.format("Circunferencia: %.2f\n", circunferencia); 
	}
	
}
