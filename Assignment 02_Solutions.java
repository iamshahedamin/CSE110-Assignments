//Task 1

public class Task1
{
    public static void main(String [] args)
    {
        
        int hungry;    // a. this is accepted as a legal identifier or variable name in Java
        
        int 2AB;       // b. this is not accepted as a legal identifier or variable name in Java
        // this is an invailed variable name, because a number (0, 1, 2, ...) can not be the first charachter in a variable name 
        
        int 312.2;     // c. this is not accepted as a legal identifier or variable name in Java
        /* this is an invailed variable name, because a number (0, 1, 2, ...) can not be the first charachter in a variable name
         and there can not be any decimal points (.) or full stops (.) in a variable name 
         */
        
        int MOBILE;     // d. this is accepted as a legal identifier or variable name in Java
        
        int "Ans";      // e. this is not accepted as a legal identifier or variable name in Java
        /* this is an invalid variable name, because identifiers or variable names can not have double quotes (")
         */
        
        int $30;        // f. this is accepted as a legal identifier or variable name in Java
        /* this is a valid variable name, because dollar sign ($) is allowed to be used in variable names
         */
        
        int Yes/No;     // g. this is not accepted as a legal identifier or variable name in Java
        /* this is an invalid variable name, because identifiers can not have special characters like slashes (/)
         */
        
        int student-id; // h. this is not accepted as a legal identifier or variable name in Java
        /* this is an invalid variable name, because identifiers or variable names can not have hyphens (-)
         */
        
        int A+3;        // i. this is not accepted as a legal identifier or variable name in Java
        /* this is an invalid variable, name because identifiers or variable names can not have plus (+) symbol
         */
        
        int 'X';        // j. this is not accepted as a legal identifier or variable name in Java
        /* this is an invalid variable name, because identifiers can not have single quotes (')
         */
        
        int return;     // k. this is not accepted as a legal identifier or variable name in Java
        /* this is an invalid variable name, because "return" is a reserved keyword in Java
         */
        
    }
}

//Task 2

public class Task2
{
    public static void main(String [] args)
    {
        //part 2.1:
        
        int n1 = 99 ;
        System.out.println("value of n1: " + n1);        
        
        //part 2.2:
        
        int n2 = 1 ;
        System.out.println("value of n2: " + n2);                
                
        int sum = n1 + n2;
        System.out.println("sum of n1 & n2: " +sum);
        
        //part 2.3:
                
        int product = n1 * n2;
        System.out.println("product of n1 & n2: " + product);
               
        double division = (double) n1 / n2;
        System.out.println("division of n1 & n2: " + division);
        
        //part 2.4:
        
        double d1 = 99.99;
        System.out.println("value of d1: " + d1);
        
        double d2 = 0.01;
        System.out.println("value of d2: " + d2);
        
        double sumDouble = d1 + d2;
        System.out.println("sum of d1 & d2: " + sumDouble);
        
        double productDouble = d1 * d2;
        System.out.println("product of d1 & d2: " + productDouble);
        
        double divisionDouble = d1 / d2;
        System.out.println("division of d1 & d2: " + divisionDouble);
                
        //part 2.5
        
        double d3 = 7.77;
        System.out.println("value of n2: " + d3);
        
        int n3 = 7;
        System.out.println("value of n3: " + n3);
                
        double sumDoubleInt = d3 + n3;
        System.out.println("sum of d3 & n3: " + sumDoubleInt);
        
        double productDoubleInt = d3 * n3;
        System.out.println("product of d3 & n3: " + productDoubleInt);
        
        double divisionDoubleInt = d3 / n3;
        System.out.println("division of d3 & n3: " + divisionDoubleInt);
        
        //part 2.6:
        
        String s1 = "Shahed";
        System.out.println("value of s1: " + s1);
        
        String s2 = "Amin";
        System.out.println("value of s2: " + s2);
        
        String s1s2concatenation = s1 + s2;
        /*this is known as concatenation.
         We use the addition operator to concatenate the two String variables and print the result.
         */
        
        System.out.println("concatenation of s1 & s2: " + s1s2concatenation );
        
        //if the first variable is an integer and the second is a String: (We can still concatenate them)         
                
        int n4 = 99;
        String s3 = "Nienty-nine";
        
        String n4s3concatenation = n4 + s3;
        
        System.out.println("concatenation of n4 & s3: " + n4s3concatenation);
        
        //if the first variable is a String and the second is an integer: (We can still concatenate them)
     
        String s3n4concatenation = s3 + n4;
        
        System.out.println("concatenation of s3 & n4: " + s3n4concatenation);
    }
}

//Task 3

public class Task3
{ 
    public static void main(String [] args)
    {
  
        int r = 4;
    
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * r * r;
  
        System.out.println("circumference of the circle is: " + circumference);
        System.out.println("area of the circle is: " + area);
  
    }
}

//Task 4

public class Task4
{
    public static void main(String [] args)
    {       
        int n1 = 24301525;
        int last2digits = n1 % 100;
        System.out.println("last two digits of n1 are:" + last2digits);
    }
}

//Task 5

