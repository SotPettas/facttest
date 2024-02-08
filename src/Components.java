

// Σε αυτήν την κλάση , έχουμε την υλοποίηση ενός προϊόντος που ανήκει στην κατηγορία των υποσυστημάτων.
// Η κλάση υλοποιεί τη διεπαφή Product

public class Components implements Product {

    // Ορίζουμε σταθερές τιμές για τις τιμές των διαφόρων υποσυστημάτων.

    public static final double CPU_PRICE = 133.0;
    public static final double GPU_PRICE = 234.5;
    public static final double RAM_PRICE = 52.75;

    public static final double SSD_PRICE = 84.5;
    public static final double MOTHERBOARD_PRICE = 42.75;

    // Ορίζουμε ιδιωτικά πεδία για το όνομα, την τιμή και τη συσκευασία του υποσυστήματος.

    private String name;
    private double price;

    private String packaging;

    // Ορίζουμε σταθερές συμβολοσειρές για τα ονόματα των υποσυστημάτων.

    public static final String CPU = "cpu";
    public static final String GPU = "gpu";
    public static final String RAM = "ram";

    public static final String SSD = "ssd";
    public static final String MOTHERBOARD = "motherboard";


    //  Ο κατασκευαστής της κλάσης δέχεται το όνομα, την τιμή και τη συσκευασία  του υποσυστήματος
    //  και τα ορίζει στα αντίστοιχα ιδιωτικά πεδία. Εάν η συσκευασία είναι κενή, τότε ορίζει
    //  τη συσκευασία ως "Assembled".



    public Components(String name, double price, String packaging) {
        this.name = name;
        this.price = price;
        if(packaging.equals("")) { // Εάν η συσκευασία είναι κενή
            this.packaging = "Assembled"; // Ορίζει τη συσκευασία ως "Boxed"
        } else {
            this.packaging = packaging; // Αλλιώς χρησιμοποιεί την τιμή που δόθηκε
        }
    }

    // Υλοποιούμε τις μέθοδους της διεπαφής Product, όπου επιστρέφουν αντίστοιχα το όνομα, την τιμή, τη συσκευασία
    // και την κατηγορία  του υποσυστήματος.
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
        return ProductCategory.COMPONENTS;
    }
}
