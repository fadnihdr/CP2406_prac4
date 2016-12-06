import java.util.Scanner;

/**
 * Created by jc349598 on 6/12/16.
 */
public class CountByAnything {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Increment by: ");
        int input = sc.nextInt();
        int count;
        int display = 0;
        for (count = input;count<=300;count += input) {
            display = display + 1;
            if(display % 10 == 0){
                System.out.println(count + " ");
            } else System.out.print(count + " ");


    }
}
}
