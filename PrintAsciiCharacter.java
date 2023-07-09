/*  - input four numbers and print their corresponding ASCII character 
    - assume inputs are always four
*/

import java.util.Scanner;
class PrintAsciiCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i= 0; i < 4; i++){
            System.out.print((char)sc.nextInt() + " ");
        }
        sc.close();
        System.out.println("");
    }
}