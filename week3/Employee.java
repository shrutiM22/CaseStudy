import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Employee {
    private String ename;
    private int esalary;
    private int ecode;
    private String eaddr;
    private int epincode;

    Employee(){}

    Employee(String n,int sal,int c,String a,int pinc){
        this.ename = n;
        this.esalary = sal;
        this.ecode = c;
        this.eaddr = a;
        this.epincode = pinc;
    }

    // public int getEid() {
    //     return eid;
    // }

    // public void setEid(int eid) {
    //     this.eid = eid;
    // }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEsalary() {
        return esalary;
    }

    public void setEsalary(int esalary) {
        this.esalary = esalary;
    }

    public int getEcode() {
        return ecode;
    }

    public void setEcode(int ecode) {
        this.ecode = ecode;
    }

    public String getEaddr() {
        return eaddr;
    }

    public void setEaddr(String eaddr) {
        this.eaddr = eaddr;
    }

    public int getEpincode() {
        return epincode;
    }

    public void setEpincode(int epincode) {
        this.epincode = epincode;
    }


    public static void main(String[] args) {
        HashMap<Integer,Employee> h = new HashMap<>();
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("1. Add Employee \n2.Update Employee detail \n3.Delete Employee \n4.Get Employee \n5.Get all Employee");
            System.out.println("Choose option: ");
            int n = s.nextInt();

            switch (n) {
                case 1:
                    System.out.println("ENter id: ");
                    int eid = s.nextInt();
            
                    System.out.println("Enter Employee name: ");
                    String ename = s.next();
            
                    System.out.println("Enter the salary: ");
                    int esalary = s.nextInt();
            
                    System.out.println("Enter the code: ");
                    int ecode = s.nextInt();
            
                    System.out.println("Enter the address: ");
                    String eaddr = s.next();
            
                    System.out.println("Enter the pincode: ");
                    int epincode = s.nextInt();

                    Employee e = new Employee(ename,ecode,esalary,eaddr,epincode);

                    h.put(++eid,e);
                    System.out.println("Employee added successfully " +eid);              

                break;
                case 2:
                    System.out.println("ENter id: ");
                    int eid1 = s.nextInt();
            
                    System.out.println("Enter Employee name: ");
                    String ename1 = s.next();
            
                    System.out.println("Enter the salary: ");
                    int esalary1 = s.nextInt();
            
                    System.out.println("Enter the code: ");
                    int ecode1 = s.nextInt();
            
                    System.out.println("Enter the address: ");
                    String eaddr1 = s.next();
            
                    System.out.println("Enter the pincode: ");
                    int epincode1 = s.nextInt();

                    Employee e1 = new Employee(ename1,ecode1,esalary1,eaddr1,epincode1);

                    h.put(++eid1,e1);
                    System.out.println("Employee updated successfully " +eid1);

                
                break;
                case 3:

                    System.out.println("ENter the employee id to delete");
                    int eid3 = s.nextInt();
                    Employee e2 = h.remove(eid3);
                    System.out.println("EMployee details is deleted " +eid3);
                
                break;
                case 4:

                    System.out.println("To get employee detail enter id ");
                    int eid4 = s.nextInt();

                    Employee e3 =h.get(eid4);
                    System.out.println(e3);
                
                break;
                case 5: 
                    Set<Entry<Integer,Employee>> t = h.entrySet();
                    Iterator<Entry<Integer,Employee>> i = t.iterator();
                    while(i.hasNext()){
                        Entry<Integer,Employee> r =i.next();
                        System.out.println(r.getKey() + " " + r.getValue());
                    }
                    

                
                break;
            
                default:
                    System.out.println("wrong selection ");
                    break;
            }


        }



    }



}
