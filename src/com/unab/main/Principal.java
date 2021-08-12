package com.unab.main;

import com.unab.logica.*;
import java.util.*;

/**
 *
 * @author Johnny Antia <Johnny.Antia at jantia.com>
 */
public class Principal
{

    private static final Scanner miTeclado = new Scanner(System.in);
    private static final List<Banco> arregloBancos = new ArrayList<>();

    public static boolean capturaBanco(String nombreBanco)
    {
        boolean valor = (nombreBanco.equals("")) ? true : false;
        return valor;
    }

    static boolean validaDocumento(double documento)
    {
        return documento != 0;
    }

    public static void imprimaClientes()
    {
        arregloBancos.stream().map((banco) ->
        {
            System.out.println("Clientes del banco: " + banco.getNombreBanco());
            return banco;
        }).forEachOrdered((banco) ->
        {
            banco.getArregloClientes().forEach((clientes) ->
            {
                System.out.println("Documento del cliente: " + clientes.getDocumento() + "\nNombre cliente: " + clientes.getNombreCliente());
            });
        });
    }

    public static void main(String[] args)
    {
        Boolean estadoBanco = true;
        Integer documento = -1;

        while (estadoBanco)
        {
            Banco banco = new Banco();

            System.out.print("Nombre del banco:");
            banco.setNombreBanco(miTeclado.nextLine());

            if (capturaBanco(banco.getNombreBanco()))
            {
                System.out.print("Nombre del banco vacío \n");
                estadoBanco = false;
            }
            else
            {
                while (validaDocumento(documento))
                {
                    Cliente cliente = new Cliente();
                    System.out.print("\nDocumento del cliente:");
                    cliente.setDocumento(miTeclado.nextInt());

                    if (validaDocumento(cliente.getDocumento()))
                    {
                        miTeclado.nextLine();
                        System.out.print("Nombre del cliente:");
                        cliente.setNombreCliente(miTeclado.nextLine());
                        banco.addClientes(cliente);

                    }
                    else
                    {
                        System.out.println("fin clientes del banco: " + banco.getNombreBanco());
                        documento = 0;
                        miTeclado.nextLine();
                    }

                }

                documento = -1;
                arregloBancos.add(banco);

            }

        }

        imprimaClientes();
    }

}
