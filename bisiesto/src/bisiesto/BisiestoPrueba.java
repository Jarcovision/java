package bisiesto;

public class BisiestoPrueba {

	public static void main(String[] args) {
		int n;
		System.out.print("Escriba un año: ");
		n = Integer.parseInt(System.console().readLine());
		
		Bisiesto bis = new Bisiesto();
		if ( bis.bisiesto2(n)) {
			 System.out.println("El año " + n + " SÍ es bisiesto");
		} else {
			 System.out.println("El año " + n + " NO es bisiesto");
		}
	}
}
