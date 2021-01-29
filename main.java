import java.util.Scanner;  // import scanner class

class Main {
  
  public static void main(String[] args) {

    Scanner myObject = new Scanner(System.in); //create a scanner object

    System.out.println("What is your name?");  
    String nameInput = myObject.nextLine();              //reads string   
    System.out.println("Hello "+ nameInput); 
  }
}