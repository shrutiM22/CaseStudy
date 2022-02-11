import javax.sql.rowset.spi.SyncResolver;

public class Req4_5 {
    

    public void countLettersInArray(String w){
        int i;
        int count[] = new int[256];

        for(i=0;i<w.length();i++)
           count[(int) w.charAt(i)]++;

        for(i=0;i<256;i++){
            if(count[i]!=0){
                System.out.println((char) i +": " + count[i]);
            }
        }
    }
        

    public static void main(String[] args) {
        String word = "cupofcoffee";
        Req4_5 r = new Req4_5();
        r.countLettersInArray(word);
    }
}
