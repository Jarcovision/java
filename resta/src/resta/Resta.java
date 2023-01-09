package resta;

public class Resta {
	public int calcularResta(int a, int b) {
		int resta = 0;
		if (a > b) {
			resta = a - b;
		} else {
			resta = b - a;
		}
		return resta;
	}
}
