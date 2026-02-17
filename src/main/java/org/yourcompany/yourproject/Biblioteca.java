package org.yourcompany.yourproject;

import java.util.ArrayList;

public class Biblioteca
{
    private ArrayList<Socio> socios = new ArrayList<>();
    private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();
    private ArrayList<Libro> libros = new ArrayList<>();

    public Biblioteca() {}

    public ArrayList<Socio> darSocios()
    {
        return socios;
    }

    public ArrayList<Bibliotecario> darBibliotecarios()
    {
        return bibliotecarios;
    }

    public ArrayList<Libro> darLibros()
    {
        return libros;
    }

    public void agregarSocio(Socio socio) {
        socios.add(socio);
    }

    public void agregarBibliotecario(Bibliotecario bibliotecario)
    {
        bibliotecarios.add(bibliotecario);
    }
    public void agregarLibro(Libro libro)
    {
        libros.add(libro);
    }


}

