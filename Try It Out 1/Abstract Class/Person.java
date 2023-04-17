// Practical Example of Abstract Class 
//Abstract class 
package Abstract;

public abstract class Person {
    private String name;
    private String gender;

    public Person(String nm, String gen) {
        this.name = nm;
        this.gender = gen;
    }

    public abstract void Studying();

    @Override
    public String toString() {
        return "Name = " + this.name + " :: Gender = " + this.gender;
    }
}
