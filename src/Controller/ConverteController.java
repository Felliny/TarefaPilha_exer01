package Controller;

import Biblioteca.PilhaInt.Pilha;

public class ConverteController {

    public ConverteController(int decimal){
        super();
    }

    public void decToBin(int decimal){
        Pilha pilhaint= new Pilha();
        StringBuffer buffer= new StringBuffer();

        pilhaint.push(decimal % 2);
        decimal/= 2;
        while (decimal > 0){
            pilhaint.push(decimal % 2);
            decimal/= 2;
        }
        while (!pilhaint.isEmpty()){
            try {
                buffer.append(pilhaint.pop());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Conversão para binario: "+ buffer);
    }
}
