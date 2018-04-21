package br.com.singleton;

public class Main {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();

		Singleton singleton2 = Singleton.getInstance();

		Singleton singleton3 = Singleton.getInstance();

		Singleton singleton4 = Singleton.getInstance();

		Singleton singleton5 = Singleton.getInstance();
		
		singleton5.calculaQuadrado(2, 10);
		
		singleton5.calculaCirculo(5);
		
		singleton5.calculaTriangulo(10, 5);

	}

}
