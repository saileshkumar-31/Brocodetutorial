import java.util.Scanner;
public class $2_Userinput {
    public static void main (String[] args){

        /*
        for user input first we need to import the scanner from the packages (util package)
        then define the Scanner, Scanner = new anyname(System.in) this system.in indicates that the input is required
        in this example Scanner is named as sc
        for String , String name = sc.next(); = this next(); does not read after the space,
        therefore we need to use nextLine(); to read spaces.
        for int ,int age = sc.Int();
        for double, double gpa = sc.Double();
        for boolean, boolean isStudent = sc.Boolean(); if

        do not forget to close the scanner , in this exmaple sc.close();
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: " );
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();

        System.out.print("Are you a student? (true/false) : ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("your GPA is " + gpa);
        if(isStudent) {
            System.out.println("You are a student");
        }else{
                System.out.println("You are not a student");
            }

        /* there will be error if the int , double is printed before the string
        coz after giving the input for the int / double , nextLine considers the input value for int/double
        as its own input
        to solve this add a empty sc.nextLine();
        example is in the file $3_userinputeg
        */



        sc.close();
    }
}
