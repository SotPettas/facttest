
// Κλάση διεπαφής προϊόντος

//ορίζει τις μεθόδους που πρέπει να υλοποιούνται από οποιαδήποτε κλάση που ανήκει στον τύπο των προϊόντων στο σύστημά μας.
public interface Product {
    String getName();    // Επιστρέφει το όνομα του προϊόντος
    double getPrice();   // Επιστρέφει την τιμή του προϊόντος
    String getPackage();  // Επιστρέφει τον τύπο συσκευασίας του προϊόντος

    ProductCategory getCategory();  // επιστρέφει την κατηγορία στην οποία ανήκει το προϊόν,
    // όπως ορίζεται από το enum ProductCategory.
}
