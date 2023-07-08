/* Replace character*/

import java.util.*;
public class ReplaceCharacter {
    
    // main function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        sc.close();
        
        replaceChar(str, ch1, ch2);     //replaceChar(apple, a, p)
    }
    //output: paaple
    
    //function definition
    public static void replaceChar(String str, char ch1, char ch2){
        String res = "";
        
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ch1)
                res = res + ch2;
            else if (str.charAt(i) == ch2)
                res = res + ch1;
            else
                res = res + str.charAt(i);
        }
        System.out.println(res);
    }
}