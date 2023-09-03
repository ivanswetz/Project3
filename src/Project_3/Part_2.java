package Project_3;
import java.util.Scanner;
public class Part_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String baby = "Home, walk and kindergarten";
        String child = "School";
        String student = "University";
        String adult = "Work";
        String old = "Retired";
        System.out.println("Hello, please, enter your age!");
        int age = scan.nextInt();
        while(age < 0 || age > 120){
            System.out.println("Wrong age, please repeat!");
            age = scan.nextInt();
        }
        if(age >= 0 && age <= 6){
            System.out.println(baby);
        } else if (age >= 7 && age <= 17 ) {
            System.out.println(child);
        } else if (age >= 18 && age <= 22) {
            System.out.println(student);
        } else if (age >= 23 && age < 60) {
            System.out.println(adult);
        }
        else{
            System.out.println(old);
        }
    }

}
