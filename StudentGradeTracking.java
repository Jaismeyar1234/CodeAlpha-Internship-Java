import java.util.Scanner;
public class StudentGradeTracking {

    Scanner sc = new Scanner(System.in);

    public StudentGradeTracking() {
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String[] studentNames = new String[n];
        int[] marks = new int[n];

        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Student name:");
            studentNames[i] = sc.nextLine();

            System.out.print("Enter the marks:");
            marks[i] = sc.nextInt();
            sc.nextLine();

            total += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (lowest > marks[i]) {
                lowest = marks[i];
            }
        }
        double average = (double) total / n;
        System.out.println("\n------Student Grade Report------");

        for (int i = 0; i < n; i++) {
            System.out.println(studentNames[i] + " : " + marks[i]);
        }

        System.out.println("Average marks:" + average);
        System.out.println("Highest marks:" + highest);
        System.out.println("Lowest marks:" + lowest);
    }

    public static void main(String[] args) {
        new StudentGradeTracking();
    }
}