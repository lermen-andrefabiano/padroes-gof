package br.com.singleton;

public class Singleton {

	private static Singleton singleton;

	private Singleton() {
	}
	
	public void calculaQuadrado(int altura, int largura) {
		int area = altura + largura;
		System.out.println(String.format("Area do quadrado %s", area));
	}

	public void calculaCirculo(double raio) {
		double area = Math.PI * raio * raio;
		System.out.println(String.format("Area do circulo %s", area));
	}
	
	public void calculaTriangulo(double base, double altura) {
		double area = base * altura / 2;
		System.out.println(String.format("Area do triangulo %s", area));
	}
	
	public static Singleton getInstance() {
		if (singleton == null) {
			System.out.println("Instanciou Singleton");
			singleton = new Singleton();
		}
		return singleton;
	}

}
