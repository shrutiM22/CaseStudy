import java.util.Arrays;
import java.util.Scanner;

public class Char20 {

    
    public static void main(String[] args) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        char c[]= new char[20];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        for(int i=0;i<20;i++){
            
                c[i]= a.charAt(i);
            }
            
        
        for(int j=0;j<n;j++){
        System.out.println(Arrays.toString(c));
        }
    }
}
