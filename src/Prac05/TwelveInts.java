package Prac05;

public class TwelveInts {

    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        normal(Array);
        System.out.println(" ");
        reversed(Array);
    }
    public static void reversed(int[] Array){
        int a = 11;
        while (a>=0) {
            System.out.print(Array[a] + " ");
            a = a - 1;
        }
    }
    public static void normal(int[] Array){
        int i = 0;
        while (i<=11) {
            System.out.print(Array[i] + " ");
            i = i + 1;
        }
    }
}

