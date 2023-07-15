package Animal;

// Main class to test the subclasses
public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();

        // Call the Sound() method for each subclass
        genericAnimal.Sound();  // Will print "Animal makes a sound"
        bird.Sound();           // Will print "Bird chirps"
        cat.Sound();            // Will print "Cat meows"
    }
}

