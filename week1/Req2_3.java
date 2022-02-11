/**
 * req2_3
 */
public class Req2_3 {
    //creating array
    public static void createArray(int a[]){
        a[0] = 11;
        a[1] = 22;
        a[2] = 33;
        a[3] = 44;
        a[4] = 55;
    }
    //display array
    public static void display(int a[]){
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
        
        
    }
    public static void main(String[] args) {
        int arr[] = new int[5]; //declaring 
        
    
        Req2_3.createArray(arr);
        Req2_3.display(arr);
    }
}