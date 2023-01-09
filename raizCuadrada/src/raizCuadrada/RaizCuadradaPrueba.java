package raizCuadrada;

public class RaizCuadradaPrueba {

	public static void main(String[] args) {
		 RaizCuadradaPrueba rc = new RaizCuadrada;
		 System.out.println("Introduzca un número: ");
		 double n = Double.parseDouble(System.console().readLine());
		 double raiz = rc.calcularRaizCuadrada(n);
		 System.out.println("La raíz cuadrada de " + n + " es " + raiz);
	}
}
