import java.util.*;

public class Main   {
    public static void main(String[] args)    {
        Scanner s = new Scanner(System.in);

        int B = s.nextInt();
        int T = s.nextInt(); 
        int P = s.nextInt();

        int determinant = T-(B+P);

        if (determinant < 0) {
            System.out.println("N");
        } else if (determinant < T) {
            System.out.println("Y " + determinant);
        }
    }
}
