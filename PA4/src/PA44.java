import java.util.*;
public class PA44 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x=sc.next();
        String newx="";
        int i=x.length();
        while (i>0){
            newx+=x.charAt(i-1);
            i--;

        }
        if (newx.equals(x)) {
            System.out.println("Palindrome");
        }else{System.out.println("Not palindrome");}
        }
    }

