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
        return null;
    }

    public String getTitulo()
    {
        return titulo;
    }
}
