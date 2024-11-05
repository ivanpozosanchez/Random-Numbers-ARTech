package aleatorios;

public class PruebaAleatorios {
	public static double aleatorios1a5() {
		return Math.random()*4+1; //Genera un número real en el intervalo [1,5)
	}
	
	public static double aleatorios1a7() {
		return aleatorios1a5()+Math.random()*2; //Genera un número real en el intervalo [1,7)
	}

	public static void main(String[] args) {
		System.out.println("Aleatorios en [1,5) :");
	    for (int i = 1; i <=5; i++) {
	    	System.out.println(aleatorios1a5());
		}
		System.out.println("Aleatorios en [1,7) :");
	    for (int i = 1; i <=5; i++) {
	    	System.out.println(aleatorios1a7());
		}

	}

}
