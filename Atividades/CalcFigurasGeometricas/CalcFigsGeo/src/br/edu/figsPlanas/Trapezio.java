package br.edu.figsPlanas;

import java.util.Scanner;

public class Trapezio {
	
	public double altura;
	public double base;
	public double Base;
	public double area;
	
	public void recebeAltura() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor da altura do Trapezio:");
		altura = sc.nextDouble();
	}
	
	public void recebebase() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor da base menor do Trapezio:");
		base = sc.nextDouble();
	}
	
	public void recebeBase() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor da base maior do Trapezio:");
		Base = sc.nextDouble();
	}
	
	public void recebeAltura(double h) {
		altura = h;
	}
	
	public void recebebase(double b) {
		base = b;
	}
	
	public void recebeBase(double B) {
		Base = B;
	}

	public void retornaBase() {
		System.out.println("A base maior do Trapezio é:" + Base);
	}
	
	public void retornabase() {
		System.out.println("A base menor do Trapezio é:" + base);
	}
	
	public void retornaAltura() {
		System.out.println("A altura do Trapezio é:" + altura);
	}
	
	public void retornaArea() {
		System.out.println("A area do Trapezio é:" + area);
	}
	
	public void CalcArea() {
		
		area = (Base+ base)*altura/2;
		System.out.println("Area: " + area);
	}

	public void ListaAtributos() {
		System.out.println("A base do Trapezio é:" + base);
		System.out.println("A base maior do Trapezio é:" + Base);
		System.out.println("A altura do Trapezio é:" + altura);
		System.out.println("A area do Trapezio é:" + area);
		System.out.println("-------------------------------------");
		
	}
}
