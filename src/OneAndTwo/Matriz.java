package OneAndTwo;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        
        int matrizA[][] = new int[2][2];
        int matrizB[][] = new int [2][2];
        int matrizC[][] = new int [2][2];
        int soma = 0;
        int subtracao = 0;
        
        System.out.println("matriz 1");
                
        for (int i=0; i<2; ++i){
            for (int j=0; j<2; ++j){
             System.out.printf("A[%d][%d]: \n",i,j);
                matrizA[i][j] = entrada.nextInt();
                }        
        }
            System.out.println("matriz 2");
             
        for (int i=0; i<2; ++i){
            for (int j=0; j<2; ++j){
                System.out.printf("B[%d][%d]: \n",i,j);
                matrizB[i][j] = entrada.nextInt();
                }             
        } 
            System.out.printf("SOMA DAS MATRIZ A e B!\n");
     
        for (int i=0; i<2; ++i){
            for (int j=0; j<2; ++j){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.printf("%d\t",matrizC[i][j]);  
               } 
                System.out.printf("\n");
        }
           System.out.println("\nDIFERENÇA DAS MATRIZ A e B!");
        for (int i=0; i<2; ++i){
            for (int j=0; j<2; ++j){
                matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
                System.out.printf("%d\t",matrizC[i][j]);    
            }  
            System.out.printf("\n");       
        }
    }
}
