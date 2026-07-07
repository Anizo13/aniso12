import java.util.Scanner;
import java.util.Date;
/**

*Aniso Ahmed Mohamud
*id c6240214

Mashruuca: JEEP Mobile Money System (Java Console Application)

Awoodaha: Itus Haraaga, Kaarka Hadalka, Biil Payment, U Wareejin Lacag,

Salaam Bank, Maareynta, iyo English Bill Payment.

NOTE: Code-kan waxaa loo qaabeeyay si fudud (beginner-friendly) isagoo

raacaya shuruudaha ah inaan la isticmaalin Arrays, Methods dheeraad ah,

ama Classes kale. Wax walba waxay ku dhex jiraan main() method-ka.


*/
public class JEEP {
public static void main(String[] args) {
// Scanner u qaabilsan akhriye weyn oo ka qaata input-ka user-ka
Scanner scanner = new Scanner(System.in);

// --- XOGTA ACCOUNT-KA (SYSTEM STATE VARIABLES) ---    
    double balance = 500.00;          // Haraaga Wallet-ka (Default: $500)    
    double salaamBalance = 1000.00;    // Haraaga Salaam Bank (Default: $1000)    
    String pin = "1234";              // PIN-ka default-ka ah ee macaamilka    
    String phoneNumber = "0615123456"; // Number-ka diiwaan gashan    
    boolean isEnglish = false;        // Luuqada (Default waa Somali)    
    boolean running = true;           // Xaalada barnaamijka (haddii uu shaqaynayo)    
    // --- BANNER-KA FURITAANKA BARNAAMIJKA ---    
    System.out.println("*************************************************");    
    System.out.println("*                                               *");    
    System.out.println("*         JEEP MOBILE MONEY SYSTEM              *");    
    System.out.println("*       Ku Soo Dhowaada Adeegeena Sleek         *");    
    System.out.println("*                                               *");    
    System.out.println("*************************************************");    
    // Loop-ka weyn ee barnaamijka maamulaya    
    while (running) {    
            
        // --- 1. SOO BANDHIGIDDA MENU-GA UGU WEYN (MAIN MENU) ---    
        if (!isEnglish) {    
            System.out.println("\n============ MENU-GA UGU WEYN ============");    
            System.out.println("  1. Itus Haraaga (Check Balance)");    
            System.out.println("  2. Kaarka Hadalka (Airtime & Data)");    
            System.out.println("  3. Bixi Biil (Pay Bill)");    
            System.out.println("  4. U Wareeji Lacag (Transfer Money)");    
            System.out.println("  5. Warbixin Kooban (Mini Statement)");    
            System.out.println("  6. Salaam Bank");    
            System.out.println("  7. Maareynta (Management)");    
            System.out.println("  8. Bill Payment (English)");    
            System.out.println("  9. Exit (Ka Bax)");    
            System.out.println("==========================================");    
            System.out.print("Dooro adeega aad rabto (1-9): ");    
        } else {    
            System.out.println("\n============ MAIN MENU ============");    
            System.out.println("  1. Check Balance");    
            System.out.println("  2. Airtime & Data");    
            System.out.println("  3. Pay Bill");    
            System.out.println("  4. Transfer Money");    
            System.out.println("  5. Mini Statement");    
            System.out.println("  6. Salaam Bank");    
            System.out.println("  7. Management");    
            System.out.println("  8. Bill Payment (English)");    
            System.out.println("  9. Exit");    
            System.out.println("===================================");    
            System.out.print("Select the service (1-9): ");    
        }    
        // Hubinta in user-ku uu galiyay lambar sax ah    
        if (!scanner.hasNextInt()) {    
            System.out.println(isEnglish ? "\n[✘] Invalid input! Please enter a number from 1 to 9."     
                                         : "\n[✘] Gelin khaldan! Fadlan geli lambar u dhexeeya 1 iyo 9.");    
            scanner.nextLine(); // buffer clear-gareyso    
            continue;    
        }    
            
        int choice = scanner.nextInt();    
        scanner.nextLine(); // Waxaa loo baahan yahay in buffer-ka la clear-gareeyo si aysan nextLine() u boodin mar dambe    
        // --- 2. MAAREYNTA MENU-YADA (SWITCH CASE ON CHOICE) ---    
        switch (choice) {    
                
            case 1: {    
                // --- CASE 1: ITUS HARAAGA / CHECK BALANCE ---    
                System.out.print(isEnglish ? "Enter your PIN: " : "Geli PIN-kaaga: ");    
                String enteredPin1 = scanner.nextLine();    
                System.out.print(isEnglish ? "Repeat PIN to confirm: " : "Ku celi PIN-kaaga si aad u xaqiijiso: ");    
                String enteredPin2 = scanner.nextLine();    
                    
                if (enteredPin1.equals(enteredPin2)) {    
                    if (enteredPin1.equals(pin)) {    
                        System.out.println("\n------------------------------------------");    
                        if (!isEnglish) {    
                            System.out.printf("[✔] Haraaga account-kaaga hadda waa: $%.2f\n", balance);    
                        } else {    
                            System.out.printf("[✔] Your current account balance is: $%.2f\n", balance);    
                        }    
                        System.out.println("------------------------------------------");    
                    } else {    
                        System.out.println(isEnglish ? "\n[✘] Incorrect PIN!" : "\n[✘] PIN waa khaldan yahay.");    
                    }    
                } else {    
                    System.out.println(isEnglish ? "\n[✘] PINs do not match! Access Denied."     
                                                 : "\n[✘] PIN-yadu isma laha! Masiirihii waa la joojiyay.");    
                }    
                break;    
            }    
            case 2: {    
                // --- CASE 2: KAARKA HADALKA / AIRTIME & DATA (NESTED MENU) ---    
                boolean subRunning = true;    
                while (subRunning) {    
                    if (!isEnglish) {    
                        System.out.println("\n--- ADEEGA KAARKA HADALKA (AIRTIME & DATA) ---");    
                        System.out.println("  1. Ku Shubo Airtime Naftaada");    
                        System.out.println("  2. Ku Shubo Airtime Qof Kale");    
                        System.out.println("  3. Ku Iibso Data");    
                        System.out.println("  4. Ka bixi (Go Back)");    
                        System.out.println("----------------------------------------------");    
                        System.out.print("Dooro adeega (1-4): ");    
                    } else {    
                        System.out.println("\n--- AIRTIME & DATA SERVICES ---");    
                        System.out.println("  1. Recharge Airtime for Yourself");    
                        System.out.println("  2. Recharge Airtime for Someone Else");    
                        System.out.println("  3. Buy Data Bundles");    
                        System.out.println("  4. Go Back");    
                        System.out.println("----------------------------------------");    
                        System.out.print("Select option (1-4): ");    
                    }    
                    if (!scanner.hasNextInt()) {    
                        System.out.println(isEnglish ? "\n[✘] Invalid option!" : "\n[✘] Dooro khaldan!");    
                        scanner.nextLine();    
                        continue;    
                    }    
                        
                    int subChoice = scanner.nextInt();    
                    scanner.nextLine(); // Clear scanner buffer    
                    if (subChoice == 1) {    
                        // Airtime for self    
                        System.out.print(isEnglish ? "Enter Airtime Amount: $" : "Geli Lacagta Airtime-ka: $");    
                        double amount = scanner.nextDouble();    
                        scanner.nextLine(); // Clear buffer    
                            
                        if (amount <= 0) {    
                            System.out.println(isEnglish ? "\n[✘] Invalid amount!" : "\n[✘] Lacag khaldan!");    
                            continue;    
                        }    
                        if (amount > balance) {    
                            System.out.println(isEnglish ? "\n[✘] Insufficient balance!" : "\n[✘] Haraagaagu kuma filna.");    
                            continue;    
                        }    
                            
                        System.out.print(isEnglish ? "Enter PIN: " : "Geli PIN: ");    
                        String enteredPin1 = scanner.nextLine();    
                        System.out.print(isEnglish ? "Repeat PIN to confirm: " : "Ku celi PIN si aad u xaqiijiso: ");    
                        String enteredPin2 = scanner.nextLine();    
                            
                        if (enteredPin1.equals(enteredPin2)) {    
                            if (enteredPin1.equals(pin)) {    
                                balance -= amount;    
                                System.out.println("\n------------------------------------------");    
                                if (!isEnglish) {    
                                    System.out.printf("[✔] Waad ku guuleysatay! Waxaad $%.2f ku shubatay telefoonkaaga.\nHaraagaaga cusub waa: $%.2f\n", amount, balance);    
                                } else {    
                                    System.out.printf("[✔] Recharge successful! You loaded $%.2f airtime for yourself.\nNew Balance: $%.2f\n", amount, balance);    
                                }    
                                System.out.println("------------------------------------------");    
                            } else {    
                                System.out.println(isEnglish ? "\n[✘] Incorrect PIN!" : "\n[✘] PIN waa khaldan yahay.");    
                            }    
                        } else {    
                            System.out.println(isEnglish ? "\n[✘] PINs do not match!" : "\n[✘] PIN-yadu isma laha!");    
                        }    
                            
                    } else if (subChoice == 2) {    
                        // Airtime for someone else    
                        System.out.print(isEnglish ? "Enter receiver's phone number: " : "Geli number-ka telefoonka ee loo shubayo: ");    
                        String targetNumber = scanner.nextLine();    
                            
                        System.out.print(isEnglish ? "Enter Airtime Amount: $" : "Geli Lacagta Airtime-ka: $");    
                        double amount = scanner.nextDouble();    
                        scanner.nextLine(); // Clear buffer    
                            
                        if (amount <= 0) {    
                            System.out.println(isEnglish ? "\n[✘] Invalid amount!" : "\n[✘] Lacag khaldan!");    
                            continue;    
                        }    
                        if (amount > balance) {    
                            System.out.println(isEnglish ? "\n[✘] Insufficient balance!" : "\n[✘] Haraagaagu kuma filna.");    
                            continue;    
                        }    
                            
                        System.out.print(isEnglish ? "Enter PIN: " : "Geli PIN: ");    
                        String enteredPin1 = scanner.nextLine();    
                        System.out.print(isEnglish ? "Repeat PIN to confirm: " : "Ku celi PIN si aad u xaqiijiso: ");    
                        String enteredPin2 = scanner.nextLine();    
                            
                        if (enteredPin1.equals(enteredPin2)) {    
                            if (enteredPin1.equals(pin)) {    
                                balance -= amount;    
                                System.out.println("\n------------------------------------------");    
                                if (!isEnglish) {    
                                    System.out.printf("[✔] Waad ku guuleysatay! Waxaad $%.2f airtime ah u dirtay lambarka %s.\nHaraagaaga hadda waa: $%.2f\n", amount, targetNumber, balance);    
                                } else {    
                                    System.out.printf("[✔] Success! You sent $%.2f airtime to %s.\nYour remaining balance is: $%.2f\n", amount, targetNumber, balance);    
                                }    
                                System.out.println("------------------------------------------");    
                            } else {    
                                System.out.println(isEnglish ? "\n[✘] Incorrect PIN!" : "\n[✘] PIN waa khaldan yahay.");    
                            }    
                        } else {    
                            System.out.println(isEnglish ? "\n[✘] PINs do not match!" : "\n[✘] PIN-yadu isma laha!");    
                        }    
                            
                    } else if (subChoice == 3) {    
                        // Buy Data Bundles    
                        if (!isEnglish) {    
                            System.out.println("\n--- XIRMOOYINKA DATA-DA (DATA BUNDLES) ---");    
                            System.out.println("  1. Xirmo Maalinle ($1.00 = 2GB)");    
                            System.out.println("  2. Xirmo Todobaadle ($2.00 = 5GB)");    
                            System.out.println("  3. Xirmo Bishaar ($5.00 = 15GB)");    
                            System.out.println("------------------------------------------");    
                            System.out.print("Dooro xirmo (1-3): ");    
                        } else {    
                            System.out.println("\n--- DATA BUNDLES SELECTION ---");    
                            System.out.println("  1. Daily Pack ($1.00 = 2GB)");    
                            System.out.println("  2. Weekly Pack ($2.00 = 5GB)");    
                            System.out.println("  3. Monthly Pack ($5.00 = 15GB)");    
                            System.out.println("------------------------------------------");    
                            System.out.print("Select bundle (1-3): ");    
                        }    
                            
                        if (!scanner.hasNextInt()) {    
                            System.out.println(isEnglish ? "\n[✘] Invalid bundle!" : "\n[✘] Xirmo khaldan!");    
                            scanner.nextLine();    
                            continue;    
                        }    
                        int dataChoice = scanner.nextInt();    
                        scanner.nextLine(); // Clear buffer    
                            
                        double dataCost = 0;    
                        String dataVolume = "";    
                            
                        if (dataChoice == 1) {    
                            dataCost = 1.00;    
                            dataVolume = "2GB (Daily)";    
                        } else if (dataChoice == 2) {    
                            dataCost = 2.00;    
                            dataVolume = "5GB (Weekly)";    
                        } else if (dataChoice == 3) {    
                            dataCost = 5.00;    
                            dataVolume = "15GB (Monthly)";    
                        } else {    
                            System.out.println(isEnglish ? "\n[✘] Invalid option!" : "\n[✘] Dooro khaldan!");    
                            continue;    
                        }    
                            
                        if (dataCost > balance) {    
                            System.out.println(isEnglish ? "\n[✘] Insufficient balance!" : "\n[✘] Haraagaagu kuma filna.");    
                            continue;    
                        }    
                            
                        System.out.print(isEnglish ? "Enter PIN: " : "Geli PIN: ");    
                        String enteredPin1 = scanner.nextLine();    
                        System.out.print(isEnglish ? "Repeat PIN to confirm: " : "Ku celi PIN si aad u xaqiijiso: ");    
                        String enteredPin2 = scanner.nextLine();    
                            
                        if (enteredPin1.equals(enteredPin2)) {    
                            if (enteredPin1.equals(pin)) {    
                                balance -= dataCost;    
                                System.out.println("\n------------------------------------------");    
                                if (!isEnglish) {    
                                    System.out.printf("[✔] Waad ku guuleysatay! Waxaad iibsatay xirmo data ah oo ah %s.\nHaraagaaga cusub waa: $%.2f\n", dataVolume, balance);    
                                } else {    
                                    System.out.printf("[✔] Success! You bought a %s data pack.\nNew Balance: $%.2f\n", dataVolume, balance);    
                                }    
                                System.out.println("------------------------------------------");    
                            } else {    
                                System.out.println(isEnglish ? "\n[✘] Incorrect PIN!" : "\n[✘] PIN waa khaldan yahay.");    
                            }    
                        } else {    
                            System.out.println(isEnglish ? "\n[✘] PINs do not match!" : "\n[✘] PIN-yadu isma laha!");    
                        }    
                            
                    } else if (subChoice == 4) {    
                        subRunning = false;    
                    } else {    
                        System.out.println(isEnglish ? "\n[✘] Invalid choice!" : "\n[✘] Dooro khaldan!");    
                    }    
                }    
                break;    
            }    
            case 3: {    
                // --- CASE 3: BIXI BIIL / PAY BILL (SOMALI MENU) ---    
                boolean billRunning = true;    
                while (billRunning) {    
                    System.out.println("\n--- ADEEGA BIXINTA BIILASHA ---");    
                    System.out.println("  1. Bixi Koronto (Electricity)");    
                    System.out.println("  2. Bixi Biyo (Water)");    
                    System.out.println("  3. Bixi Internet");    
                    System.out.println("  4. Ka bixi (Go Back)");    
                    System.out.println("--------------------------------");    
                    System.out.print("Dooro biilka (1-4): ");    
                        
                    if (!scanner.hasNextInt()) {    
                        System.out.println("\n[✘] Gelin khaldan!");    
                        scanner.nextLine();    
                        continue;    
                    }    
                        
                    int billChoice = scanner.nextInt();    
                    scanner.nextLine(); // Clear buffer    
                        
                    if (billChoice == 4) {    
                        billRunning = false;    
                        break;    
                    }    
                        
                    String billType = "";    
                    if (billChoice == 1) {    
                        billType = "Koronto (Electricity)";    
                    } else if (billChoice == 2) {    
                        billType = "Biyo (Water)";    
                    } else if (billChoice == 3) {    
                        billType = "Internet";    
                    } else {    
                        System.out.println("\n[✘] Dooro khaldan!");    
                        continue;    
                    }    
                        
                    System.out.print("Geli Account Number-ka Biilka: ");

Code waxa raba ina i hubisid inu saxan yahay