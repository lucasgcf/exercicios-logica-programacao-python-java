package exercicio02;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

/* 2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de
      boas-vindas para ela*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        String  nome = sc.nextLine();

        System.out.printf("Seja Bem-vindo(a), %s!", nome);

        sc.close();

    }
}
