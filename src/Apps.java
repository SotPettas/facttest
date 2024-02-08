

// Κλάση προϊόντος για Εφαρμογές, υλοποίηση ενός προϊόντος που ανήκει στην κατηγορία των εφαρμογών.
// Η κλάση Apps υλοποιεί τη διεπαφή Product
//java

public class Apps implements Product{


    // Σταθερές τιμές για διάφορες εφαρμογές

    public static final double OFFICE_PRICE = 5.0;
    public static final double ANTIVIRUS_PRICE = 7.5;
    public static final double PDFREADER_PRICE = 0.75;

    // Ορίζουμε ιδιωτικά πεδία για το όνομα, την τιμή και τη συσκευασία της εφαρμογής.

        private String name;
        private double price;

        private String packaging;

        // Ορίζουμε σταθερές συμβολοσειρές για τα ονόματα των εφαρμογών.
    public static final String OFFICE = "Office";
    public static final String ANTIVIRUS = "Antivirus";
    public static final String PDFREADER = "PdfReader";


    //Ο κατασκευαστής της κλάσης δέχεται το όνομα, την τιμή και τη συσκευασία της εφαρμογής
    // και τα ορίζει στα αντίστοιχα ιδιωτικά πεδία. Εάν η συσκευασία είναι κενή, τότε ορίζει
    // τη συσκευασία ως "ανευ συσκευασιας".



        public Apps(String name, double price, String packaging) {
            this.name = name;
            this.price = price;
            if(packaging.equals("")) { // Εάν η συσκευασία είναι κενή
                this.packaging = "ανευ συσκευασιας"; // Ορίζει τη συσκευασία ως "Boxed"
            } else {
                this.packaging = packaging; // Αλλιώς χρησιμοποιεί την τιμή που δόθηκε
            }
        }



        // Υλοποιούμε τις μέθοδους της διεπαφής Product, όπου επιστρέφουν αντίστοιχα το όνομα,
    // την τιμή, τη συσκευασία και την κατηγορία της εφαρμογής.




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
        return ProductCategory.APPS;
    }


    }


