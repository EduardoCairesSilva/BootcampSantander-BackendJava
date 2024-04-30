package edu.eduardo.primeirasemana.operadores.relacionais;

public class operadoresRelacionais {

    public static void main(String[] args) {

        // == : Quando desejamos verificar se uma variável é IGUAL a outra.
        // != : Quando desejamos verificar se uma variável é DIFERENTE da outra.
        // > : Quando desejamos verificar se uma varável é MAIOR QUE a outra.
        // >= : Quando desejamos verificar se uma varável é MAIOR OU IGUAL a outra.
        // < : Quando desejamos verificar se uma varável é MENOR QUE a outra.
        // <= : Quando desejamos verificar se uma varável é MENOR OU IGUAL a outra.

        String nomeUm = "Eduardo";
        String nomeDois = new String("Eduardo");

        System.out.println(nomeUm.equals(nomeDois));

        int n1 = 1;
        int n2 = 2;

        boolean simNao = n1 == n2;

        System.out.println("N1 é igual N2?: " + simNao);
    }

}
