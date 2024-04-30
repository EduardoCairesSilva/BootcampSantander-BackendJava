package edu.eduardo.primeirasemana.operadores.ternario;

public class operadorTernario {

    public static void main(String[] args) {
        int a, b;

        a = 6;
        b = 6;

        // Utilizando estrutura IF / ELSE:

        // String resultado = "";

         // if(a==b)
           // resultado = "Verdadeiro";
        // else
           // resultado = "Falso";

        // Utilizando estrutura com Operador Ternário:

        String resultado = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado);
    }
}
