/* Password Checker
- At least 4 characters
- At least one numeric digit
- At least one capital letter
- Must not have space or slash(/)
- Starting character must not be a number
Assumption: Input string will not be empty 
Return 1 if password is strong */

public class PasswordChecker {
    public static void main(String args[]) {
        System.out.println(CheckPassword ("aA1_67", 6));
    }
    
    // function definiton
    public static int CheckPassword(String str, int n){
        boolean isLen = false, isNum = false, isCap = false, isSpace = true, isFirst = true;
        if (str.length() > 4)
            isLen = true;
        if (Character.isDigit(str.charAt(0)))
            isFirst = false;
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if (Character.isDigit(ch[i]))
                isNum = true;
            if (ch[i]>=65 || ch[i] <=97)
                isCap = true;
            if (ch[i] == ' ' || ch[i] == '/')
                isSpace = false;
        }
        if(isLen && isNum && isCap && isSpace && isFirst)
            return 1;
        else
            return 0;
    }
}