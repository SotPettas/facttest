public class SimpleOrderFactory {

    //   Δήλωση Μεταβλητών: Η κλάση έχει μια σειρά από στατικές μεταβλητές που καθορίζουν τα έγκυρα ονόματα προϊόντων
    //   για κάθε κατηγορία.
    private static final String[] VALID_APPS = {Apps.OFFICE, Apps.ANTIVIRUS, Apps.PDFREADER};
    private static final String[] VALID_OS = {Os.MAC, Os.LINUX, Os.WINDOWS};
    private static final String[] VALID_PERIPHERALS = {Peripherals.MONITOR, Peripherals.KEYBOARD, Peripherals.MOUSE};

    private static final String[] VALID_COMPONENTS = {Components.CPU, Components.GPU, Components.SSD, Components.RAM, Components.MOTHERBOARD};


    //Αυτή η μέθοδος δέχεται την κατηγορία, το όνομα, την τιμή και τη συσκευασία του προϊόντος που θα δημιουργηθεί.
    // Ελέγχει αν το όνομα του προϊόντος είναι έγκυρο για τη συγκεκριμένη κατηγορία και δημιουργεί το αντίστοιχο αντικείμενο
    // προϊόντος. Εάν το όνομα δεν είναι έγκυρο, επιστρέφει null.

    public Product createProduct(ProductCategory category, String name,  double price, String packaging) {
        if (!isValidProduct(category, name)) {
            return null; // Επιστρέφει null αν το όνομα του προϊόντος δεν είναι έγκυρο για την συγκεκριμένη κατηγορία
        }

        // αναγνώριση της κατηγορία του προϊόντος γιαι να επιστρέψει το αντίστοιχο αντικείμενο προϊόντος.

        switch (category) {
            case APPS:
                return new Os(name, price, packaging);
            case OS:
                return new Apps(name, price, packaging);
            case PERIPHERALS:
                return new Peripherals(name, price, packaging);
            case COMPONENTS:
                return new Peripherals(name, price, packaging);
            default:
                return null;
        }
    }


    // ελέγχος για την εγκυρότητα του ονόματος του προϊόντος για κάθε κατηγορία,
    private boolean isValidProduct(ProductCategory category, String name) {
        switch (category) {
            case APPS:
                return isValidApps(name);
            case OS:
                return isValidOs(name);
            case PERIPHERALS:
                return isValidPeripherilas(name);
            case COMPONENTS:
                return isValidComponents(name);
            default:
                return false;
        }
    }


    private boolean isValidComponents(String name) {

        for (String drink : VALID_COMPONENTS) {
            if (drink.equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidPeripherilas(String name) {
        for (String drink : VALID_PERIPHERALS) {
            if (drink.equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidOs(String name) {
        for (String drink : VALID_OS) {
            if (drink.equals(name)) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidApps(String name) {

        for (String drink : VALID_APPS) {
            if (drink.equals(name)) {
                return true;
            }
        }
        return false;
    }


}










