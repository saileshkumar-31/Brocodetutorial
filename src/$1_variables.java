public class $1_variables {
    public static void main (String[] agrs){
        //sout + tab creates System.out.println in intellij
        // sysout + ctrl + space creates System.out.println in eclipse

        // these are called commands which are ignored by the JVM n these are in single line
        /* to create multi line commands /* is used
        this creates
        multi
        line
         */


        // ; is called statement terminator
        // every statement should end with ;

        System.out.print("eg for print");
        System.out.println(",both lines are printed in a single line");
        //to avoid this we use println or we can use \n for new line

        System.out.print("new line\n");
        System.out.print("printed in next line");
        // \n prints text in next line.

        System.out.println("using \n in println creates a empty space between two lines\n");
        System.out.println("empty space is created");
        // using \n and println creates empty space as in the eg

        System.out.println("\t used to space in front of the text");
        //run the code to see the eg

        System.out.println("\" is used to give quotation to the text\"");
        // \"text \" displays as quotation in the console

        System.out.println("\\to give backslash use double backslash ");
        // here single backslash is considered as an escape character therefore double backslash is used

        /*
         variables = reusable conatiner for a value
                     a variable behaves af if it was the value it contains


         two types of variables
        1) primitive varaibles = simple value stored directly in memory (stack) = int, double, char, boolean
        2) Reference varaibles = memory address (stack) that points to the (heap) = string, array, object

         */

// Primitive datatypes
         /* to create a variable first we need to declare and assign a value to the variable
      eg. int x; - declaration , x = 34; - assigning values
      or this can be given all together which is called as initialization
      eg int x = 34;
       */

        int x; //declaration
        x = 345; // assignment

        int y = 245; // initialization

        // while printing the integer do not put 'x' or "x"
        System.out.println(x + y);
        // so the sum of x + y is displayed in the console

        //to display the text with the integer give the text in "text" and + then give the integer
        System.out.println("the value of x : " + x);

        // to display the larger number use long datatype
        // int n long cannot store the decimal value we should use float n double respectively

        long d = 2137643773674677467L;
        // the long should end with capital L
        System.out.println(d);

        // bytes ans shorts are rarely used as a beginner as it can hold small value

        float u = 4.234f;
        //for use floating the value should end with small f
        // float can hold up to 6-7
        System.out.println(u);

        double i = 3.0989876;
        // double can hold up to 15 digits
        // instead of float double can be used for smaller numbers also eg
        double o = 3.78;
        System.out.println(o);
        System.out.println(i);

        //variable need not be in single letter
        int sing = 455;
        System.out.println(sing);


        // boolean has only two values true or false, it takes no other values
        // used in if else statements

        boolean p = true;
        boolean a = false;
        boolean check = true;
        System.out.println(p);
        System.out.println(a);
        System.out.println(check);

        //char can store single character/letter/ASCII value
        char symbol = 's';
        char grade ='A'; // here if A+ is given it will not be printed, shows year
        System.out.println(symbol);


// Reference datatypes
        /* in primitive data the memory allocation in ram is done automatically while in reference datatype
        we need to allocate the memory by giving the keyword new
        NOTE: the keywords cannot be given as variable name.
         */
        /* in primitive datatypes the values are stored individually
        while in reference datatypes the values are stored commonly while the address is stored as reference
        to those values lets see the examples below
         */

        // reference datatypes always begins with capital letter
        // string is reference datatype so starts as String
        String deptk = "hello";
        System.out.println(deptk + " checking ");

        int e = 34;
        int f = e;
        /*here the value of f is = to e and only the values are stored in diff location in
        their respective name in ram, so if we change the value of the e,
         the value of the f will not change
         */


        e = 36;
        System.out.println("e = " +e);
        System.out.println( "f = "+f);
        // the value of e is changed in the output not the value of f ;

        // inorder to overcome this refernce datatypes is helpful;

// exercise:
        int age = 23;
        boolean isStudent = true;
        char grade1 = 'A';
        float mark = 93.2f;
        System.out.println("Your age is " + age + "you are grade " + grade1 +"your mark is "+ mark);
        /*
        in this there will be no space btwn the other variable or after the addition ,
        therefore to overcome this add " " (quotation with space)
         */
        System.out.println("Your age is " + age + " "+ "you are grade " + grade1 + " "+"your mark is "+ mark);


    }
}
