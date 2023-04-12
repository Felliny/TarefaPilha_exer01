package View;

import Controller.ConverteController;

public class Main {
    public static void main(String[] args) {
        int decimal= (int) (Math.random()*1000)+ 1;
        System.out.println("Número escolhido: "+ decimal);
        ConverteController converte= new ConverteController(decimal);
        converte.decToBin(decimal);
    }
}
