package br.edu.figsPlanas;
import java.util.Scanner;
public class Triangulo {
	
	public double altura;
	public double base;
	public double area;
	
	public void recebeAltura() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor da altura do triangulo:");
		altura = sc.nextDouble();
	}
	
	public void recebeBase() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor da base do triangulo:");
		base = sc.nextDouble();
	}
	
	public void recebeAltura(double h) {
		altura = h;
	}
	
	public void recebeBase(double b) {
		base = b;
	}

	public void retornaBase() {
		System.out.println("A base do triangulo é:" + base);
	}
	
	public void retornaAltura() {
		System.out.println("A altura do triangulo é:" + altura);
	}
	
	public void retornaArea() {
		System.out.println("A area do triangulo é:" + area);
	}
	
	public void CalcArea () {
		area = (base * altura)/2;
		System.out.println("Area: " + area);
	}
	
	public void ListaAtributos() {
		System.out.println("A base do triangulo é:" + base);
		System.out.println("A altura do triangulo é:" + altura);
		System.out.println("A area do triangulo é:" + area);
		System.out.println("-------------------------------------");
		
	}
}
