package br.com.cuso.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.cuso.entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos funcionarios tem na sua empresa?");
		int qtdFunc = sc.nextInt(); // pega a quantidade de funcionarios que será adicionada
		List<Funcionario> listFunc = new ArrayList<>();// cria lista de funcionarios
		double aumento;// Variavel que sera preenchida com o total do aumento	
		Funcionario func; 

		for (int i = 0; i < qtdFunc; i++) {// cadastro dos funcionarios
			System.out.println("Digite os dados do funcionario:\nID:");
			int id = sc.nextInt();
			System.out.println("Nome:");
			sc.nextLine();
			String name = sc.next();
			System.out.println("Salario:");
			double salary = sc.nextDouble();

			func = new Funcionario(id, name, salary);// instanciando um funcionario
			listFunc.add(func);// adiciona funcionario na lista
		}

		System.out.println("Digite o ID do funcionario que vai receber aumento:");
		qtdFunc = sc.nextInt();

		Integer idSalary = posicao(listFunc, qtdFunc);// função criada para retornar o funcionario que vai receber o aumento

		if (idSalary != null) {

			System.out.println("Digite a porcentagem do aumento:");
			aumento = sc.nextDouble();

			listFunc.get(idSalary).aumentaSalario(aumento);

			System.out.printf("Salario aumentado para : %.2f%n ", listFunc.get(idSalary).getSalary());

		} else {
			System.out.println("Este funcionario não existe");
		}

		for (int i = 0; i < listFunc.size(); i++) {
			System.out.println(
					listFunc.get(i).getId() + ", " + listFunc.get(i).getName() + ", " + listFunc.get(i).getSalary());
		}

		sc.close();

	}

	public static Integer posicao(List<Funcionario> listFunc, int id) {
		for (int i = 0; i < listFunc.size(); i++) {
			if (listFunc.get(i).getId() == id) {
				return i;
			}
		}
		return null;

	}

}
