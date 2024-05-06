package desafio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro parâmetro: ");
        int param1 = sc.nextInt();

        System.out.println("Insira o segundo parâmetro: ");
        int param2 = sc.nextInt();

        try {
            contar(param1, param2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Alerta: " + e.getMessage());
        }
    }

    public static void contar(int param1, int param2) throws ParametrosInvalidosException {
        if (param1 > param2) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int cont = param2 - param1;

        for (int i = 1; i <= cont; i++) {
            System.out.println(i);
        }
    }
}
