package Project_3;

import java.util.Scanner;
public class Part_1 {
    public static void main(String[] args) {
        //Part 1.
        // 1.1 Demonstrate use of control statements: if/else, switch.
        // 1.2 Demonstrate relational operators: ==, !=, >, <, <=, >= inside if condition statement.
        // 1.6 Demonstrate nested if/else conditionals:
        int integ = 5;
        if(integ == 5){
            System.out.println("it's 5.");
            if(5 >= 2){
                System.out.println("It's true.");
            }
            else{
                System.out.println("WHAT!");
            }
        }
        else if(integ!=5){
            System.out.println("It's something different");
        }
        else {
            System.out.println("It's not 5.");
        }
        switch (integ){
            case(5):
                System.out.println("IT'S REALLY 5!!");
                break;
            case(10):
                System.out.println("It's double the number needed!");
                break;
            case(15):
                System.out.println("It's triple the number needed!");
                break;
        }
        // 1.3 Compare strings using String.equals() inside if condition statement.
        String string1 = "ABBA";
        String string2 = "ABBA";
        if(string1.equals(string2)){
            System.out.println("they're the same.");
        }
        else{
            System.out.println("They are not the same.");
        }
        // 1.4 Demonstrate logical operators: &&, ||, ! inside if condition statement.
        int a = 1;
        int b = 2;
        int c = 1;
        if(a == c && a < b){
            System.out.println("Condition 1");
        }
        else if(a == b || a == c){
            System.out.println("Condition 2");
        }
        else{
            System.out.println("non");
        }
        // 1.5  Demonstrate using conditions with user input.
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your name");
        String name = scan.nextLine();
        if(name.contains("A") || name.contains("a")){
            System.out.println("You're cool!!!");
        }
        else{
            System.out.println("you're not COOL!");
        }
    }
}