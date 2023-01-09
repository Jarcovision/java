package bisiesto;

public class Bisiesto {
	// Devuelve TRUE si el año es bisiesto v1.
//	public boolean bisiesto1(int a) {
//		boolean bisiesto = false;
//		
//		if (a % 4 == 0) {
//			bisiesto = true;
//		}
//		if(a % 100 == 0) {
//			bisiesto = false;
//		}
//		if (a % 400 == 0) {
//			bisiesto = true;
//		}
//		
//		return bisiesto;
//	}
	
	// Devuelve TRUE si el año es bisiesto v2.
	public boolean bisiesto2(int a) {
		boolean bisiesto = false;
		
		if (a % 400 == 0) {
			if (a % 100 == 0) {
				bisiesto = false;
			} else {
				bisiesto = true;
			}
		} else {
			if (a % 4 == 0) {
				bisiesto = true;
			} else {
				bisiesto = false;
			}
		}
		
		return bisiesto;
	}
	
	// Devuelve TRUE si el año es bisiesto v3 (versión compacta).
//	public boolean bisiesto3 (int a) {
//		boolean bisiesto = (((a % 400 == 0) || (a % 100 != 0)) && (a % 4 == 0));
//		
//		return bisiesto;
//	}
}
