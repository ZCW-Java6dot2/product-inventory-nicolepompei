package io;
import models.Cymbal;
import models.SnareDrum;
import services.CymbalService;
import services.SnareDrumService;

import java.util.Scanner;

public class Console {

    public static void print(String output, Object... args){
        System.out.printf(output, args);
    }

    public static void println(String output, Object...args){

    }


    public String getStringInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        println(String.valueOf(prompt));
        Integer userInput = Integer.valueOf(scanner.nextLine());
        return userInput;
    }

    public Float getFloatInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        println(String.valueOf(prompt));
        Float userInput = Float.valueOf(scanner.next());
        return userInput;
    }

    //welcome
    public static void printWelcome(){
        System.out.println("" +
                        "**************************************************" +
                        "***           Welcome and Bienvenue            ***" +
                        "***                    to                      ***" +
                        "***          ZipCo Inventory Manager           ***" +
                        "**************************************************");

    }
    //displays menu of products to create
    public void createProductMenu(){
        Scanner scanner = new Scanner;
        String ProductMenu = ("Choose product type to add:\n Snare Drum: 1\n Cymbal: 2");
        System.out.println(ProductMenu);

        Integer i = Integer.valueOf(scanner.next());

        switch(i){
        case 1:

    }
    //displays all products (needs to call 2 methods -- each find all in service classes)
    public void findAllProductMenu(){}
    //switch statement through models and then users sub switch statements to set the new values
    public void updateProductMenu(){}
    //asks if which product you want to delete and takes in id number
    public void deleteProductMenu(){}
    //returns to main menu
    public void returnToMain(){
        mainMenu();
    }
    public void exit(){
        System.exit(0);
    }
//not sure what this does yet
    public void getReportMenu(){}


    public void snareMenu(){}
    public void cymbalMenu(){}
    public Integer getDisplayMenuInput(){}
    public Integer getProductMenuInput(){}
    public Integer getSnareMenuInput(){}
    public Integer getCymbalMenuInput(){}

    public void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        String MainMenuDisplay = ("Main Menu: \n Create New Product: 1\n Read All Products: 2\n Update Product: 3\n Delete Product: 4\n Get Report: 5\n Exit: 6");
        Integer i = Integer.valueOf(scanner.next());

        System.out.println(MainMenuDisplay);
        switch(i){
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

    }
}
