package edu.eduardo.primeirasemana.operadores.logicos;

public class operadoresLogicos {

    public static void main(String[] args) {

        // -> && : Operador lógico "E".
        // -> || : Operador lógico "OU".

        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }
    }

}
