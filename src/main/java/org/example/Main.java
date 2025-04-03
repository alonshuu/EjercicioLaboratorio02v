package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] matriz1 = crearMatriz();
        int[][] matriz2 = crearMatriz();
        imprimirMatriz(matriz1);
        imprimirMatriz(matriz2);
        int[][] suma = sumarMatriz(matriz1, matriz2);



    }



    // INICIO DE METODOS DE CREACION DE MATRICES

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

    // FIN DE Metodos de creacion de matrices y validacion
    // INICIO DE OPERACIONES ARITMETICAS

    public static int[][] sumarMatriz(int[][] A, int[][] B){
        int[][] m = new int[2][2];
        for (int i =0; i<m.length;i++){
            for (int j=0; j< m.length;j++){
                m[i][j] = A[i][j] + B[i][j];
            }
        }
        return m;
    }







}