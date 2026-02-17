package org.yourcompany.yourproject;

import java.util.ArrayList;

public class Libro
{
    private String isbn;
    private String titulo;
    private ArrayList<Ejemplar> ejemplares = new ArrayList<>();

    public Libro(String isbn, String titulo)
    {
        this.isbn = isbn;
        this.titulo = titulo;
    }

    public Ejemplar crearEjemplar(String cod)
    {
        Ejemplar nuevoEjemplar = new Ejemplar(cod, this);
        ejemplares.add(nuevoEjemplar);
        return nuevoEjemplar;
    }

    public String getTitulo()
    {
        return titulo;
    }
}
