import java.util.Scanner;
class student
{
    int rollno;
    String name;
    int sub1,sub2,sub3;
    int total;    
}
public class students
 {
    public static void main(String[] args) {
        
        student s1 = new student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number: ");
        s1.rollno = sc.nextInt();
        System.out.println("Enter the name: ");
        s1.name = sc.next();
        System.out.println("Enter the marks of subject 1: ");
        s1.sub1 = sc.nextInt();
        System.out.println("Enter the marks of subject 2: ");
        s1.sub2 = sc.nextInt();
        System.out.println("Enter the marks of subject 3: ");
        s1.sub3 = sc.nextInt();
        s1.total = s1.sub1 + s1.sub2 + s1.sub3;
        System.out.println("Roll no: " + s1.rollno);
        System.out.println("Name: " + s1.name);
        System.out.println("Subject 1: " + s1.sub1);
        System.out.println("Subject 2: " + s1.sub2);
        System.out.println("Subject 3: " + s1.sub3);
        System.out.println("Total: " + s1.total);
        sc.close();
    
    }
}
