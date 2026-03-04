package Array_Matriz_vetor;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n;

        System.out.println("Qual a quantidade de linhas da matriz: ");
        m = sc.nextInt();
        System.out.println("Qual a quantidade de coluna da matriz? ");
        n = sc.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        int[][] c = new int[m][n];

        System.out.println("digite os valores da matriz a: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d] ", i, j);
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("digite os valores da matriz b: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d] ", i, j);
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Matriz C (A+B)");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", c[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}