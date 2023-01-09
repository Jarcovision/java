package resta;

public class RestaPrueba {

	public static void main(String[] args) {
		int n1, n2;
		System.out.println("Escriba dos números enteros: ");
		n1 = Integer.parseInt(System.console().readLine());
		n2 = Integer.parseInt(System.console().readLine());
		
		Resta resta = new Resta();
		int r = resta.calcularResta(n1, n2);
		System.out.println("El reultado es: " + r);
	}
}
