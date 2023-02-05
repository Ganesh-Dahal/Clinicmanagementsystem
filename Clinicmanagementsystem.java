import java.util.Scanner;

public class Clinicmanagementsystem{
    static Scanner sc = new Scanner(System.in);
    static int choice;
    static int id = 0;
    static Patient[] patients = new Patient[10];

    public static void main(String[] args) {
        while (true) {
            System.out.println("--------------WELCOME--------------");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patient Details");
            System.out.println("3. Exit");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> addPatient();
                case 2 -> viewPatientDetails();
                case 3 -> System.exit(0);
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void addPatient() {
        System.out.print("Enter Patient Name: ");
        String name = sc.next();
        System.out.print("Enter Patient Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Patient Address: ");
        String address = sc.next();
        Patient p = new Patient(++id, name, age, address);
        patients[id - 1] = p;
        System.out.println("------------------------------------------");
        System.out.println("Patient added successfully!");
        System.out.println("------------------------------------------");
    }

    static void viewPatientDetails() {
        System.out.print("Enter Patient ID: ");
        int patientId = sc.nextInt();
        System.out.println("------------------------------------------");
        Patient p = patients[patientId - 1];
        if (p != null) {
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Address: " + p.address);
        } else {
            System.out.println("------------------------------------------");
            System.out.println("Patient not found. TRY Again");
            System.out.println("------------------------------------------");
        }
    }
}

class Patient {
    int id;
    String name;
    int age;
    String address;

    Patient(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
