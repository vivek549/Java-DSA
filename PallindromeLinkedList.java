import java.util.*;

public class PallindromeLinkedList {
    public static void main(String args[]) {
        List <Integer> linkedList = new LinkedList <Integer> ();
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(3);
      
        System.out.println (linkedList);
        
        int size = linkedList.size();
        int i = 0;
        int j = size - 1;
        int mid = 0;
        boolean res = false;
        if (size % 2 == 0)
            mid = j / 2;
        else
            mid = (size + 1) / 2;
        while (i <= mid){
            if (linkedList.get(i) == linkedList.get(j))
                res = true;
            else
                res = false;
            i++;
            j--;
        }
        if (res == true)
            System.out.println("Palindrome");
        else
            System.out.println("not palindrome");
    }
}