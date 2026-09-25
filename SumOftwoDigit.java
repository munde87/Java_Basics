//given a four digit number find out the sum of first and last digit

import java.util.Scanner;

class SumOftwoDigit{

public static void  main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the any four integres: ");

int n = sc.nextInt();


int d1 = n%10;
n = n/10;

int d2 = n%10;
n = n/10;

int d3 = n%10;
n = n/10;

int d4 = n%10;
n = n/10;

 

int sum = d1 + d4 ;

System.out.print("Sum of five integers is: " +sum);
}
}