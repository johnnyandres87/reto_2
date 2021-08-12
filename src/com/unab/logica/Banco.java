package com.unab.logica;

import java.util.*;

/**
 *
 * @author Johnny Antia <Johnny.Antia at jantia.com>
 */
public class Banco
{

    private String nombreBanco;
    private final List<Cliente> arregloClientes;

    public Banco()
    {
        this.arregloClientes = new ArrayList<>();
    }

    public String getNombreBanco()
    {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco)
    {
        this.nombreBanco = nombreBanco;
    }

    public List<Cliente> getArregloClientes()
    {
        return arregloClientes;
    }

    public void addClientes(Cliente cliente)
    {
        arregloClientes.add(cliente);
    }

}
