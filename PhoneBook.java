import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Contact {
    String firstName;
    String lastName;
    String institution;
    String phoneNumber;

    Contact(String firstName, String lastName, String institution, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.institution = institution;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s | %s | %s", firstName, lastName, institution, phoneNumber);
    }
}

public class PhoneBook {
    static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeContacts();
        
        while (true) {
            System.out.println("\nPhone Book:");
            displayContacts();
            System.out.println("\nSort by: 1. First Name 2. Last Name 3. Institution 4. Phone Number");
            System.out.print("Enter your choice (1-4) or 0 to exit: ");
            int choice = scanner.nextInt();
            if (choice == 0) break;
            sortContacts(choice);
        }
        scanner.close();
    }

    static void initializeContacts() {
        contacts.add(new Contact("John", "Doe", "Google", "123-456-7890"));
        contacts.add(new Contact("Jane", "Smith", "Apple", "234-567-8901"));
        contacts.add(new Contact("Emily", "Davis", "Microsoft", "345-678-9012"));
        contacts.add(new Contact("Michael", "Brown", "Amazon", "456-789-0123"));
        contacts.add(new Contact("Sarah", "Wilson", "Facebook", "567-890-1234"));
        contacts.add(new Contact("Gregorius", "Cahyadi", "Binus", "260-205-6832"));
    }

    static void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    static void sortContacts(int choice) {
        switch (choice) {
            case 1:
                bubbleSort((a, b) -> a.firstName.compareTo(b.firstName));
                break;
            case 2:
                bubbleSort((a, b) -> a.lastName.compareTo(b.lastName));
                break;
            case 3:
                bubbleSort((a, b) -> a.institution.compareTo(b.institution));
                break;
            case 4:
                bubbleSort((a, b) -> a.phoneNumber.compareTo(b.phoneNumber));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    static void bubbleSort(Comparator<Contact> comparator) {
        int n = contacts.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (comparator.compare(contacts.get(j), contacts.get(j+1)) > 0) {
                    Collections.swap(contacts, j, j+1);
                }
            }
        }
    }
}
