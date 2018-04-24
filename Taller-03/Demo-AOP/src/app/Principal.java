package app;

import dominio.Circulo;
import dominio.DimensionNegativaException;
import dominio.Rectangulo;
import dominio.Triangulo;

public class Principal {

	public static void main(String[] args) {
		try {
			Circulo c = new Circulo(5);
			System.out.println("Soy un c�rculo de radio " + c.getRadio());
			Rectangulo r = new Rectangulo(7,8);
			System.out.println("Soy un rect�ngulo de ancho " + r.getAncho() + " y de alto " + r.getAlto());
			Triangulo t = new Triangulo(9,10);
			System.out.println("Soy un tri�ngulo de base " + t.getBase() + " y de altura " + t.getAltura());
			System.out.println("Soy un c�rculo de �rea " + c.area());
			System.out.println("Soy un rect�ngulo de �rea " + r.area());
			System.out.println("Soy un tri�ngulo de �rea " + t.area());
			System.out.println("Soy un c�rculo de per�metro " + c.perimetro());
			System.out.println("Soy un rect�ngulo de per�metro " + r.perimetro());
			Circulo k = new Circulo(-4);
			System.out.println("Soy un c�rculo de radio " + k.getRadio());
			System.out.println("Soy un c�rculo de �rea " + k.area());
		} catch (DimensionNegativaException e) {
			System.out.println(e.getMessage());
		}
	}
}
