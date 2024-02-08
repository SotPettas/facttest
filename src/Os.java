

// υλοποίηση ενός προϊόντος που ανήκει στην κατηγορία των λειτουργικών συστημάτων.

//Η κλάση υλοποιεί τη διεπαφή Product.

public class Os implements Product{

    // Ορίζουμε σταθερές τιμές για τις τιμές των διαφόρων λειτουργικών συστημάτων.

    public static final double MAC_PRICE = 18.0;
    public static final double LINUX_PRICE = 19.8;
    public static final double WINDOWS_PRICE = 20.95;

   // Ορίζουμε ιδιωτικά πεδία για το όνομα, την τιμή και τη συσκευασία του λειτουργικού συστήματος.

    private String name;
    private double price;

    private String packaging;

    // Ορίζουμε σταθερές συμβολοσειρές για τα ονόματα των λειτουργικών συστημάτων.

    public static final String MAC = "Mac";
    public static final String LINUX = "Linux";
    public static final String WINDOWS = "Windows";

    //Ο κατασκευαστής της κλάσης δέχεται το όνομα, την τιμή και τη συσκευασία του λειτουργικού συστήματος και τα ορίζει
    // στα αντίστοιχα ιδιωτικά πεδία. Εάν η συσκευασία είναι κενή, τότε ορίζει τη συσκευασία ως "ανευ συσκευασιας".



    public Os(String name, double price, String packaging) {
        this.name = name;
        this.price = price;
        if(packaging.equals("")) { // Εάν η συσκευασία είναι κενή
            this.packaging = "ανευ συσκευασιας"; // Ορίζει τη συσκευασία ως "Assembled"
        } else {
            this.packaging = packaging; // Αλλιώς χρησιμοποιεί την τιμή που δόθηκε
        }
    }

    //  Υλοποιούμε τις μέθοδους της διεπαφής Product, όπου επιστρέφουν αντίστοιχα το όνομα, την τιμή,
    //  τη συσκευασία και την κατηγορία του λειτουργικού συστήματος.

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
        return ProductCategory.OS;
    }


}
