package exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
     // 05) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
     //     mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
     //     sabendo que cada litro de tinta pinta uma área de 2metros quadrados.

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a altura da parede(metros): ");
        Double wallHeight = sc.nextDouble();
        System.out.println("");

        System.out.println("Digite a largura da parede(metros): ");
        Double wallWidth = sc.nextDouble();
        System.out.println("");

        Double wallArea = wallWidth * wallHeight;

        Double quantityPaint = wallArea / 2.0;

        System.out.printf("A área a ser pintada é de %.2f(m²); a quantidade de tinta necessária é %.2f litros.", 
        wallArea, quantityPaint);

        sc.close();
    
    }
    
}
