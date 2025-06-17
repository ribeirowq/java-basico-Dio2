package application;


import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }


        sc.close();
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            int contagem = parametroDois - parametroUm;
            System.out.println("Contagem:");
            for (int i = 0; i <= contagem; i++){
                System.out.println(i);
            }
        }
    }
}