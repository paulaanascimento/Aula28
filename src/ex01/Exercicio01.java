package ex01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        FabricaLampada fabrica = new FabricaLampada();
        Lampada lampada;

        int opcao = 0;

        while (opcao !=1 && opcao!=2){
            System.out.println("Digite o número referente a lâmpada que deseja construir:");
            System.out.println("\t1- Incandescente \n\t2- Fluorescente");
            opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                    lampada = fabrica.construir("incandescente");
                    lampada.ligar();
                    lampada.desligar();
                    break;
                case 2:
                    lampada = fabrica.construir("fluorescente");
                    lampada.ligar();
                    lampada.desligar();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
