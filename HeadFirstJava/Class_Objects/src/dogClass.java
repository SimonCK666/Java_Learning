/**
 * @author Simon
 * @version 1.0
 * @ID 1930026144
 * @date 2020/5/24 10:41
 */

/* Write Class */
class Dog {
    // instance variables
    int size;
    String bread;
    System name;

    // function
    void bark() {
        System.out.println("Ruff! Ruff!");
    }
}


/* Write Test Class */
class DogTestDrive {
    public static void main(String[] args) {
        // Dog Test Code
        Dog d = new Dog();  // set up Dog object
        d.size = 40;  // access to the object's variables
        d.bark();  // call method(func)
    }
}