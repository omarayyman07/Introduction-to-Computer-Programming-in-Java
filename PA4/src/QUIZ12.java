import java.util.*;
public class QUIZ12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x=sc.next();
        String y=sc.next();
        String n="";
        int i=0;
        if (x.length()==y.length()){
        while (i<x.length()){
            n+=x.charAt(i);
            n+=y.charAt(i);
            i++;
        }}
        i=0;
        if (x.length()>y.length()){
            while (i<y.length()){
                n+=x.charAt(i);
                n+=y.charAt(i);
                i++;
            }

            while (i<x.length()){
                n+=x.charAt(i);
            i++;}
            }
        i=0;
        if (y.length()>x.length()){
            while (i<x.length()){
                n+=x.charAt(i);
                n+=y.charAt(i);
                i++;
            }

            while (i<y.length()){
                n+=y.charAt(i);
                i++;}
        }
        System.out.print(n);
        }



}
