import java.util.*;

public class Main   {
    public static void main(String[] args)    {
        Scanner s = new Scanner(System.in);

        int movs=s.nextInt();       //movements
        s.nextLine();

        boolean useArr=true;
        int gridSize=2001;      //x,y in [-1000,1000]
        int offset=1000;
        int x=0;
        int y=0;
        int revis=0;

        boolean slimyArr[][]=null;
        HashSet<String> slimyHash=null;

        if(movs<=1200) {
            //bounds safe for array
            slimyArr=new boolean[gridSize][gridSize];
            slimyArr[x+offset][y+offset]=true;
        } else  {
            useArr=false;
            slimyHash=new HashSet<>();
            slimyHash.add(x+","+y);
        }

        
        for (int i=0; i<movs; i++)   {
            String move=s.nextLine();
            char dir= move.charAt(0);
            int steps= Integer.parseInt(move.substring(1));
            int dx=0;
            int dy=0;

            switch (dir)    {
               case 'N': dy=1; break;
               case 'S': dy=-1; break;
               case 'E': dx=1; break;
               case 'W': dx=-1; break;
            }

            for (int step=0; step<steps; step++)   {
                x+=dx;
                y+=dy;

                if (useArr)    {
                    if (x+offset<0 || x+offset>=gridSize || y+offset<0 || y+offset>=gridSize)   {
                            //hashset handles bounds here
                            useArr=false;
                            slimyHash=new HashSet<>();

                            //copy all slimy squares from array to hash
                            for (int a=0; a<gridSize; a++)   {
                                for (int b=0; b<gridSize; b++)   {
                                    if (slimyArr[a][b])    {
                                        slimyHash.add((a-offset)+","+(b-offset));
                                    }
                                }
                            }
                            slimyHash.add(x+","+y);
                            continue;
                        }

                    if (slimyArr[x+offset][y+offset]) revis++;
                    else slimyArr[x+offset][y+offset]=true;
                } else {
                    String key = x+","+y;
                    if (slimyHash.contains(key)) revis++;
                    else slimyHash.add(key);
                } 
            }   
        }
        System.out.println(revis);
    }   
}
