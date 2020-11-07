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

    public void mainMenu() {
        Scanner scannerMain = new Scanner(System.in);
        String MainMenuDisplay = ("Main Menu: \n Create New Product: 1\n Read All Products: 2\n Update Product: 3\n Delete Product: 4\n Get Report: 5\n Exit: 6");
        Integer i = Integer.valueOf(scannerMain.next());

        System.out.println(MainMenuDisplay);
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
                break;
        }

    }

    //displays menu of products to create
    public void createProductMenu() {
        Scanner scanner = new Scanner(System.in);
        String ProductMenu = ("Choose product type to add:\n Snare Drum: 1\n Cymbal: 2");
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
    public void createSnareMenu() {
        SnareDrumService newSnareDrum = new SnareDrumService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter snare drum depth:");
        int depth = Integer.valueOf(scanner.next());
        System.out.println("Enter snare drum brand:");
        String brand = String.valueOf(scanner.next());
        System.out.println("Enter snare drum name:");
        String name = String.valueOf(scanner.next());
        System.out.println("Enter snare drum shell type:");
        String shellType = String.valueOf(scanner.next());
        System.out.println("Enter snare drum quantity:");
        int qty = Integer.valueOf(scanner.next());
        System.out.println("Enter snare drum price:");
        float price = Integer.valueOf(scanner.next());

        newSnareDrum.create(depth, brand, name, shellType, qty, price);

    }

    //creates and adds cymbal obj to inventory
    public void createCymbalMenu() {
        CymbalService newCymbal = new CymbalService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cymbal size:");
        int size = Integer.valueOf(scanner.next());
        System.out.println("Enter cymbal brand:");
        String brand = String.valueOf(scanner.next());
        System.out.println("Enter cymbal name:");
        String name = String.valueOf(scanner.next());
        System.out.println("Enter cymbal type:");
        String type = String.valueOf(scanner.next());
        System.out.println("Enter cymbal quantity:");
        int qty = Integer.valueOf(scanner.next());
        System.out.println("Enter cymbal price:");
        float price = Integer.valueOf(scanner.next());

        newCymbal.create(size, brand, name, type, price, qty);
    }

    //displays all products (needs to call 2 methods -- each find all in service classes)
    public void findAllProductMenu() {

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
    public void updateProductMenu() {
        Scanner scanner = new Scanner(System.in);
        String enterID = ("Choose the product you'd like to update:\n Snare Drum: 1\n Cymbal: 2\n Return to Main Menu: 3\n Exit: 4\n");
        System.out.println(enterID);
        Integer i = Integer.valueOf(scanner.next());

        switch (i) {
            case 1:
                getSnareIdInput();
                break;
            case 2:
                getCymbalIdInput();
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

    public Integer getSnareIdInput() {
        Scanner scanner = new Scanner(System.in);
        SnareDrumService findSnare = new SnareDrumService();

        String enterID = ("Please enter the ID number for the snare drum you'd like to update.");
        System.out.println(enterID);
        Integer i = Integer.valueOf(scanner.next());
        findSnare.find(i);

        System.out.println(snareUpdateMenu());

    }

    public Integer snareUpdateMenu() {
        Scanner scanner = new Scanner(System.in);

        String fieldToUpdate = ("Choose the field you'd like to update:\n Depth: 1\n Brand: 2\n Name: 3\n Shell Type: 4\n Quantity: 5\n Price: 6\n Return to Product Menu: 7\n Return to Main Menu: 8\n Exit: 9");
        System.out.println(fieldToUpdate);
        Integer i = Integer.valueOf(scanner.next());

        switch (i) {
            case 1:

                System.out.println("Please enter the depth:");
                Integer newDepth = Integer.valueOf(scanner.next());

                SnareDrum updatedSnareDrum = new SnareDrum();
                updatedSnareDrum.setDepth(newDepth);
                System.out.println(updatedSnareDrum);

                String snareMenuOptions = ("What would you like to do next:\n Add another snare update: 1\n Return to menu to update more products: 2\n Return to Main Menu: 3\n Exit: 4");
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
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
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
    }

        public Integer cymbalUpdateMenu () {
        }

        public Integer getCymbalIdInput () {
        }

        //asks if which product you want to delete and takes in id number
        public void deleteProductMenu () {
        }

        //not sure what this does yet
        public void getReportMenu () {
        }

        //returns to main menu
        public void returnToMain () {
            mainMenu();
        }

        //exit program
        public void exit () {
            System.exit(0);
        }


    }

