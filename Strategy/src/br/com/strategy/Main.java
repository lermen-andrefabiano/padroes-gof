package br.com.strategy;

public class Main {

	public static void main(String[] args) {

		Vector vector = new Vector(new BubbleSort());
		vector.ordena();
		
		vector.setAlgoritmoOrdenacao(new MergeSort());
		vector.ordena();
		
		vector.setAlgoritmoOrdenacao(new QuickSort());
		vector.ordena();

	}
}
