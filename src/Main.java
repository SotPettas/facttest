//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    // στατική μεταβλητή orderNumber, η οποία χρησιμοποιείται για την αρίθμηση των παραγγελιών.

    private static int orderNumber = 1;


    // Δημιουργεί ένα αντικείμενο της κλάσης SimpleOrderFactory και χρησιμοποιεί την μέθοδο SimpleOrderFactory
    // για να δημιουργήσει προϊόντα για δύο παραγγελίες.

    public static void main(String[] args) {



        SimpleOrderFactory factory = new SimpleOrderFactory();

        // Παραγγελία 1
        Product os1 = factory.createProduct(ProductCategory.OS, "Linux", Os.LINUX_PRICE, "");
        Product app1 = factory.createProduct(ProductCategory.APPS, "Office", Apps.OFFICE_PRICE, "");
        Product peripheral1 = factory.createProduct(ProductCategory.PERIPHERALS, "monitor", Peripherals.MONITOR_PRICE, "");
        Product component1 = factory.createProduct(ProductCategory.COMPONENTS, "cpu", Components.CPU_PRICE, "");
        Product component1a = factory.createProduct(ProductCategory.COMPONENTS, "gpu", Components.GPU_PRICE, "");


        displayProductInfo(os1);
        displayProductInfo(app1);
        displayProductInfo(peripheral1);
        displayProductInfo(component1);
        displayProductInfo(component1a);

        double total1 = calculateTotal(os1, app1, peripheral1, component1a, component1);

        System.out.println("Συνολική αξία παραγγελίας 1: " + orderNumber +  total1 + " ευρώ");
        System.out.println();

        orderNumber++;

        // Παραγγελία 2
        Product os2 = factory.createProduct(ProductCategory.OS, "Mac", Os.MAC_PRICE, "");
        Product app2 = factory.createProduct(ProductCategory.APPS, "Antivirus", Apps.ANTIVIRUS_PRICE, "");
        Product peripheral2 = factory.createProduct(ProductCategory.PERIPHERALS, "mouse", Peripherals.MOUSE_PRICE, "");

        displayProductInfo(os2);
        displayProductInfo(app2);
        displayProductInfo(peripheral2);

        double total2 = calculateTotal(os2, app2, peripheral2);

        System.out.println("Συνολική αξία παραγγελίας 2: " + orderNumber +  total2 + " ευρώ");
    }

    //η μέθοδος δέχεται ένα αντικείμενο προϊόντος και εμφανίζει τις πληροφορίες του, όπως το όνομα, η κατηγορία,
    // η τιμή και η συσκευασία. Ελέγχει επίσης εάν το προϊόν είναι null πριν εμφανίσει τις πληροφορίες του.

    public static void displayProductInfo(Product product) {
        if (product != null) {

        System.out.println("Παραγγελία " + orderNumber + ":");
        System.out.println("Όνομα προϊόντος: " + product.getName());
        System.out.println("Κατηγορία προϊόντος: " + product.getCategory());
        System.out.println("Τιμή: " + product.getPrice() + " ευρώ");
        System.out.println("Συσκευασία: " + product.getPackage()); // Εμφάνιση συσκευασίας
        System.out.println();
    } else {
        System.out.println("Το προϊόν είναι null.");
    }
    }

    // η μέθοδος δέχεται ένα ή περισσότερα  προϊόντα και υπολογίζει το συνολικό κόστος τους προσθέτοντας τις τιμές τους.

    public static double calculateTotal(Product... products) {
        double total = 0;
        for (Product product : products) {
            if (product != null) {
                total += product.getPrice();
            }
        }
        return total;
    }


    }
