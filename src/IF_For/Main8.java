package IF_For;

import java.util.Scanner;

public class Main8 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Qual a quantidade de linhas da matriz: ");
        m = sc.nextInt();
        System.out.println("Qual a quantidade de coluna da matriz? ");
        n = sc.nextInt();
        int [][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j=0; j <n; j++){
                System.out.printf("Elemento [%d,%d]", i, j);
                matriz [i][j] = sc.nextInt();
            }
        }


    }
}