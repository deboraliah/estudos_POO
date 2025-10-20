package br.edu.figsPlanas;

import java.util.Scanner;

public class Retangulo {

	public double base;
	public double altura;
	public double area;
	
	public void recebeAltura() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor da altura do Retangulo:");
		altura = sc.nextDouble();
	}
	
	public void recebeBase() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor da base do Retangulo:");
		base = sc.nextDouble();
	}
	
	public void recebeAltura(double h) {
		altura = h;
	}
	
	public void recebeBase(double b) {
		base = b;
	}

	public void retornaBase() {
		System.out.println("A base do Retangulo é:" + base);
	}
	
	public void retornaAltura() {
		System.out.println("A altura do Retangulo é:" + altura);
	}
	
	public void retornaArea() {
		System.out.println("A area do Retangulo é:" + area);
	}
	
	
	public void ListaAtributos() {
		System.out.println("A base do Retangulo é:" + base);
		System.out.println("A altura do Retangulo é:" + altura);
		System.out.println("A area do Retangulo é:" + area);
		System.out.println("-------------------------------------");
	}

	public void CalcArea () {
		area = base*altura;
		System.out.println("Area: " + area);
	}
}
