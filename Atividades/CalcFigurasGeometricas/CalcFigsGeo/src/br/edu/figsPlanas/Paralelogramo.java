package br.edu.figsPlanas;

import java.util.Scanner;

public class Paralelogramo {
	public double base;
	public double altura;
	public double area;
	
	public void recebeAltura() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor da altura do Paralelogramo:");
		altura = sc.nextDouble();
	}
	
	public void recebeBase() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor da base do Paralelogramo:");
		base = sc.nextDouble();
	}
	
	public void recebeAltura(double h) {
		altura = h;
	}
	
	public void recebeBase(double b) {
		base = b;
	}

	public void retornaBase() {
		System.out.println("A base do Paralelogramo é:" + base);
	}
	
	public void retornaAltura() {
		System.out.println("A altura do Paralelogramo é:" + altura);
	}
	
	public void retornaArea() {
		System.out.println("A area do Paralelogramo é:" + area);
	}
	
	public void CalcArea () {
		area = base*altura;
		System.out.println("Area: " + area);
	}
	
	public void ListaAtributos() {
		System.out.println("A base do Paralelogramo é:" + base);
		System.out.println("A altura do Paralelogramo é:" + altura);
		System.out.println("A area do Paralelogramo é:" + area);
		System.out.println("-------------------------------------");
	}
	
}
