package br.com.composite;

public class Main {

	public static void main(String[] args) {
		Developer d1 = new Developer("Jose", 900);
		Developer d2 = new Developer("Pedro", 2900);
		Developer d3 = new Developer("Ricardo", 3900);

		Manager m3 = new Manager("Joao", 15000);
		Manager m2 = new Manager("Maria", 10000);
		Manager m1 = new Manager("Carlos", 5000);

		m1.add(d1);
		m1.add(d2);

		m2.add(d3);

		m3.add(m1);
		m3.add(m2);
		
		m3.print();
		
	}

}
