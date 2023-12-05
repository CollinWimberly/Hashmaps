import java.util.HashMap;
import java.util.Scanner;
public class Main {
    static HashMap<String, Integer> Grades;
    public static void main(String[] args) {
        Grades = new HashMap();
        System.out.println("Collin Wimberly");
        Grades.put("max", 87);
        Grades.put("sally", 95);
        Grades.put("jane", 82);
        Grades.put("phil", 77);
        Grades.put("henry", 91);
        boolean b = true;
        do {
            Interface();
        }while(b);

    }
    public static void Interface(){
        Scanner input = new Scanner(System.in);
        String selection;
            System.out.println("Press a to add a student and their grade");
            System.out.println("Press u to update a students grade");
            System.out.println("Press r to remove a student from the system");
            System.out.println("Press l to look up a specific students grade");
            System.out.println("Press p to print all student grades");
            System.out.println("Press q to quit the program");
            System.out.print("-> ");
            selection = input.nextLine();
            switch (selection) {
                case "a":
                    String name = "null";
                    int grade = 0;
                    int grade2 = 0;
                    System.out.print("Enter the name of the student -> ");
                    name = input.nextLine();
                    System.out.print("Enter " + name + "'s grade -> ");
                    grade = input.nextInt();
                    Grades.put(name, grade);
                    name = "null";
                    grade = 0;
                    break;

                case "u":
                    System.out.print("Enter the name of the student -> ");
                    name = input.nextLine();
                    System.out.print("Enter " + name + "'s current grade -> ");
                    grade = input.nextInt();
                    System.out.print("Enter " + name + "'s new grade -> ");
                    grade2 = input.nextInt();
                    if (Grades.containsKey(name)) {
                        Grades.replace(name, grade, grade2);
                    }
                    name = "null";
                    grade = 0;
                    break;

                case "r":
                    System.out.print("Enter the name of the student -> ");
                    name = input.nextLine();
                    if (Grades.containsKey(name)) {
                        Grades.remove(Grades.get(name));
                    }
                    name = "null";
                    grade = 0;
                    break;

                case "l":
                    System.out.print("Enter the name of the student -> ");
                    name = input.nextLine();
                    if (Grades.containsKey(name)) {
                        System.out.println(Grades.get(name));
                    } else {
                        System.out.println("There are no students by that name in the database.");
                    }
                    name = "null";
                    grade = 0;
                    break;

                case "p":
                    System.out.println(Grades);
                    break;

                case "q":
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
            }
    }
}
