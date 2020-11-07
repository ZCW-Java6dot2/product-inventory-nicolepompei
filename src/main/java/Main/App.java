package Main;

import io.Console;
import services.CymbalService;
import services.SnareDrumService;

public class App {
    private CymbalService cymbalService = new CymbalService();
    private SnareDrumService snareDrumService = new SnareDrumService();

    public static void main(String... args){
        App application = new App();
        application.init();

    }

    public void init(){

        //app logic here
        //call methods to take user input and interface with services

        Console.printWelcome();
        Console.mainMenu();
    }
}
