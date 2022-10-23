package exercise030;

public class Person {
    private String firstName, lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        if (this.age > 12 && this.age < 20) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getFullName() {
        String fullName = "";
        if (this.firstName.isEmpty() == true && this.lastName.isEmpty() == true) {
            return "";
        } else if (this.firstName.isEmpty() == true && this.lastName.isEmpty() == false) {
            return this.lastName;
        } else if (this.firstName.isEmpty() == false && this.lastName.isEmpty() == true) {
            return this.firstName;
        } else {
            return this.firstName + " " + this.lastName;
        }
    }
}
