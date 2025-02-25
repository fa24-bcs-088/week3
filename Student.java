public class Student {
    private String name;
    private double gpa;
    private int phone;
    private String city;
    private String roll;
    public static int counter = 1;

   
    Student(String name, double gpa, int phone, String city) {
        this.name = name;
        this.gpa = gpa;
        this.phone = phone;
        this.city = city;
        this.roll = String.format("fa24-bcs-%03d", counter);
        counter++;
    }

    
    public void setroll(String roll) {
        this.roll = roll;
    }

    public String getroll() {
        return roll;
    }

    
    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

   
    public void setgpa(double gpa) {
        this.gpa = gpa;
    }

    public double getgpa() {
        return gpa;
    }

   
    public void setphone(int phone) {
        this.phone = phone;
    }

    public int getphone() {
        return phone;
    }

   
    public void setcity(String city) {
        this.city = city;
    }

    public String getcity() {
        return city;
    }

  
    public void display() {
        System.out.println("----------------------");
        System.out.println("Student Information:");
        System.out.println("Name     : " + name);
        System.out.println("GPA      : " + gpa);
        System.out.println("Phone    : " + phone);
        System.out.println("City     : " + city);
        System.out.println("Roll No. : " + roll);
        System.out.println("----------------------");
    }
}




