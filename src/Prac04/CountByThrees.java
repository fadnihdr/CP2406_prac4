package Prac04;

/**
 * Created by jc349598 on 6/12/16.
 */
public class CountByThrees {
    public static void main(String[] args)
    {
        int count;
        for (count = 3;count<=300;count += 3) {
            if (count % 30 == 0)
            {
                System.out.println(count);
            }
            else System.out.print(count + " ");

    }

    }
}
