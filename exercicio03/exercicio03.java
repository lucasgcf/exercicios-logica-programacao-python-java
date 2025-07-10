package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

    /* 3) Faça um programa que leia 3 notas de um aluno em uma matéria e mostre
       na tela a sua média na disciplina. */
      
      Scanner sc = new Scanner(System.in);

      ArrayList<Double> arrayNotas = new ArrayList<>(); 
      for (int x = 0; x < 3; x++){
        
        System.out.printf("Digite a %da nota: ",x + 1);
        Double nota = sc.nextDouble();
        System.out.println("");

        arrayNotas.add(nota);
      } 
      
      Double mediaNotas = (arrayNotas.get(0) + arrayNotas.get(1) + arrayNotas.get(2)) /3;

      System.out.printf("A média do aluno é: %.2f", mediaNotas);
      sc.close();
    }
}
