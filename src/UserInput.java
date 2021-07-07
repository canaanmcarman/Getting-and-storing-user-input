import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your address: ");

        String firstInitial = keyboard.next();
        String lastName = keyboard.next();
        int houseNumber = keyboard.nextInt();
        String streetName = keyboard.next();
        String streetType = keyboard.next();
        String city = keyboard.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " " );
        System.out.println(streetName + " " + streetType + " " + city);



    }

}
