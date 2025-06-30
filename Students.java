
import java.util.*;
public class Students {
private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses="";
    private int tuitionBalance=0;
    private static int cost=600;
    private static int id=1000;
    //Constructor to initialise name and year
    Students(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Student First Name"); 
        this.firstName=sc.nextLine();

        System.out.println("Enter the Student Last Name");
        this.lastName=sc.nextLine();

        System.out.println("1:- for freshmen\n2:-Sophomore\n3:-Junior\n4:-Senior\nEnter the student grade:");
        this.gradeYear=sc.nextInt();

        setStudentId();
        System.out.println(firstName+" "+lastName+"  "+gradeYear+" "+studentId);

    }

    //enroll a unique id for each student
    public void setStudentId(){
        id++;
        this.studentId=gradeYear+""+id;
    }
    //enroll in courses
    public void enroll(){
    do{
        
        System.out.println("enter the course(Q to quit)");
        Scanner sc=new Scanner(System.in);
        String course=sc.nextLine();
        if(!course.equals("Q")){
            courses=courses+"\n"+course;
            tuitionBalance=tuitionBalance+cost;
        }
        else{
           break;
        }
    }while(1!=0);
     System.out.println("ENROLLED IN"+courses);
            System.out.println("Tuition balance"+tuitionBalance);
    }
    //balance and tuition fees calculation
    public void viewBalance(){
        System.out.println("Your Balance is $"+tuitionBalance);
    }
    public void payTuition(){
        System.out.println("enter your payment amount");
        
        Scanner sc=new Scanner(System.in);
        int payment=sc.nextInt();
        tuitionBalance=tuitionBalance-payment;
        System.out.println("Thank you for your payment of $"+payment);
        viewBalance();
    }
    //show status
}
    

