package br.com.composite;

public class Developer extends Employee {

	public Developer(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void print() {
		System.out.println(super.nome + ", $" + super.salario);

	}

	@Override
	public void add(Employee employee) {
		System.out.println("Não é possível adicionar empregado subordinado do programador");

	}

	@Override
	public void remove(Employee employee) {
		System.out.println("Não é possível removers empregado subordinado do programador");

	}

}