public class Task5
{
    public static void main(String [] args)
    {
        double inches = 1000;
        
        double meters = inches * 0.0254 ;
        System.out.println(inches + " inch is " + meters + " meters");
        
    }
}

//Task 6

public class Task6
{
    public static void main(String [] args)
    {
        //using a third variable 
        int a = 77;
        int b = 99;
        int thirdvariable;
        
        thirdvariable = a;
        a = b;
        b = thirdvariable;
        
        System.out.println("value of a: " + a);
        System.out.println("value of b: " + b);
        
//without using third variable
        
        int c = 77;
        int d = 99;
        
        c = c + d;
        d = c - d;
        c = c - d;
        
        System.out.println("value of c: " + c);
        System.out.println("value of d: " + d);
        
    }
}

//Task 7

public class Task7
{
    public static void main(String [] args)
    {       
        int minutes = 3456789;
        
        int years = minutes / (60 * 24 * 365);
        int days = (minutes % (60 * 24 * 365)) / (60 * 24);
        
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
        
    }
}

//Task 8

public class Task8
{
    public static void main(String [] args)
    {       
        int a = 2;
        int b = 5;
        int c = 8;
        
        int d = ((2 * b) * ((c - a) / 3) + 7);
        
        System.out.println("Value of d: " + d); 
        
        
    }
}

//Task 9

public class Task9
{
    public static void main(String [] args)
    {       
        int n = 5;              
        int t1 = n * 1;
        int t2 = n* 2;
        int t3 = n * 3;
        int t4 = n * 4;
        int t5 = n * 5;
        int t6 = n * 6;
        int t7 = n * 7;
        int t8 = n * 8;
        int t9 = n * 9;
        int t10 = n * 10;
        
        System.out.println( n + " x 1 = " + t1 );
        System.out.println( n +  " x 2 = " + t2 );                 
        System.out.println( n +  " x 3 = " + t3 );                 
        System.out.println( n +  " x 4 = " + t4 );                 
        System.out.println( n +  " x 5 = " + t5 );                 
        System.out.println( n +  " x 6 = " + t6 );                 
        System.out.println( n +  " x 7 = " + t7 );                 
        System.out.println( n +  " x 8 = " + t8 );                 
        System.out.println( n +  " x 9 = " + t9 );                 
        System.out.println( n +  " x 10 = " + t10 );                 
        
    }
}

//Task 10

public class Task10
{
    public static void main(String [] args)
    {  
        
        int n= 100;
        int a= 1;
        int L=100;
        
        int sum = n / 2 * (a + L);
        System.out.println("the sum of the first 100 positive numbers is: " + sum);
        
    }
}

//Task 11

public class Task11
{
    public static void main(String [] args)
    {  
        
        double a = 4.5;
        double b = 9.5;
        
        double c = Math.sqrt(a * a + b * b);
        
        double sinA = a / c;
        double cosA = b / c;
        double sinB = b / c;
        double cosB = a / c;
        
        System.out.println("value of SinA is: " + sinA);
        System.out.println("value of CosA is: " + cosA);
        System.out.println("value of SinB is: " + sinB);
        System.out.println("value of CosB is: " + cosB);
        
    }
}

//Task 12

public class Task12
{
    public static void main(String [] args)
    {  
        
        int studentId = 24301525;
        
        int rightMost2digits = studentId % 100;
        
        int reversedrightMost2digits = (rightMost2digits % 10) * 10 + (rightMost2digits / 10);
        
        //I will use some comments to explain the logics
        //(25 % 10) * 10 = 50
        //(25 / 10) = 2 (int data type is specified)
        //(50 + 2) = 52 (so 25 is reversed)
        
        System.out.println(reversedrightMost2digits / 10); 
        //(52 / 10) = 5 (int data type is specified)
        
        System.out.println(reversedrightMost2digits % 10);
        //(52 % 10) = 2
        
    }
}

//Task 13

public class Task13
{
    public static void main(String [] args)
    {  
        
        
        double distanceInMeters = 2500;  // Assuming the last 4 digits are 2500
        
        double hours = 5;
        double minutes = 56;
        double seconds = 23;
        
        double totalTimeInSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double velocityInKmh = (distanceInMeters / 1000) / (totalTimeInSeconds / 3600);
        double velocityInMph = (distanceInMeters / 1609) / (totalTimeInSeconds / 3600);
        
        System.out.println("Your velocity in km/h is " + velocityInKmh);
        System.out.println("Your velocity in miles/h is " + velocityInMph);
        
        
    }
}

//Task 14

public class Task14
{
    public static void main(String [] args)
    { 
        
        double a = 8 / 2;
        double b = 3;
        
        //I will use some comments to explain the logics
        
        //assuming the side of the hexagon is the hypotenuse of a right triangle        
        double side = Math.sqrt(a * a + b * b);
        
        //using the known formula: area of hexagon = (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2
        //circumference of a hexagon = 6 * side
        
        double area = (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
        double circumference = 6 * side;
        
        System.out.println("area of the hexagon is: " + area);
        System.out.println("circumference of the hexagon is: " + circumference);
                                
    }
}



