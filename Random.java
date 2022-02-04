import java.util.Arrays;
import java.util.Scanner;

public class Random {
    
    public static void main(String[] args) {
        String u = "pqdehxyzifgjklabrstcmnouvw";
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char arrl[] = new char[n];
        int l = u.length();

        Random r = new Random();

        for(int i=0;i<n;i++){
            
            //int p = r.nextInt(l);
            arrl[i] = u.charAt(i);
        }
        
        System.out.println(Arrays.toString(arrl));

    }
}
