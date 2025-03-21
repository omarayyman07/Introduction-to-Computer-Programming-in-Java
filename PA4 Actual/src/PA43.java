import java.util.*;
public class PA43{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int i=0;
        String y=""
        boolean z =false;
        String x =sc.next();
        while (i<x.length()){
            while (!z){
                switch(x.charAt(i)){
                    case 0: y+="0"
                    case 1: y+="1";break;
                    case 2 : y+="2";break;
                    case 3 : y+="3";break;
                    case 4: y+="4";break;
                    case 5: y+="5";break;
                    case 6: y+="6";break;
                    case 7: y+="7";break;
                    case 8: y+="8";break;
                    case 9: y+="9";break;
                }

            }
        }







}}