package edu.eduardo.primeirasemana.variaveis;

public class VariaveisMetodos {

    public static void main(String[] args) {
        String primeiroNome = "Eduardo";
        String segundoNome = "Caires";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
    }

    // MÉTODOS
    // TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
