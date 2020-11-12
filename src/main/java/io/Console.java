package io;
import models.Cymbal;
import models.SnareDrum;
import services.CymbalService;
import services.SnareDrumService;

import java.util.Scanner;

public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {

    }


    public String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(String.valueOf(prompt));
        Integer userInput = Integer.valueOf(scanner.nextLine());
        return userInput;
    }

    public Float getFloatInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(String.valueOf(prompt));
        Float userInput = Float.valueOf(scanner.next());
        return userInput;
    }

    //welcome
    public static void printWelcome() {
        System.out.println("" +
                "**************************************************" +
                "***           Welcome and Bienvenue            ***" +
                "***                    to                      ***" +
                "***          ZipCo Inventory Manager           ***" +
                "**************************************************");

    }






  /*
        Not sure if I need these yet
  public Integer getDisplayMenuInput(){}
    public Integer getProductMenuInput(){}



   */

    public static void mainMenu() {
        Scanner scannerMain = new Scanner(System.in);
        String MainMenuDisplay = ("Main Menu: \n Create New Product: 1\n Read All Products: 2\n Update Product: 3\n Delete Product: 4\n Get Report: 5\n Exit: 6");


        System.out.println(MainMenuDisplay);
        Integer i = Integer.valueOf(scannerMain.next());
        switch (i) {
            case 1:
                createProductMenu();
                break;
            case 2:
                findAllProductMenu();
                break;
            case 3:
                updateProductMenu();
                break;
            case 4:
                deleteProductMenu();
                break;
            case 5:
                getReportMenu();
                break;
            case 6:
                exit();
                break;
            default:
                Console.println("Invalid input. Please try that again.");
                System.out.println(MainMenuDisplay);
                break;
        }

    }

    //displays menu of products to create
    public static void createProductMenu() {
        Scanner scanner = new Scanner(System.in);
        String ProductMenu = ("Choose product type to add:\n Snare Drum: 1\n Cymbal: 2\n Return to Main: 3\n Exit: 4\n");
        System.out.println(ProductMenu);

        Integer i = Integer.valueOf(scanner.next());

        switch (i) {
            case 1:
                createSnareMenu();
                break;
            case 2:
                createCymbalMenu();
                break;
            case 3:
                returnToMain();
                break;
            case 4:
                exit();
                break;
            default:
                Console.println("Invalid input. Please try that again.");
                break;
        }
    }

    //creates and adds snare obj to inventory
    public static void createSnareMenu() {
        SnareDrumService newSnareDrum = new SnareDrumService();
        SnareDrum createdSnareDrum = new SnareDrum();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter snare drum depth:");
        int depth = Integer.valueOf(scanner.next());
        System.out.println("Enter snare drum brand:");
        String brand = String.valueOf(scanner.next());
        scanner.nextLine();
        System.out.println("Enter snare drum name:");
        String name = String.valueOf(scanner.next());
        scanner.nextLine();
        System.out.println("Enter snare drum shell type:");
        String shellType = String.valueOf(scanner.next());
        scanner.nextLine();
        System.out.println("Enter snare drum quantity:");
        int qty = Integer.valueOf(scanner.next());
        scanner.nextLine();
        System.out.println("Enter snare drum price:");
        float price = Integer.valueOf(scanner.next());
        scanner.nextLine();

        createdSnareDrum = newSnareDrum.create(depth, brand, name, shellType, qty, price);
        //String outputSnareDrum = createdSnareDrum.toString();
        //String printSnareDrum = String.valueOf(outputSnareDrum);
        //System.out.println(printSnareDrum);
        mainMenu();

    }

    //creates and adds cymbal obj to inventory
    public static void createCymbalMenu() {
        CymbalService newCymbal = new CymbalService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cymbal size:");
        int size = Integer.valueOf(scanner.next());
        scanner.nextLine();
        System.out.println("Enter cymbal brand:");
        String brand = String.valueOf(scanner.next());
        scanner.nextLine();
        System.out.println("Enter cymbal name:");
        String name = String.valueOf(scanner.next());
        scanner.nextLine();
        System.out.println("Enter cymbal type:");
        String type = String.valueOf(scanner.next());
        scanner.nextLine();
        System.out.println("Enter cymbal quantity:");
        int qty = Integer.valueOf(scanner.next());
        scanner.nextLine();
        System.out.println("Enter cymbal price:");
        float price = Integer.valueOf(scanner.next());

        newCymbal.create(size, brand, name, type, price, qty);
        mainMenu();
    }

    //displays all products (needs to call 2 methods -- each find all in service classes)
    public static void findAllProductMenu() {

        Scanner scanner = new Scanner(System.in);
        String findAllMenu = ("Choose an option:\n View Complete Inventory: 1\n Main Menu: 2\n Exit: 3");
        System.out.println(findAllMenu);

        Integer i = Integer.valueOf(scanner.next());

        switch (i) {
            case 1:
                CymbalService allCymbals = new CymbalService();
                System.out.println(allCymbals.findAll());

                SnareDrumService allSnareDrums = new SnareDrumService();
                System.out.println(allSnareDrums.findAll());

                mainMenu();

                break;
            case 2:
                returnToMain();
                break;
            case 3:
                exit();
                break;
            default:
                Console.println("Invalid input. Please try that again.");
                break;

        }

    }

    //switch statement through models and then users sub switch statements to set the new values
    public static void updateProductMenu() {
        Scanner scanner = new Scanner(System.in);
        String enterID = ("Choose the product you'd like to update:\n Snare Drum: 1\n Cymbal: 2\n Return to Main Menu: 3\n Exit: 4\n");
        System.out.println(enterID);
        Integer i = Integer.valueOf(scanner.next());

        switch (i) {
            case 1:
                getSnareIdInput();
                System.out.println(snareUpdateMenu());

                mainMenu();

                break;
            case 2:
                getCymbalIdInput();
                System.out.println(cymbalUpdateMenu());

                mainMenu();
                break;
            case 3:
                returnToMain();
                break;
            case 4:
                exit();
                break;
            default:
                Console.println("Invalid input. Please try that again.");
                break;
        }


    }

    // get snare ID input
    public static SnareDrum getSnareIdInput() {
        Scanner scanner = new Scanner(System.in);
        SnareDrumService findSnare = new SnareDrumService();

        String enterID = ("Please enter the ID number for the snare drum you'd like to update.");
        System.out.println(enterID);
        Integer i = Integer.valueOf(scanner.next());
       SnareDrum newSnareDrum = new SnareDrum();
       newSnareDrum = findSnare.find(i);

       mainMenu();

       return newSnareDrum;


        //System.out.println(snareUpdateMenu());

    }

    //menu to update one of the snare product fields
    public static SnareDrum snareUpdateMenu() {
        Scanner scanner = new Scanner(System.in);

        String fieldToUpdate = ("Choose the field you'd like to update:\n Depth: 1\n Brand: 2\n Name: 3\n Shell Type: 4\n Quantity: 5\n Price: 6\n Return to Product Menu: 7\n Return to Main Menu: 8\n Exit: 9");
        System.out.println(fieldToUpdate);
        Integer i = Integer.valueOf(scanner.next());

        String snareMenuOptions = ("What would you like to do next:\n Add another snare update: 1\n Return to menu to update more products: 2\n Return to Main Menu: 3\n Exit: 4");

        switch (i) {
            case 1:

                System.out.println("Please enter the depth:");
                Integer newDepth = Integer.valueOf(scanner.next());

                SnareDrum updatedDepthSnareDrum = new SnareDrum();
                updatedDepthSnareDrum.setDepth(newDepth);
                System.out.println(updatedDepthSnareDrum);


                System.out.println(snareMenuOptions);

                Integer j = Integer.valueOf(scanner.next());

                switch (j){
                    case 1: snareUpdateMenu();
                    break;
                    case 2: updateProductMenu();
                    break;
                    case 3: mainMenu();
                    break;
                    case 4: exit();
                    break;
                    default: Console.println("Invalid input. Please try that again.");
                        System.out.println(snareMenuOptions);
                    break;
                }
                break;
            case 2:
                System.out.println("Please enter the brand:");
                String newBrand = String.valueOf(scanner.next());

                SnareDrum updatedBrandSnareDrum = new SnareDrum();
                updatedBrandSnareDrum.setBrand(newBrand);
                System.out.println(updatedBrandSnareDrum);


                System.out.println(snareMenuOptions);

                Integer k = Integer.valueOf(scanner.next());

                switch (k){
                    case 1: snareUpdateMenu();
                        break;
                    case 2: updateProductMenu();
                        break;
                    case 3: mainMenu();
                        break;
                    case 4: exit();
                        break;
                    default: Console.println("Invalid input. Please try that again.");
                        System.out.println(snareMenuOptions);
                        break;
                }

                break;
            case 3:
                System.out.println("Please enter the name:");
                String newName = String.valueOf(scanner.next());

                SnareDrum updatedNameSnareDrum = new SnareDrum();
                updatedNameSnareDrum.setName(newName);
                System.out.println(updatedNameSnareDrum);


                System.out.println(snareMenuOptions);

                Integer l = Integer.valueOf(scanner.next());

                switch (l){
                    case 1: snareUpdateMenu();
                    break;
                    case 2: updateProductMenu();
                    break;
                    case 3: mainMenu();
                    break;
                    case 4: exit();
                    break;
                    default: Console.println("Invalid input. Please try that again.");
                        System.out.println(snareMenuOptions);
                    break;
                }

                break;
            case 4:
                System.out.println("Please enter the shell type:");
                String newShellType = String.valueOf(scanner.next());

                SnareDrum updatedShellTypeSnareDrum = new SnareDrum();
                updatedShellTypeSnareDrum.setShellType(newShellType);
                System.out.println(updatedShellTypeSnareDrum);

                System.out.println(snareMenuOptions);

                Integer m = Integer.valueOf(scanner.next());

                switch (m){
                    case 1: snareUpdateMenu();
                        break;
                    case 2: updateProductMenu();
                        break;
                    case 3: mainMenu();
                        break;
                    case 4: exit();
                        break;
                    default: Console.println("Invalid input. Please try that again.");
                        System.out.println(snareMenuOptions);
                        break;
                }

                break;

            case 5:

                System.out.println("Please enter the quantity:");
                Integer newQty = Integer.valueOf(scanner.next());

                SnareDrum updatedQtySnareDrum = new SnareDrum();
                updatedQtySnareDrum.setQty(newQty);
                System.out.println(updatedQtySnareDrum);

                System.out.println(snareMenuOptions);

                Integer n = Integer.valueOf(scanner.next());

                switch(n){

                    case 1: snareUpdateMenu();
                        break;
                    case 2: updateProductMenu();
                        break;
                    case 3: mainMenu();
                        break;
                    case 4: exit();
                        break;
                    default: Console.println("Invalid input. Please try that again.");
                        System.out.println(snareMenuOptions);
                        break;
                }
                break;
            case 6:
                System.out.println("Please enter the price:");
                Integer newPrice = Integer.valueOf(scanner.next());

                SnareDrum updatedPriceSnareDrum = new SnareDrum();
                updatedPriceSnareDrum.setPrice(newPrice);
                System.out.println(updatedPriceSnareDrum);

                System.out.println(snareMenuOptions);

                Integer p = Integer.valueOf(scanner.next());

                switch(p){

                    case 1: snareUpdateMenu();
                        break;
                    case 2: updateProductMenu();
                        break;
                    case 3: mainMenu();
                        break;
                    case 4: exit();
                        break;
                    default: Console.println("Invalid input. Please try that again.");
                    System.out.println(snareMenuOptions);
                        break;
                }
                break;
            case 7:
                updateProductMenu();
                break;
            case 8:
                returnToMain();
                break;
            case 9:
                exit();
                break;
            default:
                Console.println("Invalid input. Please try that again.");
                break;
        }
        SnareDrum newSnareDrum = new SnareDrum();
        return newSnareDrum;
    }

    //menu to update Cymbal product fields
        public static Cymbal cymbalUpdateMenu() {

            Scanner scanner = new Scanner(System.in);

            String fieldToUpdate = ("Choose the field you'd like to update:\n Size: 1\n Brand: 2\n Name: 3\n Type: 4\n Quantity: 5\n Price: 6\n Return to Product Menu: 7\n Return to Main Menu: 8\n Exit: 9");
            System.out.println(fieldToUpdate);
            Integer i = Integer.valueOf(scanner.next());

            String cymbalMenuOptions = ("What would you like to do next:\n Add another cymbal update: 1\n Return to menu to update more products: 2\n Return to Main Menu: 3\n Exit: 4");

            switch (i) {
                case 1:

                    System.out.println("Please enter the size:");
                    Integer newSize = Integer.valueOf(scanner.next());

                    Cymbal updatedSizeCymbal = new Cymbal();
                    updatedSizeCymbal.setSize(newSize);
                    System.out.println(updatedSizeCymbal);


                    System.out.println(cymbalMenuOptions);

                    Integer j = Integer.valueOf(scanner.next());

                    switch (j){
                        case 1: cymbalUpdateMenu();
                            break;
                        case 2: updateProductMenu();
                            break;
                        case 3: mainMenu();
                            break;
                        case 4: exit();
                            break;
                        default: Console.println("Invalid input. Please try that again.");
                            System.out.println(cymbalMenuOptions);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Please enter the brand:");
                    String newBrand = String.valueOf(scanner.next());

                    Cymbal updatedBrandCymbal = new Cymbal();
                    updatedBrandCymbal.setBrand(newBrand);
                    System.out.println(updatedBrandCymbal);


                    System.out.println(cymbalMenuOptions);

                    Integer k = Integer.valueOf(scanner.next());

                    switch (k){
                        case 1: cymbalUpdateMenu();
                            break;
                        case 2: updateProductMenu();
                            break;
                        case 3: mainMenu();
                            break;
                        case 4: exit();
                            break;
                        default: Console.println("Invalid input. Please try that again.");
                            System.out.println(cymbalMenuOptions);
                            break;
                    }

                    break;
                case 3:
                    System.out.println("Please enter the name:");
                    String newName = String.valueOf(scanner.next());

                    Cymbal updatedNameCymbal = new Cymbal();
                    updatedNameCymbal.setName(newName);
                    System.out.println(updatedNameCymbal);


                    System.out.println(cymbalMenuOptions);

                    Integer l = Integer.valueOf(scanner.next());

                    switch (l){
                        case 1: cymbalUpdateMenu();
                            break;
                        case 2: updateProductMenu();
                            break;
                        case 3: mainMenu();
                            break;
                        case 4: exit();
                            break;
                        default: Console.println("Invalid input. Please try that again.");
                            System.out.println(cymbalMenuOptions);
                            break;
                    }

                    break;
                case 4:
                    System.out.println("Please enter the cymbal type:");
                    String newType = String.valueOf(scanner.next());

                    Cymbal updatedTypeCymbal = new Cymbal();
                    updatedTypeCymbal.setType(newType);
                    System.out.println(updatedTypeCymbal);

                    System.out.println(cymbalMenuOptions);

                    Integer m = Integer.valueOf(scanner.next());

                    switch (m){
                        case 1: cymbalUpdateMenu();
                            break;
                        case 2: updateProductMenu();
                            break;
                        case 3: mainMenu();
                            break;
                        case 4: exit();
                            break;
                        default: Console.println("Invalid input. Please try that again.");
                            System.out.println(cymbalMenuOptions);
                            break;
                    }

                    break;

                case 5:

                    System.out.println("Please enter the quantity:");
                    Integer newQty = Integer.valueOf(scanner.next());

                    Cymbal updatedQtyCymbal = new Cymbal();
                    updatedQtyCymbal.setQty(newQty);
                    System.out.println(updatedQtyCymbal);

                    System.out.println(cymbalMenuOptions);

                    Integer q = Integer.valueOf(scanner.next());

                    switch(q){

                        case 1: cymbalUpdateMenu();
                            break;
                        case 2: updateProductMenu();
                            break;
                        case 3: mainMenu();
                            break;
                        case 4: exit();
                            break;
                        default: Console.println("Invalid input. Please try that again.");
                            System.out.println(cymbalMenuOptions);
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Please enter the price:");
                    Integer newPrice = Integer.valueOf(scanner.next());

                    Cymbal updatedPriceCymbal = new Cymbal();
                    updatedPriceCymbal.setPrice(newPrice);
                    System.out.println(updatedPriceCymbal);

                    System.out.println(cymbalMenuOptions);

                    Integer n = Integer.valueOf(scanner.next());

                    switch(n){

                        case 1: cymbalUpdateMenu();
                            break;
                        case 2: updateProductMenu();
                            break;
                        case 3: mainMenu();
                            break;
                        case 4: exit();
                            break;
                        default: Console.println("Invalid input. Please try that again.");
                        System.out.println(cymbalMenuOptions);
                            break;
                    }
                    break;
                case 7:
                    updateProductMenu();
                    break;
                case 8:
                    returnToMain();
                    break;
                case 9:
                    exit();
                    break;
                default:
                    Console.println("Invalid input. Please try that again.");
                    System.out.println(cymbalMenuOptions);
                    break;
            }

            Cymbal newCymbal = new Cymbal();
            return newCymbal;


        }

        //get cymbal with ID
        public static Cymbal getCymbalIdInput() {


            Scanner scanner = new Scanner(System.in);
            CymbalService findCymbal = new CymbalService();

            String enterID = ("Please enter the ID number for the cymbal you'd like to update.");
            System.out.println(enterID);
            Integer i = Integer.valueOf(scanner.next());

            Cymbal newCymbal = new Cymbal();
            newCymbal = findCymbal.find(i);
            mainMenu();

            return newCymbal;

        }

        //asks if which product you want to delete and takes in id number
        public static void deleteProductMenu() {
        Scanner scanner = new Scanner(System.in);

        String deleteMenu = "What product type would you like to delete:\n Snare Drum: 1\n Cymbal: 2\n Main Menu:3\n Exit: 4\n";
        System.out.println(deleteMenu);

        Integer s = Integer.valueOf(scanner.next());

        switch(s){
            case 1:
                System.out.println("Please enter the ID for the snare drum you would like to delete:");
                Integer idSnare = Integer.valueOf(scanner.next());
                SnareDrumService deleteSnare = new SnareDrumService();
                deleteSnare.delete(idSnare);
                mainMenu();
            break;
            case 2:
                System.out.println("Please enter the ID for the cymbal you would like to delete:");
                Integer idCymbal = Integer.valueOf(scanner.next());

                CymbalService deleteCymbal = new CymbalService();
                deleteCymbal.delete(idCymbal);
                mainMenu();

            break;
            case 3:
                mainMenu();
            break;
            case 4:
                exit();
            break;
            default:
                Console.println("Invalid input. Please try that again.");
                System.out.println(deleteMenu);
            break;
        }

           // mainMenu();
        }

        //not sure what this does yet
        public static void getReportMenu() {
        }

        //returns to main menu
        public static void returnToMain() {
            mainMenu();
        }

        //exit program
        public static void exit() {
            System.exit(0);
        }


    }

