

TechCycle – View Orders Use Case 

-	Περιγραφή ιδέας εφαρμογής:

Η πλατφόρμα TechCycle είναι μια διαδικτυακή εφαρμογή που προσφέρει τη δυνατότητα αγοραπωλησίας μεταχειρισμένων ηλεκτρονικών συσκευών μεταξύ
ενός οργανισμού και των εξωτερικών χρηστών. Η εφαρμογή επιτρέπει στην εταιρεία να αναρτά, μέσω του Υπεύθυνου Πωλήσεων (Sales Manager), προς
πώληση τις διαθέσιμες μεταχειρισμένες συσκευές και οι υπόλοιποι χρήστες μπορούν να αναζητούν προϊόντα και να πραγματοποιούν με ασφάλεια τις αγορές τους.

-	Περιγραφή Use Case:
  
Η περίπτωση χρήσης ‘View Orders’ αφορά τη δυνατότητα του Υπεύθυνου Πωλήσεων (Sales Manager) να βλέπει τα στοιχεία των παραγγελιών που έχουν καταχωρηθεί
στο σύστημα. Πιο συγκεκριμένα, ο χρήστης από την αρχική οθόνη της εφαρμογής επιλέγει να συνδεθεί με username ‘manager’ και κωδικό ΄1234’ και έπειτα
μεταφέρεται στην αρχική οθόνη του Manager (Manager Home) όπου πατάει το κουμπί ‘View Orders’, ώστε να δει τις παραγγελίες που έχουν πραγματοποιηθεί από τους πελάτες.

Actor: Sales Manager

Πληροφορίες που εμφανίζονται για κάθε παραγγελία:
OrderID, Payment Method, Shopping cart ID, Customer Username, Customer Email, Home Address, Total Price, Date

Εναλλακτικές ροές: 

User is not logged in: Ο χρήστης (Sales Manager) πληκτρολόγησε λάθος τα στοιχεία του, με αποτέλεσμα το σύστημα να μην αναγνωρίζει τα user credentials του. 
Skipped the “View Orders” button: Ο χρήστης (Sales Manager) δεν έχει πατήσει το κουμπί “View Orders” και συνεπώς δεν μπορεί μεταβεί στην κατάλληλη οθόνη και να δει το πλήθος των παραγγελιών που έχουν γίνει.


-	Set Up Εφαρμογής

Δημιουργία: 
Για τη δημιουργία της εφαρμογής χρησιμοποιήθηκε το «Spring Initializr» και μετατράπηκε σε Maven project στο «IntelliJ IDEA». Χρησιμοποιήθηκε η Java 21 και Spring Boot 4.0.2.
Στο «Spring Initializr» επιλέχθηκαν τα εξής dependencies: ‘Spring Web’, ‘Thymeleaf’, ‘Spring Security’, ‘Validation’, ‘Spring Data JDBC’ και ‘H2 Database’.

Καθώς η εφαρμογή χρησιμοποιεί τοπική h2 database δε χρειάζεται να συνδεθείτε σε κάποια βάση δεδομένων. Το schema δημιουργείται μέσω του αρχείου ‘shema.sql’ και τα δεδομένα φορτώνονται από το αρχείο ‘data.sql’. 
Η αρχικοποίηση γίνεται αυτόματα.

Εκτέλεση:
Για την εκτέλεση της εφαρμογής μπορείτε να ακολουθήσετε τα παρακάτω βήματα.
1.	Ανοίξτε το project στο IntelliJ.
2.	Εκτελέστε τη main class.
3.	Πληκτρολογήστε την διεύθυνση http://localhost:8080 στον browser.

-	Βήμα-βήμα σενάριο χρήσης

Πληκτρολογώντας τη διεύθυνση  http://localhost:8080 στον browser θα μεταβείτε αυτομάτως στη διεύθυνση  http://localhost:8080/login, καθώς είναι απαραίτητη η σύνδεση του χρήστη
για τη συγκεκριμένη περίπτωση χρήσης (Σημείωση: Δεν έχει υλοποιηθεί η κανονική οθόνη σύνδεσης/ εγγραφής χρήστη της εφαρμογής, διότι αποτελεί ξεχωριστή περίπτωση χρήσης). Στην οθόνη σύνδεσης
εισάγετε username: manager και password: 1234. Στη συνέχεια πατήστε το κουμπί ‘Sign in’ που θα σας μεταφέρει στην αρχική σελίδα του Υπεύθυνου Πωλήσεων. Στον πίνακα διαχείρισης πατήστε το
κουμπί «Προβολή» που υπάρχει κάτω από το κουτί View Orders (Σημείωση: Οι επιλογές “Upload Products” και «Προϊόντα» δεν είναι λειτουργικές καθώς υλοποιούνται σε διαφορετική περίπτωση χρήσης.
Το κουμπί της αποσύνδεσης είναι λειτουργικό). Θα μεταφερθείτε στη σελίδα View Orders όπου είναι ορατά τα στοιχεία για όλες τις καταχωρημένες παραγγελίες. 


