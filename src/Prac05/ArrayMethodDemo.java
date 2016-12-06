package Prac05;

import java.util.Scanner;

/**
 * Created by jc349598 on 6/12/16.
 */
public class ArrayMethodDemo {
    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        normal(Array);
        System.out.println(" ");
        reversed(Array);
        System.out.println(" ");
        sum(Array);
        System.out.println(" ");
        moreaverage(Array);
        System.out.println(" ");
        withlimited(Array);
    }
    public static void reversed(int[] Array){
        int i = 9;
        while (i>=0) {
            System.out.print(Array[i] + " ");
            i = i - 1;
        }
    }
    public static void normal(int[] Array){
        int i = 0;
        while (i<=9) {
            System.out.print(Array[i] + " ");
            i = i + 1;
        }
    }
    public static void sum(int[] Array){
        int i = 0;
        int total = 0;
        while (i<=9) {
            total = total + Array[i];
            i = i+1;
        }
        System.out.print(total);
    }
    public static void moreaverage(int[] Array){
        int i = 0;
        int total = 0;
        while (i<=9) {
            total = total + Array[i];
            i = i+1;
        }
        double average = total/Array.length;
        System.out.print(average);
    }
    public static void withlimited(int[] Array){
        Scanner scan = new Scanner(System.in);
        System.out.println("Limit: ");
        int input = scan.nextInt();
        int i = 0;
        while (i<=9) {
            if (Array[i] > input) {
                System.out.print(Array[i] + " ");
            }
            i = i + 1;
        }


    }
}
