package Library;

import java.util.*;

public class students {
    Scanner sc = new Scanner(System.in);

    student[] theStudents = new student[50];

    public static int count = 0;

    public void  addStudent(student s)
    {
        for(int i =0;i<count;i++)
        {
            if(s.regNum.equals(theStudents[i].regNum))
            {
                System.out.println("Already registered");
                return;
            }
        }

        if(count<=50)
        {
            theStudents[count] = s;
            count++;
        }
    }

    public void showAllStudents()
    {
        System.out.println("Student Name\t\tReg Number");

        for(int i=0;i<count;i++)
        {

            System.out.println(theStudents[i].studentName
                    + "\t\t"
                    + theStudents[i].regNum);
        }
    }

    public int isStudent()
    {
        System.out.println("Enter registration number");
        String regNum = sc.nextLine();

        for(int i=0;i<count;i++)
        {
            if(regNum.equals(theStudents[i].regNum))
            {
                return i;
            }
        }
        System.out.println("Invalid registration number or");
        System.out.println("get register first");

        return -1;
    }

    public void checkOutBook(books book)
    {
        int studentIndex = this.isStudent();

        if (studentIndex != -1) {
            System.out.println("checking out");

            book.showAllBooks();
            book b = book.checkOutBook();

            System.out.println("checking out");
            if (b != null) {

                if (theStudents[studentIndex].booksCount
                        <= 3) {

                    System.out.println("adding book");
                    theStudents[studentIndex].borrowedBooks
                            [theStudents[studentIndex]
                            .booksCount]
                            = b;
                    theStudents[studentIndex].booksCount++;

                    return;
                }
                else {

                    System.out.println(
                            "Student Can not Borrow more than 3 Books.");
                    return;
                }
            }
            System.out.println("Book is not Available.");
        }
    }
    public void checkInBook(books book)
    {
        int studentIndex = this.isStudent();
        if (studentIndex != -1) {

            // Printing credentials corresponding to student
            System.out.println(
                    "S.No\t\t\tBook Name\t\t\tAuthor Name");

            student s = theStudents[studentIndex];

            for (int i = 0; i < s.booksCount; i++) {

                System.out.println(
                        s.borrowedBooks[i].sNo + "\t\t\t"
                                + s.borrowedBooks[i].bookName + "\t\t\t"
                                + s.borrowedBooks[i].authorName);
            }

            // Display message only
            System.out.println(
                    "Enter Serial Number of Book to be Checked In:");

            int sNo = sc.nextInt();

            for (int i = 0; i < s.booksCount; i++) {
                if (sNo == s.borrowedBooks[i].sNo) {
                    book.checkInBook(s.borrowedBooks[i]);
                    s.borrowedBooks[i] = null;

                    return;
                }
            }

            System.out.println("Book of Serial No " + sNo
                    + "not Found");
        }
    }
}