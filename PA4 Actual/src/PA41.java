/*import java.util.*;
public class PA41 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter integers");
        int count=1;
        int max=0;
        double avg=0;
        int x= sc.nextInt();
        double tot=x;
        int min=x;
        boolean z =false;
        while (z==false){
            x= sc.nextInt();
            if (x<0){
                z=true;}
            else{
            if (min>x)
                min=x;
            if (max<x)
                max=x;
            tot+=x;
            count++;}
        }
        avg=(tot/count);
        System.out.println("Average is " + avg + "Max is " + max + "Min is " + min);
                Scanner sc= new Scanner(System.in);
        System.out.println("Please enter integers");
        int count=1;
        double avg=0;
        int x= sc.nextInt();
        int max=x;
        double tot=x;
        int min=x;
        boolean z =false;
        do {
             x= sc.nextInt();
            if (x < 0) {
                z = true;
            } else {
                if (max < x)
                    max = x;
                if (min > x)
                    min = x;
                tot += x;
                count++;
            }
        }while (!z);
            avg=tot/count;
                System.out.println("Average is " + avg + "Max is " + max + "Min is " + min);}
}*/
