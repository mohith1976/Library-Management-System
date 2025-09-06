package Library;
import java.util.*;
 public class student{
     String studentName;
     String regNum;

     book[] borrowedBooks = new book[3];
    public int booksCount = 0;
     Scanner sc = new Scanner(System.in);

     public student()
     {
         System.out.println("Enter Name");
         this.studentName = sc.nextLine();

         System.out.println("Enter register number");
         this.regNum = sc.nextLine();
     }
 }