public class StudentMain {
    public static void main(String[] args) {
        // Creating first student object
        Student s1 = new Student("Ali", 3.34, 3434, "Lahore");
        s1.setname("Kamil"); // Updating name
        s1.display(); // Using display function

        // Creating second student object
        Student s2 = new Student("Ahmed", 3.355, 3132334, "Islamabad");
        s2.display(); // Using display function

        // Updating name again (just for example)
        s1.setname("Kamil");
        s1.display(); // Displaying updated student details
    }
}
