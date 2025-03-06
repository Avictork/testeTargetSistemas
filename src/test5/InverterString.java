package test5;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string para inverter: ");
        String input = scanner.nextLine();

        String inverted = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            inverted += input.charAt(i);  }

        System.out.println("String invertida: " + inverted);

        scanner.close();
    }
}