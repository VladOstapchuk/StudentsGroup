import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("Alex", "Zone", Gender.MALE);
        Student student2 = new Student("Kat", "WTwo", Gender.FEMALE);
        Student student3 = new Student("Alex", "MOne", Gender.MALE);
        //Student student4 = new Student("Kat", "CTwo", Gender.FEMALE);
        Student student5 = new Student("Alex", "AOne", Gender.MALE);
        Student student6 = new Student("Kat", "CTwo", Gender.FEMALE);
        //Student student7 = new Student("Alex", "POne", Gender.MALE);
        //Student student8 = new Student("Kat", "BTwo", Gender.FEMALE);
        //Student student9 = new Student("Alex", "QOne", Gender.MALE);
        //Student student10 = new Student("Kat", "JTwo", Gender.FEMALE);


        Group VI42 = new Group("VI42");
        try {

            VI42.addStudent(student1, "VI42");
            VI42.addStudent(student2, "VI42");
            VI42.addStudent(student3,"VI42");
            VI42.addStudent(student6, "VI42");
            VI42.addStudent(student5, "VI42");
            //VI42.addStudent(student6);
            //VI42.addStudent(student7);
            //VI42.addStudent(student8);
            //VI42.addStudent(student9);
            //VI42.addStudent(student10);

        } catch (GroupOverflowException e){
            System.out.println("This group is full");
        }

        System.out.println(VI42.toString());
        System.out.println();

        VI42.sortStudentsByLastName();


        System.out.println(VI42.toString());

        VI42.saveGroupToFile(VI42, "NewGroup.txt"); // space separated content must be in file


 //       try {
 //           System.out.println(VI42.searchStudentByLastname("Two").toString());
 //       } catch (StudentNotFoundException e) {
 //                   }

        Group VI100 = new Group("VI100");
        VI100.ReadGroupFromFile(VI100, "GroupVI100.txt");

        System.out.println(VI100.toString());

//        VI100.saveGroupToFile(VI100, "OutGroupVI100.txt");



// save group in file with DAO pattern
        GroupDAO slgd = new SaveLoadGroupDAO();
        slgd.saveGroup(VI100);

// load group from file with DAO pattern
        Group VI005 = new Group("VI005");
        GroupDAO newVI005 = new SaveLoadGroupDAO();
        VI005 = newVI005.loadGroup(VI005.getGroupName());

        System.out.println(VI005.toString());









    }
}