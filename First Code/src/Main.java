//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
 public static void main(String[] args) {
     int t = 10;
     int m = t / 60;
     int h = t / 3600;
     int s = t%60;
     System.out.println(h + "hours" + m + "minutes" + s + "seconds");
 }

 }
 /*public static void main(String[] args) {
     final double pi=3.14;
     final double constant=2.0/1000;
     int radius = 800;
     int height = 300;
     double volume = pi*height*radius*radius;
     double time= volume*constant;
     System.out.print(time);


 }
}
/*public static void main(String[] args){
int k=99;
int ones=k%10;
int hundreds= (k-ones)/10;
int decimal= (hundreds*8)+(ones);
System.out.print(decimal);
}}*/