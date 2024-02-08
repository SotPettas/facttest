

//υλοποίηση ενός προϊόντος που ανήκει στην κατηγορία των περιφεριακών.

//Η κλάση  υλοποιεί τη διεπαφή Product.

public class Peripherals implements Product {

    // Σταθερές τιμές για τα διάφορα πεεριφεριακά.

    public static final double MONITOR_PRICE = 93.0;
    public static final double KEYBOARD_PRICE = 4.5;
    public static final double MOUSE_PRICE = 2.75;

    // Ορίζουμε ιδιωτικά πεδία για το όνομα, την τιμή και τη συσκευασία των περιφεριακών.

    private String name;
    private double price;

    private String packaging;

    // Ορίζουμε σταθερές συμβολοσειρές για τα ονόματα των περιφεριακών.

    public static final String MONITOR = "monitor";
    public static final String KEYBOARD = "keyboard";
    public static final String MOUSE = "mouse";

    // Ο κατασκευαστής της κλάσης δέχεται το όνομα, την τιμή και τη συσκευασία του περιφεριακού
    // και τα ορίζει στα αντίστοιχα ιδιωτικά πεδία. Εάν η συσκευασία είναι κενή, τότε ορίζει
    // τη συσκευασία ως "ανευ Boxed".


    public Peripherals(String name, double price, String packaging) {
        this.name = name;
        this.price = price;
        if(packaging.equals("")) { // Εάν η συσκευασία είναι κενή
            this.packaging = "Boxed"; // Ορίζει τη συσκευασία ως "Boxed"
        } else {
            this.packaging = packaging; // Αλλιώς χρησιμοποιεί την τιμή που δόθηκε
        }
    }

    // Υλοποιούμε τις μέθοδους της διεπαφής Product, όπου επιστρέφουν αντίστοιχα το όνομα, την τιμή, τη συσκευασία
    // και την κατηγορία του περιφεριακού.
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public String getPackage() {
        return packaging;
    }

    public ProductCategory getCategory() {
        return ProductCategory.PERIPHERALS;
    }
}
