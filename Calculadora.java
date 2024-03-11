package br.com.app;

import com.mycompany.calculadora.Numero;
import com.mycompany.calculadora.Operador;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Operador operador = new Operador();
        Numero n1 = new Numero();
        Numero n2 = new Numero();
        Numero resultado = new Numero();

        System.out.print("Informe o primeiro numero: ");
        n1.setValor(input.nextInt());
        input.nextLine(); // Consumir a nova linha pendente
        System.out.print("Informe o operador (+ ou -): ");
        operador.setSinal(input.nextLine());
        System.out.print("Informe o segundo numero: ");
        n2.setValor(input.nextInt());
        
        
        if(operador.getSinal().equals("+")) {
            resultado.setValor(n1.getValor() + n2.getValor());
        } else if(operador.getSinal().equals("-")) {
            resultado.setValor(n1.getValor() - n2.getValor());
        } else if(operador.getSinal().equals("*")){
            resultado.setValor(n1.getValor() * n2.getValor());
        } else if(operador.getSinal().equals("/")){
            resultado.setValor(n1.getValor() / n2.getValor());
        }
        
        System.out.println("Esse é o resultado da operação: " + resultado.getValor());
    }
}
