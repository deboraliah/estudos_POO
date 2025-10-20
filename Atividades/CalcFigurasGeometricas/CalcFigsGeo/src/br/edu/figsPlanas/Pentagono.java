package br.edu.figsPlanas;

import java.util.Scanner;

public class Pentagono {
	
	public double lado;
	public double area;
	
	public void recebeLado() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor do lado do pentagono:");
		lado = sc.nextDouble();
	}
	
	public void recebeAltura(double l) {
		lado = l;
	}
	
	public void retornaLado() {
		System.out.println("O lado do pentagono é:" + lado);
	}
	
	public void retornaArea() {
		System.out.println("A area do pentagono é:" + area);
	}
	
	public void ListaAtributos() {
		System.out.println("O lado do pentagono é:" + lado);
		System.out.println("A area do pentagono é:" + area);
		System.out.println("-------------------------------------");
	}
	
	public void CalcArea () {
		
	area = (5 * Math.pow(lado, 2)) / (4 * Math.tan(Math.PI / 5));
	System.out.println("Area: " + area);
	}
}
