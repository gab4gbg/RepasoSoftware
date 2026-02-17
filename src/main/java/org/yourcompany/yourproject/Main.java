package org.yourcompany.yourproject;


public class Main
{
	public static void main(String args[])
	{
		Biblioteca biblioteca = new Biblioteca();

		Bibliotecario bibliotecario = new Bibliotecario("1", "Pepe", "pepe@gmail.com", "Mañana");

		biblioteca.agregarBibliotecario(bibliotecario);

		Socio socio = new Socio("1", "Juan", "juan@gmail.com", 5);

		biblioteca.agregarSocio(socio);

		System.err.println(biblioteca.darSocios().get(0).getNombre());
	}
}
