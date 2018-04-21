package br.com.composite;

public abstract class Employee {

	protected String nome;

	protected double salario;

	public Employee(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public abstract void print();

	public abstract void add(Employee employee);

	public abstract void remove(Employee employee);


}
