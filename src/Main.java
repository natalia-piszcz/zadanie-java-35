import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person[] people = new Person[3];
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        while (count < 3) {
            System.out.println("Podaj imię");
            String firstName = scanner.nextLine();
            System.out.println("Poaj wiek");
            int age = scanner.nextInt();
            scanner.nextLine();
            Person person = new Person(firstName, age);
            boolean exists = false;
            for (int i = 0; i < people.length; i++) {
                if (person.equals(people[i])) {
                    exists = true;
                    break;
                }
            }
            if (exists) {
                System.out.println("nope");
            } else {
                people[count] = person;
                count++;

            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
