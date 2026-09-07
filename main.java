import java.util.*;

class Student
{
    public int roll;
    public String name;
    static Hashtable<Integer,String> ht=new Hashtable<>();

    public void addstudent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll number");
        roll=sc.nextInt();
        System.out.println("Enter name");
        name=sc.next();
        ht.put(roll,name);
    }
    public void display()
    {
        System.out.println("Roll number\tName");
        for(Map.Entry<Integer,String> entry:ht.entrySet())
        {
            System.out.println(entry.getKey()+"\t\t"+entry.getValue());
        }
    }
    public void delete()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll number to delete");
        roll=sc.nextInt();
        ht.remove(roll);
    }
    public void update()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll number to update");
        roll=sc.nextInt();
        System.out.println("Enter new name");
        name=sc.next();
        ht.put(roll,name);
    }


}


public class main
{
    static Scanner sc=new Scanner(System.in);
    static int choice;

    public static void main(String[] args)
    {
        Student s=new Student();

        while(true)
        {
        System.out.println("1. Add Student");
        System.out.println("2. Display ");
        System.out.println("3. Delete");
        System.out.println("4. Update");
        System.out.println("5. Exit");


        System.out.println("Enter your choice");
        choice=sc.nextInt();

        switch(choice)
        
        {
            case 1:
                s.addstudent();
                break;
            case 2:
                s.display();
                break;
            case 3:
                s.delete();
                break;
            case 4:
                s.update();
                break;
            case 5:
                System.exit(0);
                return;
            default:
                System.out.println("Invalid choice");
        }

        }

    }
}