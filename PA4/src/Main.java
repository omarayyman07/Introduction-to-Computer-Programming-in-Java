import java.util.*;
public class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String x=sc.next();
String y=sc.next();
int i=0;
int count=0;
boolean z =false;
if (x.length()!=y.length()){
    System.out.println("Not same String");
}else{
    while (i<x.length()){
        if (x.charAt(i)==y.charAt(i)){
            count+=1;}
            else{break;}

i++;
        }
    if (count==x.length()){
    System.out.println("Same string");}
    else{System.out.println("Not same string");}

    }
}

        }

