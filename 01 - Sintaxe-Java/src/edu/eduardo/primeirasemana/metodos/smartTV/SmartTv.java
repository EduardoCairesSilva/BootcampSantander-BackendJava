package edu.eduardo.primeirasemana.metodos.smartTV;

public class SmartTv {

    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void ligar() {
        ligada=true;
    }

    public void desligar() {
        ligada=false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Aumentando canal para: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Diminuindo canal para: " + canal);
    }

    public void escolherCanal(int canalEscolhido) {
        canal = canalEscolhido;
    }

}
