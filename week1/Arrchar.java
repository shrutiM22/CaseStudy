public class Arrchar {
    
    public static int createArray(char ch[]){
        ch[0]= 'r';
        ch[1] = 'o';
        ch[2] = 'b';
        ch[3] = 'o';
        ch[4] = 't';
        return ch;
        //char s[] = new char[5];
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
        
    }
    public static void main(String[] args) {
        char c[] = new char[5];
        //System.out.println(
            Arrchar.createArray(c);
        
    }
}
