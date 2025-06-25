import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StudentDriver {

    public static void main(String[] args) {

        System.out.println("Welcome to Student Record");
        List<StudentEntity> studentEntities = new ArrayList<>();
        while(true) {
            System.out.println("What do you Want");
            System.out.println("Add \nView \nUpdate \nDelete \nExit");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            if (input.equalsIgnoreCase("add")) {
                StudentEntity studentEntity = new StudentEntity();
                System.out.println("Enter the roll-no of the Student");
                studentEntity.setStudent_rollno(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter the name of the Student");
                studentEntity.setStudent_name(sc.nextLine());
                System.out.println("Enter the std of the Student");
                studentEntity.setStudent_std(sc.nextLine());
                System.out.println("Enter the gender of the Student");
                studentEntity.setGender(sc.nextLine());
                studentEntities.add(studentEntity);
                System.out.println("Thank you for adding the New Student record");
            }
            else if (input.equalsIgnoreCase("view"))
            {
                System.out.println("Are you want to display all students records or specific Student Record \nfor all type all or for specific student type specific");
                String input1 = sc.next();
                if (input1.equalsIgnoreCase("all"))
                {
                    if (studentEntities.isEmpty()) {
                        System.out.println("No students record is available!! Add some of the student record");
                    }
                    else {
                        for (StudentEntity std : studentEntities) {
                            System.out.println(std.getStudent_name() + " " + std.getStudent_rollno() + " " + std.getStudent_std() + " " + std.getGender());
                        }
                    }
                }
                else if (input1.equalsIgnoreCase("specific")) {
                    System.out.println("Enter the roll no of the student");
                    int roll = sc.nextInt();
                    boolean found = false;
                    for(StudentEntity std : studentEntities)
                    {
                        if (std.getStudent_rollno()==roll)
                        {
                            System.out.println(std.getStudent_name() + " " + std.getStudent_rollno() + " " + std.getStudent_std() + " " + std.getGender());
                            found = true;
                        }

                    }
                    if(!found)
                    {
                        System.out.println("No students record is available with the roll-no!!");
                    }
                }
            }
            else if (input.equalsIgnoreCase("update")) {
                {
                    System.out.println("Enter the roll no of the student");
                    int roll = sc.nextInt();
                    boolean found = false;
                    for(StudentEntity std : studentEntities) {
                        if (std.getStudent_rollno() == roll)
                        {
                            System.out.println("Enter the name of the student");
                            std.setStudent_name(sc.nextLine());
                            System.out.println("Enter the std of the student");
                            std.setStudent_std(sc.nextLine());
                            System.out.println("Enter the gender of the student");
                            std.setGender(sc.nextLine());
                            System.out.println("Student Record Update successfully");
                            found = true;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Student record not found with the roll no");
                    }
                }

            } else if (input.equalsIgnoreCase("delete")) {

                System.out.println("Enter the Roll no Of the Student You want to delete");
                int roll = sc.nextInt();
                boolean found= false;
                for (int i = 0; i < studentEntities.size(); i++) {
                    if (studentEntities.get(i).getStudent_rollno() == roll) {
                        studentEntities.remove(i);
                        found= true;
                        break;
                    }
                }
                if (!found)
                {
                    System.out.println("Student record not found with the roll no");
                }
            } else
            {
                break;
            }
        }
    }
}