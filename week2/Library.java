/**
 * Library
 */

abstract class Item{
    private int id_no;
    private String title;
    private int no_of_c;


    Item(){
        System.out.println("--Welcome to Dawn Library---");
    }

    //getters and setters
    public void setId(int id){
        this.id_no = id;
    }
    public int getId(){
        return id_no;
    }

    public void setTitle(String t){
        this.title = t;
    }
    public String getTitle(){
        return title;
    }

    public void setnoC(int nc){
        this.no_of_c = nc;
    }
    public int getnoC(){
        return no_of_c;
    }

    public void eq(){
        String m = "bestseller";
        String n = "Bestseller";
        System.out.println(n.equals(m)); 
        
    }

    public void strFn(String title){
        System.out.println(title.toString());
    }

    public void addItem(){
        System.out.println("get Newspapers to library");
    }

}

abstract class WrittenItem extends Item{
    
    private String author[] = {"Shashi Tharoor", "Priyanka Chopra","Chetan Bhagat"};
    private String email[] = {"shash@trot.com","prichop@nick.com","chetan@book.com"};
    WrittenItem(){
        super();
    }

    public void add(){
        System.out.println("Adding more Fiction novel");
    }

    public void book(String bookn){
        System.out.println(bookn + " is a written by " + author[1]);

    }

    public void info(String bname){
        System.out.print(author[2] + "'s " + bname + "is now avialable");
        System.out.println(email[2]);
       
    }

}

class Book extends WrittenItem{
   
    
    
    public void info(String author){
        System.out.println(author + " is author of fifty shades triology. ");
    }

    @Override
    public void add(){
        System.out.println("adding remaining Geeta cantos\n");
    }

}

class JournalPaper extends WrittenItem{
    int yearPublish;
    String journal = "SKIT Journels";
    

    public void setYear(int y){
        this.yearPublish = y;
    }

    public int getYear(){
        return yearPublish;
    }

}

abstract class MediaItem extends Item{
    private int novels = 400, generalBooks = 300, subjectBook =1000;
    String printmedia[] = {"The Times of India", "Dainik Bhaskar", "Hindustan Times", "DNA"};

    public int totalBooks(){
        return novels+generalBooks+subjectBook;
    }

    public void add(){
        String holyCd = "Ramcharitmanas";
        System.out.println("Adding more holy CDs like: " +holyCd);
    }

    public void news(){
        System.out.println("In this library we have newspapers from - ");
        for (int i=0;i<printmedia.length;i++) {
            System.out.print(printmedia[i] + "\n");
        }
    }

    public void totalmed(){
        System.out.println("several music cds and films ");
    }

}

class Video extends MediaItem{
    Video(){
        super();
    }
    private String director;
    private String genre;
    private int yearRel;
    String name = "Life of Pi";
    
    
    public void add(String cdname){
        System.out.println("Adding more " + cdname);
    }
    public void setnewCd(String d,String g,int y){
        this.director=d;
        this.genre=g;
        this.yearRel=y;

    }
    public String getdir(){
        return director;
    }
    public String getgen(){
        return genre;
    }
    public int getyearR(){
        return yearRel;
    }
    @Override
    public void totalmed(){
        System.out.println("excluding " + name+ " we have 200+ fictional movies" );
    }
    

}

class CD extends MediaItem{
    private String artist;
    private String genre;
    String name = "Dawn FM";

    public void setCD(String a,String g){
        this.artist=a;
        this.genre=g;
    }
    public String getart(){
        return artist;
    }
    public String genre(){
        return genre;
    }

    @Override
    public void totalmed(){
        if(name == "Dawn FM")
            System.out.println("Including " + name + " now we have 400+ CDs of music albums");
        else if(name == "Starboy")
            System.out.println("Already added starboy album");
        else
            System.out.println("album not added");
    }
}


public class Library{

    public static void main(String[] args) {

        //ques 1 and 2 , superclass Item and subclass WrittenItem
        System.out.println("Ques 1 and 2 ----- \n");
        WrittenItem w = new WrittenItem() {};
        w.setId(10112);
        System.out.print("Identifiaction no  " +w.getId()); 
        w.setTitle(" 'The riots' ");
        System.out.print(" of book " + w.getTitle());
        w.setnoC(7);
        System.out.print(" having no of copies "+w.getnoC() +"\n");
        w.eq();
        w.strFn("PS ILY");
        w.addItem();
        w.add();
        w.book("Unfinished");
        w.info("Half Girldfriend");


        //for writtenItem subclasses ques-3
        System.out.println(" \n Ques - 3---- \n");

        Book b = new Book();
        b.info("E.L. James");
        b.add();

        JournalPaper jp = new JournalPaper();
        jp.setYear(2001);
        System.out.println(jp.journal +" start publishing in year " + jp.getYear()); 

        //ques -4 another abstract subclass of Item

        System.out.println("\n Ques-4 ----\n");
        MediaItem m = new MediaItem() {};
        System.out.println("Combining books like novels, general books\n and subject books we have total: " +m.totalBooks()); 
        m.add();
        m.news();

        //ques -5 subclasses of mediaItem 
        System.out.println("\n Ques 5----- \n");
        Video v = new Video();
        v.add("Science Fiction");
        v.setnewCd("And Lee", "Philosophical Fiction", 2012);
        System.out.println(v.name + " is a " + v.getgen()+ " type " + " Directed by " + v.getdir() + " and released in " + v.getyearR());
        v.totalmed();

        CD cdd = new CD();
        cdd.setCD("The Weeknd", "Dance-pop");
        System.out.print(cdd.getart() + " recent album " + cdd.name + " is added "  ); 
        System.out.println(" which is " +cdd.genre()); 
        cdd.totalmed();
        
        


    }
    
}