import java.util.*;

public class Main   {
    public static void main(String[] args)    {
        Scanner s = new Scanner(System.in);

        int score[] = new int[5];
        for (int i = 0; i < 5; i++) {
            score[i] = s.nextInt();
        }
        int factor = s.nextInt();       //read the factor seperate

        Arrays.sort(score);        //i am a genius

        /*      should work like this
        int min = score[0];
        int max = score[5];
        */

        int overall = (score[1]+score[2]+score[3])*factor;

        System.out.println(overall);
    }
}
