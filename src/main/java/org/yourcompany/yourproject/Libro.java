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
        for (Ejemplar ejemplar : this.ejemplares)
        {
            if(ejemplar.getCodigo().equals(cod))
            {
                throw new IllegalArgumentException("El codigo ya existe en otro ejemplar");
            }
        }

        Ejemplar nuevoEjemplar = new Ejemplar(cod, this);
        ejemplares.add(nuevoEjemplar);
        return nuevoEjemplar;
    }

    public String getTitulo()
    {
        return titulo;
    }

    @Override
    public String toString()
    {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", ejemplares=" + ejemplares +
                '}';
    }
}