-	Χρήση AI

Για τη παρούσα εργασία χρησιμοποίησα τη βοήθεια της τεχνητής νοημοσύνης για φτιάξω τον έλεγχο authentication του χρήστη στο αρχείο ‘SecurityConfig’, 
καθώς δεν είχα κάποια προηγούμενη εμπειρία ή γνώσεις σχετικά με το security framework του Spring Boot. Χρησιμοποίησα το μοντέλο ChatGPT στην έκδοση 5.2 με τη δωρεάν χρήση του για περιορισμένο χρόνο. 

Σημείωση: Ο κώδικας του AI δε χρησιμοποιήθηκε αυτούσιος αλλά έγιναν αρκετές αλλαγές που είναι ορατές στο αποθετήριο του github.

Προτροπή:
«Θέλω να φτιάξω για μία εργασία το use case μιας εφαρμογής στο spring boot. η περίπτωση χρήσης που υλοποιώ ονομάζεται 'προβολή παραγγελιών' και αφορά τη δυνατότητα του υπεύθυνου πωλήσεων μιας ηλεκτρονικής εφαρμογής αγοραπωλησίας να βλέπει τα στοιχεία των παραγγελιών των πελατών. είναι απαραίτητη η σύνδεση/ ταυτοποίηση του χρήστη ώστε να μπορεί να δει αυτά τα στοιχεία. θέλω να μου φτιάξεις ένα αρχείο Security Config όπου να γίνεται η ταυτοποίηση του χρήστη και να υπάρχει και δυνατότητα εξόδου. Ο χρήστης έχει username manager και κωδικό 1234, και έχει τον ρόλο του Manager. μετά τη σύνδεση θα μεταφέρεται στη σελίδα με τις παραγγελίες. Στο spring initializr είχα χρησιμοποιήσει το dependency Spring Security. Ο κώδικας θέλω να είναι απλός καθώς η περίπτωση χρήσης σύνδεσης χρήστη υλοποιείται ξεχωριστά στην εργασία.»

Απάντηση:

« Παρακάτω είναι ένα απλό SecurityConfig για Spring Boot με Spring Security, που καλύπτει:
•	Ταυτοποίηση χρήστη (in-memory) με username: manager και password: 1234
•	Ρόλο MANAGER
•	Απαίτηση να είναι ο χρήστης συνδεδεμένος για να δει οτιδήποτε (π.χ. τη σελίδα παραγγελιών)
•	Αυτόματη μεταφορά μετά το login στη σελίδα προβολής παραγγελιών (/manager/orders)
•	Logout (έξοδος) με τις default ρυθμίσεις
Με αυτό τον τρόπο “κλειδώνεις” την περίπτωση χρήσης Προβολή Παραγγελιών, ώστε μόνο ο υπεύθυνος πωλήσεων (Manager) να μπορεί να δει τα στοιχεία των παραγγελιών μετά από σύνδεση.
package com.myapp.techcycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/error").permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .defaultSuccessUrl("/manager/orders", true)
                        .permitAll()
                )
                .logout(Customizer.withDefaults());

        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager users() {
        UserDetails manager = User.withUsername("manager")
                .password("{noop}1234")
                .roles("MANAGER")
                .build();

        return new InMemoryUserDetailsManager(manager);
    }

}
Πώς “δένει” με το use case «Προβολή Παραγγελιών»
•	Όταν κάποιος πάει να ανοίξει τη σελίδα παραγγελιών (ή οποιαδήποτε άλλη), αν δεν είναι συνδεδεμένος, το Spring Security τον στέλνει στη φόρμα login.
•	Με σωστά στοιχεία (manager / 1234) γίνεται επιτυχής ταυτοποίηση και ο χρήστης μεταφέρεται αυτόματα στο endpoint /manager/orders.
•	Η έξοδος γίνεται από το default endpoint logout του Spring Security (/logout) και μετά ο χρήστης δεν θα έχει πρόσβαση χωρίς νέα σύνδεση.
Αν θέλεις, μπορώ να σου δώσω και ένα πολύ μικρό παράδειγμα controller endpoint για /manager/orders ώστε να “δένει” ολοκληρωμένα με την εργασία.»

