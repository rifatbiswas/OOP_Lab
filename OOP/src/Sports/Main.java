package Sports;

public class Main {
    public static void main(String[] args) {
        // Create objects of each subclass
        Sports genericSport = new Sports();
        Football footballSport = new Football();
        Basketball basketballSport = new Basketball();
        Rugby rugbySport = new Rugby();

        // Call the play() method for each subclass
        genericSport.play();        // Will print "Playing a sport"
        footballSport.play();       // Will print "Playing Football"
        basketballSport.play();     // Will print "Playing Basketball"
        rugbySport.play();          // Will print "Playing Rugby"
    }
}
