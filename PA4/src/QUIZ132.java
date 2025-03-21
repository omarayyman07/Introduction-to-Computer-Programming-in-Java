import java.util.*;
public class QUIZ132 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        String nstring="";
        int i=0;
        while (i<x.length()){
            if (x.charAt(i)!='*'){
                nstring+=x.charAt(i);
                i+=1;
            } else{
                while (x.charAt(i)=='*')
                    i+=1;


            }
        }
        System.out.println(nstring);
    }
}
