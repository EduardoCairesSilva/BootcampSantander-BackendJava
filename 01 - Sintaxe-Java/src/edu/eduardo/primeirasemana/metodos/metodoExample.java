package edu.eduardo.primeirasemana.metodos;

public class metodoExample {

    public double somar(int num1, int num2) {
        //LOGICA - FINALIDADE DO MÉTODO.
        return num1 + num2;
    }

    public void imprimir(String texto) {
        // LOGICA - FINALIDADE DO MÉTODO.
        // AQUI NÃO PRECISA DO RETURN, POIS NÃO SERÁ RETORNADO NENHUM RESULTADO.
    }

    // throws Exception: indica que o método ao ser utilizado, poderá ganhar uma excessão.
    public double dividir(int dividendo, int divisor) throws Exception {
        return dividendo / divisor;
    }

    // Esté método não pode ser visto por outras classes.
    private void metodoPrivado(){}

    //Alguns equívocos estruturais:
    public void validar() {
        // Este método deveria retornar algum valor.
        // No caso boolean (True ou false)
    }

    public void calcularEnviar() {
        // Um método deve representar uma única responsabilidade.
    }

    public void gravarCliente(String nome, String cpf, Integer telefone) {
        // Este método tem a finalidade de gravar informações de um cliente.
        // Poderia criar um objeto cliente e passar como parâmetro todas as suas informações
        // Veja o exemplo abaixo:
    }

    public void gravarCliente(String cliente) {}
    // ou
    public void gravar(String cliente){}
}
