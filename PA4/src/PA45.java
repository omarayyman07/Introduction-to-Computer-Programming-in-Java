import java.util.Scanner;

public class PA45 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many number you wish to enter");
        int x = sc.nextInt();
        int sum =0;
        int i=0;
        while (i<x){
                System.out.println("Enter an integer");
            int y =sc.nextInt();
            sum+=y;
            i++;
        }
        System.out.println(sum);



    }
}
