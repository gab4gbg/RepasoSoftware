package org.yourcompany.yourproject;


public class Repaso
{
	public static void main(String args[])
	{
		Bibliotecario bibliotecario = new Bibliotecario("1", "Pepe", "pepe@gmail.com", "Mañana");
		IO.println(bibliotecario.getEmail());

		Socio socio = new Socio("1", "Juan", "juan@gmail.com", 5);
		socio.registrarPrestamos(2);
	}
}
