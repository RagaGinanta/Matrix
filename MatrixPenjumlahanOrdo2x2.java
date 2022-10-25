/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasaritmatika;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class MatrixPenjumlahanOrdo2x2 {
        public static void main(String[] args) {
        int[][] arr = new int[2][2];
        int[][] arr2 = new int[2][2];
        int[][] result = new int[2][2];
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Memasukkan Nilai Matriks 1");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                        System.out.print("Masukkan index " + "[" + i + "]" + "[" + j + "] : ");
                        arr[i][j] = input.nextInt();
                        if (i == 1 && j == 1) {
                            System.out.println("\nMasukkan Nilai Matriks 2");
                            for (int k = 0; k < arr2.length; k++) {
                                for (int l = 0; l < arr2.length; l++) {
                                    System.out.print("Masukkan index " + "[" + k + "]" + "[" + l + "] : ");
                                    arr2[k][l] = input.nextInt();
                                    result[k][l] = arr[k][l] + arr2[k][l];
                                    if (k == 1 && l == 1) {
                                        System.out.println("\nHasil Pejumlahan Matriks Ordo 2x2");
                                        for (int l2 = 0; l2 < result.length; l2++) {
                                            for (int m = 0; m < result.length; m++) {
                                                System.out.print(result[l2][m] + " ");
                                            }
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                        }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }
}

