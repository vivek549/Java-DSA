/*  Calculate increment
    - based on their salary and their performance appraisal ration
    - if appraisal rating is between 1 and 3 , increment is 10% of salary
    - if appraisal rating is between 3.1 and 4 , increment is 25% of salary
    - if appraisal rating is between 4.1 and 5 , increment is 30% of salary
    - if either salary or appraisal is negative or not in range 1 to 5 print "Invalid input"
*/

import java.util.Scanner;
class CalculateAppraisal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salary = sc.nextFloat();
        float rating = sc.nextFloat();
        sc.close();
        
        if (salary <= 0 || rating < 1 || rating > 5)
            System.out.println("Invalid input");
        else if (rating >= 1 && rating <=3)
            System.out.println(salary+(salary*.10));
        else if (rating >= 3.1 && rating <=4)
            System.out.println(salary+(salary*.25));
        else if (rating >= 4.1 && rating <=5)
            System.out.println(salary+(salary*.30));
    }
}