package br.edu.Principal;
import br.edu.figsPlanas.*;
public class Principal {

	public static void main(String[] args) {
		
	    System.out.println("    Triangulo");
	    System.out.println();
		Triangulo obj1 = new Triangulo();
		
		obj1.recebeBase();
		obj1.recebeAltura();
		obj1.CalcArea();
		obj1.ListaAtributos();
		
		System.out.println("    Quadrado");
		System.out.println();
		Quadrado obj2 = new Quadrado();
		
		obj2.recebeLado();
		obj2.CalcArea();
		obj2.ListaAtributos();
		
		System.out.println("    Circulo");
		System.out.println();
		Circulo obj3 = new Circulo();
		
		obj3.recebeRaio();
		obj3.CalcArea();
		obj3.ListaAtributos();
		 
		System.out.println("    Losango");
		System.out.println();
		Losango obj4 = new Losango();
		
		obj4.recebeDiagonal();
		obj4.recebediagonal();
		obj4.CalcArea();
		obj4.ListaAtributos();
		
		System.out.println("      Hexagono");
		System.out.println();
		Hexagono obj5 = new Hexagono();
		
		obj5.recebeLado();
		obj5.CalcArea();
		obj5.ListaAtributos();
		
		System.out.println("      Pentagono");
		System.out.println();
		Pentagono obj6 = new Pentagono();
		
		obj6.recebeLado();
		obj6.CalcArea();
		obj6.ListaAtributos();
		
		System.out.println("      Retangulo");
		System.out.println();
		Retangulo obj7 = new Retangulo();
		
		obj7.recebeBase();
		obj7.recebeAltura();
		obj7.CalcArea();
		obj7.ListaAtributos();
		
		System.out.println("      Trapezio");
		System.out.println();
		Trapezio obj8 = new Trapezio();
		
		obj8.recebeBase();
		obj8.recebebase();
		obj8.recebeAltura();
		obj8.CalcArea();
		obj8.ListaAtributos();
		
		System.out.println("      Paralelogramo");
		System.out.println();
		Paralelogramo obj9 = new Paralelogramo();
		
		obj9.recebeBase();
		obj9.recebeAltura();
		obj9.CalcArea();
		obj9.ListaAtributos();
	}

}