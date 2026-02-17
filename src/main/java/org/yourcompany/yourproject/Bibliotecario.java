package org.yourcompany.yourproject;

public class Bibliotecario extends Usuario
{
    private String turno;

    public Bibliotecario(String id, String nombre, String email, String turno)
    {
        super(id, nombre, email);

        this.turno = turno;
    }

    public String getTurno()
    {
        return this.turno;
    }
}
