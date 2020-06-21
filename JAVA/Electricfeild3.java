import java.util.*;
class Electricfeild3{

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double R=0;
double Q =0;
        double r =0;
        double lamda =0;
System.out.println("Hello! This is a calculator based on the ELECTRIC FEILD. \n");
System.out.println("This calculator can calculate :");
        System.out.println();
        System.out.println("1. Electric feild due to POINT CHARGE.");
        System.out.println("2. Electric feild due to CONDUCTING SPHERE.");
        System.out.println("3.  Electric feild due to CONDUCTING CYLINDER");
System.out.println("What value would you like to find out? ");
        System.out.println("Enter: \n 1. POINT CHARGE \n 2. CONDUCTING SPHERE \n 3. CONDUCTING CYLINDER \n (Please note that you don't need to enter units. The ans. is in whatever unit you enter the values)" );

        int userChoice = sc.nextInt();

        System.out.println("________________________________________________________________________________________________________________________________");

        switch (userChoice) {
case 3 :
            System.out.println("Please enter the value of charge lamda: ");
            lamda = sc.nextDouble();
            System.out.println("Please enter the distance of point from charge r: ");
            r = sc.nextDouble();
 System.out.println("Please enter the radius of cylinder R: ");
            R = sc.nextDouble();
double k=9*10*10*10*10*10*10*10*10*10;
double m=k*lamda*2;
            double n=r;
 double E=(m/n); 
    if(r<R)
        {
            System.out.println("value of E=0");}
        else 

             
          System.out.println("value of electric feild:" + E);
            break;
}
}
}

