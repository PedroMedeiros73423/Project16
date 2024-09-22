package com.mycompany.project16;
import java.util.Scanner;

public class Project16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        Double X = in.nextDouble();
        System.out.println("Informe o segundo valor: ");
        Double Y = in.nextDouble();
        System.out.println("Qual operação você deseja utilizar? " + "\\ 1 - adição \\ 2 - subtração \\ 3 - multiplicação \\ 4 - divisão");
        int controle = in.nextInt();
        switch(controle){
            case 1:
                Double resultado = X + Y;
                System.out.println("O resultado é: " + resultado);
                break;
            case 2:
                Double resultado2 = X - Y;
                System.out.println("O resultado é: " + resultado2);
                break;
            case 3:
                Double resultado3 = X * Y;
                System.out.println("O resultado é: " + resultado3);
                break;
            case 4:
                Double resultado4 = X / Y;
                System.out.println("O resultado é: " + resultado4);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}