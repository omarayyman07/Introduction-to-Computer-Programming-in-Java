import java.util.*;
public class PA47 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message");
        String message=sc.next();
        System.out.println("Enter your key");
        int key=sc.nextInt();
        String nstring="";
        int i=0;
        while (i<message.length()){
            char shiftedchar=(char) (message.charAt(i)+key);
            nstring+=shiftedchar;
            i++;

        }
System.out.println(nstring);

    }
}
