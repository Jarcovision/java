package positivoYnegativo;

public class PositivoNegativoPrueba {

	public static void main(String[] args) {
		PositivoNegativoPrueba posneg = new PositivoNegativo();
		int n = posneg.leerPorTeclado();
		posneg.comprobarNumero(n);
	}
}
