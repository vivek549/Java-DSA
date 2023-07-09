/*  Program to print all prime numbers in interval [a,b] (a & b inclusive)
    - input 1 should be less than input 2
    - range must always be greater than zero
    - if any of above conditions fails then dispaly "Provide valid input"
    - use a minimum of one for and one while loop
*/

import java.util.Scanner;
class PrintPrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a < 0 || b < 0 || b < a)
            System.out.println("Provide valid input");
        else{
            for (int i = a; i <= b; i++){
                if (isPrime(i))
                    System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
    
    public static boolean isPrime(int n){
        int m = n/2;
        
        if (n <=1)
            return false;
                
        for (int i = 2; i <= m; i++){
            if (n%i == 0)
                return false;
        }
        return true;
    }
}