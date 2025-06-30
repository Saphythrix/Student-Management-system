import java.util.Scanner;

public class StudentDatabasApp {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of students");
      int n=sc.nextInt();
        Students[] stu=new Students[n];
        for(int i=0;i<n;i++){
            stu[i]=new Students();
            stu[i].enroll();
            stu[i].payTuition();
        }
    }
}