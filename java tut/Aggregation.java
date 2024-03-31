// Class representing a Address
class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

// Class representing a Student
class Student {
    int rollNum;
    String studentName;
    // Student HAS an Address
    Address studentAddr;  

    Student(int rollNum, String studentName, Address addr) {
        this.rollNum = rollNum;
        this.studentName = studentName;
        this.studentAddr = addr;
    }

    void display() {
        System.out.println(rollNum + " " + studentName);
        System.out.println(studentAddr.city + " " + studentAddr.state + " " + studentAddr.country);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Address addr1 = new Address("New York", "NY", "USA");
        Student s1 = new Student(123, "John", addr1);
        s1.display();
    }
}
