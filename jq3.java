import java.util.*;

public class Main   {
    public static void main(String[] args)    {
        Scanner s = new Scanner(System.in);

        int ngocEaten=0;
        int minhEaten=0;
        int n=0;    //index ngoc
        int m=0;    //index minh

        String ngocLine=s.nextLine();
        String minhLine=s.nextLine();

        while(n<ngocLine.length() && m<minhLine.length())   {
            char ngoc=ngocLine.charAt(n);
            char minh=minhLine.charAt(m);

            if (ngoc==minh)    {
                ngocEaten++;
                minhEaten++;
                n++;
                m++;
            } else if ((ngoc=='R' && minh=='G') ||
                       (ngoc=='G' && minh=='B') ||
                       (ngoc=='B' && minh=='R')) {
                            ngocEaten++;    //ngoc wins
                            m++;            //minh loses candy
            } else  {
                minhEaten++;    //minh wins
                n++;            //ngoc loses candy
            }  
        }
        ngocEaten += ngocLine.length()-n;
        minhEaten += minhLine.length()-m;
        System.out.println(ngocEaten);
        System.out.println(minhEaten);
    }
}
