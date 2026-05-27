import java.util.*;

public class Main   {
    public static void main(String[] args)    {
        Scanner s = new Scanner(System.in);

        int B = s.nextInt();    //number of tickets besa wants to buy
        int T = s.nextInt();    //total number of tickets for concert
        int P = s.nextInt();    //number of tickets others have purchased

        int determinant = T-(B+P);

        if (determinant < 0) {
            System.out.println("N");
        } else if (determinant < T) {
            System.out.println("Y " + determinant);
        }
    }
}
