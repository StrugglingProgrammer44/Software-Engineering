public class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        // TODO: Complete the constructor logic
        this.name = name;
        this.age = age;
    }
    // Setter for name
    public void setName(String name) {
        // TODO: Complete the setter logic
        this.name = name;
    }

    // Getter for name
    public String getName() {
        // TODO: Complete the getter logic
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter method to set the age
    public void setAge(int age) {
        // Add validation if needed (e.g., age >= 0)
        this.age = age;
    }

}

