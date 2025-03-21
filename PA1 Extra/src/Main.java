//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int z = sc.nextInt();
        int x = sc.nextInt();


        while(z!=0){
            int temp=z;
            z=x%z;
            x=temp;
        }
        System.out.println(x);











        }
    }
