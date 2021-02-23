package br.com.cuso.entities;

public class Funcionario {
	private int id;
	private String name;
	private double salary;

	public Funcionario(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void aumentaSalario(double aumento) {
		this.salary += this.salary * aumento / 100;
	}

}
