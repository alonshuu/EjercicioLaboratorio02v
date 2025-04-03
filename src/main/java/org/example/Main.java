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
        imprimirMatriz(suma);

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
        System.out.println("PRINTEANDO LA MATRIZ:");
        for (int i=0; i<m.length;i++){
            for (int j=0;j<m.length;j++){
                System.out.print(m[i][j] + " ");
            } System.out.println("");
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

    public static int[][] restarMatriz(int[][] A, int[][] B){
        int[][] m = new int[2][2];
        for (int i=0; i<m.length;i++){
            for (int j=0; j< m.length;j++){
                m[i][j] = A[i][j] + B[i][j];
            }
        }

        return m;
    }

    public static int[][] multiplicarMatriz(int[][] A, int[][] B){
        int[][] m = new int[2][2];
        for (int i=0; i< m.length;i++){
            for (int j=0; j<m.length;i++){
                m[i][j] = 0;
                for (int k=0; k<m.length;k++){
                    m[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return m;
    }

    public static int calcularDeterminante(int[][] A){
        int determinante = (A[0][0] * A[1][1]) - (A[0][1] - A[1][0]);
        return determinante;
    }


    public static boolean determinarLineal(int determinante){
        if (determinante != 0){
            return true;
        } else return false;

    }

    public static int[][] calcularInversa(int[][] A){
        int verificador = calcularDeterminante(A);
        if (determinarLineal(verificador)) {
            int[][] inversa = new int[2][2];
            inversa[0][0] = A[1][1] / verificador;
            inversa[0][1] = -A[0][1] / verificador;
            inversa[1][0] = -A[1][0] / verificador;
            inversa[1][1] = A[0][0] / verificador;
            return inversa;
        } else {
            return null;
        }
    }











}