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

		Libro libro = new Libro("123","como robarse una empanada");

		biblioteca.agregarLibro(libro);

		libro.crearEjemplar("e1");

		System.err.println(biblioteca.darSocios().get(0).getNombre());
		IO.println(biblioteca.darLibros());
		IO.println(biblioteca.darBibliotecarios().get(0).getNombre());
	}
}
