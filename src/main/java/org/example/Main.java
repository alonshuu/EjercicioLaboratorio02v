package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] matriz = crearMatriz();
        imprimirMatriz(matriz);

    }




    public static void llenarMatriz(int [][]m){
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m.length; j++){
                System.out.println("Inserte el valor para la posicion ["+i+"]["+j+"]");
                m[i][j] = obtenerNumero();
            }
        }

    }


    public static int[][] crearMatriz(){
        int[][] matrix = new int[2][2];
        llenarMatriz(matrix);

        return matrix;
    }

    public static int obtenerNumero(){
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            System.out.println("Número inválido, por favor ingresar un numero entero.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void imprimirMatriz(int m[][]){
        for (int i=0; i<m.length;i++){
            for (int j=0;j<m.length;j++){
                System.out.println(m[i][j]);
            }
        }
    }



}