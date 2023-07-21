import java.util.Scanner;
class student 
{
    int rollno;
    String name;
    double sub1,sub2,sub3;
    double total;    
    


public void average()
{
     double m = total/3;
    System.out.println("Average: " + m);

}
}
    
public class xyz {
    public static void main(String[] args) {
        /* 
        student s1 = new student();
        s1.rollno = 1;
        s1.name = "Rahul";
        s1.sub1 = 90;
        s1.sub2 = 80;
        s1.sub3 = 70;
        s1.total = s1.sub1 + s1.sub2 + s1.sub3;
        System.out.println("Roll no: " + s1.rollno);
        System.out.println("Name: " + s1.name);
        System.out.println("Subject 1: " + s1.sub1);
        System.out.println("Subject 2: " + s1.sub2);
        System.out.println("Subject 3: " + s1.sub3);
        System.out.println("Total: " + s1.total); 
        */
        student s1 = new student();
        Scanner sc = new Scanner(System.in);
      
        
        System.out.println("Enter the roll number: ");
        s1.rollno = sc.nextInt();
        System.out.println("Enter the name: ");
        s1.name = sc.next();
        System.out.println("Enter the marks of subject 1: ");
        s1.sub1 = sc.nextDouble();
        System.out.println("Enter the marks of subject 2: ");
        s1.sub2 = sc.nextDouble();
        System.out.println("Enter the marks of subject 3: ");
        s1.sub3 = sc.nextDouble();
        s1.total = s1.sub1 + s1.sub2 + s1.sub3;
        System.out.println("Roll no: " + s1.rollno);
        System.out.println("Name: " + s1.name);
        System.out.println("Subject 1: " + s1.sub1);
        System.out.println("Subject 2: " + s1.sub2);
        System.out.println("Subject 3: " + s1.sub3);
        System.out.println("Total: " + s1.total);
        s1.average();
        sc.close();
  
    }
}


