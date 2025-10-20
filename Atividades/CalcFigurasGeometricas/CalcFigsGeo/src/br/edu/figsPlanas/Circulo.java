package br.edu.figsPlanas;

import java.util.Scanner;

public class Circulo {
	
	public double raio;
	public double pi =  3.14;
	public double area;
	
	public void recebeRaio() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valo do raio do circulo:");
		raio = sc.nextDouble();
	}
	
	public void recebeRaio(double r) {
		raio = r;
	}
	
	public void retornaRaio() {
		System.out.println("O raio do circulo é:" + raio);
	}
	
	public void retornaArea() {
		System.out.println("A area do circulo é:" + area);
	}
	
	public void CalcArea() {
		area = pi*(raio*raio);
		System.out.println("Area: " + area);
	}
	
	public void ListaAtributos() {
		System.out.println("O raio do circulo é" + raio);
		System.out.println("A area do circulo é:" + area);
		System.out.println("-------------------------------------");
		
	}

}
