package edu.eduardo.primeirasemana.metodos.smartTV;

public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();



        smartTv.ligar();
        System.out.println("Novo status -> TV ligada?: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada?: " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual?: " + smartTv.volume);


        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual?: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal atual?: " + smartTv.canal);


        // Antes de escolher o número do canal:
        System.out.println("Antes de mudar o canal: " + smartTv.canal);

        // Fazendo a escolha de canal:
        smartTv.escolherCanal(24);

        // Após a mudança de canal:
        System.out.println("Depois de mudar o canal: " + smartTv.canal);

    }

}
