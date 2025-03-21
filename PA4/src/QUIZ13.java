import java.util.*;
public class QUIZ13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String x=sc.next();
        System.out.println("Enter the separator");
        String s=sc.next();
        System.out.println("Enter the number of times to be repeated");
        int n=sc.nextInt();
        String nstring="";
        int i=0;
        while (i<n){
            nstring+=x;

            if (i<(n-1))
                nstring+=s;


            i+=1;
        }
        System.out.println(nstring);
    }
}
