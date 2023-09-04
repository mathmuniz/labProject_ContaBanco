package com.mtmuniz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        String agencia;
        String nameClient;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta!");
        number = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente!");
        nameClient = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo!");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nameClient + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + number + " e seu saldo " + saldo + " já está disponível para saque");



    }
}