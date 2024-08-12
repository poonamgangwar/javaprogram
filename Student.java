public class Student {
    // Attributes
    private int rollNo;
    private String name;
    private String emailId;

    // Constructor
    public Student(int rollNo, String name, String emailId) {
        this.rollNo = rollNo;
        this.name = name;
        this.emailId = emailId;
    }

    // Getter for rollNo
    public int getRollNo() {
        return rollNo;
    }

    // Setter for rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for emailId
    public String getEmailId() {
        return emailId;
    }

    // Setter for emailId
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email ID: " + emailId);
    }
}

