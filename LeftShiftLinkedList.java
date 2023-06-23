import java.util.*;

public class LeftShiftLinkedList {
    public static void main(String args[]) {
        List <Integer> ll = new ArrayList <Integer> ();
        List <Integer> l2 = new ArrayList <Integer> ();
        ll.add (2);
        ll.add (4);
        ll.add (7);
        ll.add (8);
        ll.add (9);
        System.out.println(ll);
        
        int size = ll.size();
        int k = 3;
        int i = 0;
        int temp = 0;
        
        while (i < k){
            temp = ll.remove(0);
            l2.add(temp);
            i+=1;
        }
        
        i = 0; 
        int size2 = l2.size();
        while (i < size2){
            ll.add(l2.get(i));
            i++;
        }
        
        System.out.println(l2);
        System.out.println(ll);
    }
}