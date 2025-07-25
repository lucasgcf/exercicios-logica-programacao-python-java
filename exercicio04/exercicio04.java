package exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04{

  public static void main(String[] args) {
    //   4) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
    //      sua terça parte.
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    Double number = sc.nextDouble();

    Double numberThirdPart = number / 3.0f;
    Double numberDouble = number * 2;

    System.out.println("");
    System.out.printf("O dobro de %.2f é %.2f, sua terça parte é %.2f.", 
    number, numberDouble, numberThirdPart);

    sc.close();
  }
}