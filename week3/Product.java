import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Product
 */
public class Product {
    private int id;
    private String name;
    private int amount;
    private int code;
    private String addr;
    private int pincode;

    Product(){
    }

    Product(int i,String n,int a, int c,String ad,int p ){
        this.id = i;
        this.name = n;
        this.amount = a;
        this.code = c;
        this.addr = ad;
        this.pincode = p;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }


    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

 
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }



    public int getPincode() {
        return pincode;
    }
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
   

    Scanner s = new Scanner(System.in);

    HashMap<Integer,Product> h = new HashMap<Integer,Product>();
    

    void setProductDetails(){
        System.out.println("ENter id: ");
        id = s.nextInt();
        //setId(id);

        System.out.println("Enter product name: ");
        name = s.next();
        //setName(name);

        System.out.println("Enter the amount: ");
        amount = s.nextInt();
        //setAmount(amount);

        System.out.println("Enter the code: ");
        code = s.nextInt();
        //setCode(code);

        System.out.println("Enter the address: ");
        addr = s.next();
        //setAddr(addr);

        System.out.println("Enter the pincode: ");
        pincode = s.nextInt();
        //setPincode(pincode);

        Product prod = new Product(id, name,amount,code,addr,pincode );
        
        h.put(prod.id,prod);
        
    }

    void getProduct(int search){
        if(h.containsKey(search)){
            System.out.println(h.get(search));
        }
        else
            System.out.println("not found");
                
    }
    void getAllProduct(){
        System.out.println(h);
        //Set<Map.Entry<Integer,Product>> s = h.entrySet();
        /*for(Map.Entry<Integer,Product> e: s){
            int p_id = e.getKey();
            Product product = e.getValue();
            System.out.println(p_id + " "  + product);
        }*/

        for(int i:h.keySet())
            System.out.println(h.get(i));
    }

    void updateProd(int id){
        Product p = new Product();
        p = h.get(id);
        System.out.println("1. Update Product name \n2.Update amount \n3.update code \n4.update address \n5.update pincode");
        System.out.println("enter detail number to be change ");
        int u = s.nextInt();
       
        switch (u) {
            case 1:
                System.out.println("Enter new name: ");
                p.name = s.next();
                System.out.println("updated name " +p.name);

                break;
                case 2:
                System.out.println("Enter new amount: ");
                p.amount = s.nextInt();
                System.out.println("updated amount " +p.amount);

                
                break;
                case 3:
                System.out.println("Enter new code: ");
                p.code = s.nextInt();
                System.out.println("updated code " +p.code);

                
                break;
                case 4:
                System.out.println("Enter new address: ");
                p.addr = s.next();
                System.out.println("updated name " +p.addr);

                break;

                case 5:
                System.out.println("Enter new pincode: ");
                p.pincode = s.nextInt();
                System.out.println("updated name " +p.pincode);

                break;
            default:
                break;
        }


    }

    void removeProd(int id){
        h.remove(id);
        System.out.println("Product Deleted!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        Product p =new Product();
       // p.getName();
        //p.getId();
        //p.getAmount();
       // p.getCode();
       // p.getAddr();
       // p.getPincode();
        //p.setProductDetails();
        //p.getProductDetails();
        int quit =1;
        int n;
        while(quit != 0){
        System.out.println("1. Add Product \n2.Update Product \n3.Delete Product \n4.Get Product \n5.Get all product");
        System.out.println("Choose any: ");
        n = p.s.nextInt();
        switch (n) {
            case 1:
                p.setProductDetails();
                System.out.println("enter 1 to continue else 0 to quit 1");
                quit = sc.nextInt();
                break;
                case 2:
                System.out.println("ENter id of product to update ");
                id = sc.nextInt();
                p.updateProd(id);
                System.out.println("enter 1 to continue else 0 to quit 1");
                quit = sc.nextInt();

                
                break;
                case 3:
                System.out.println("ENter id of product to delete ");
                id = sc.nextInt();
                p.removeProd(id);
                System.out.println("enter 1 to continue else 0 to quit 1");
                quit = sc.nextInt();
                
                break;
                case 4:
                    System.out.println("ENter id to the product details ");
                    id = sc.nextInt();
                    p.getProduct(id);
                    System.out.println("enter 1 to continue else 0 to quit 1");
                quit = sc.nextInt();
                break;

                case 5:
                    System.out.println("Getting all products ");

                    p.getAllProduct();
                    System.out.println("enter 1 to continue else 0 to quit 1");
                quit = sc.nextInt();
                break;
            default:
                break;
        }
    }
        


        
        
    }
}