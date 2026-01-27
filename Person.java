public class Person {
    private String firstName;
    private String lastName;
    private int age;
    // TODO:  Add a field for occupation

    /** 
     * when a Person object is created, 
     * a first name and last name must be given 
     * and the age will be set to 0
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
    }

    // TODO:  Create a method that increments age by 1
    public void birthday() {
        this.age++;
    }


    // TODO:  Create a method that sets occupation

    // TODO:  Create a method that returns fullName
    

    // TODO: change this line
    public String toString() {
        return "Hi! My name is " + firstName + " " + lastName + ". I am " + age + " old.";
    }
}
