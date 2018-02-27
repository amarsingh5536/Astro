import java.util.*;
import java.lang.*;
class Abc
{

public void example()
{
Scanner S1=new Scanner(System.in);
System.out.println("Enter Date");
int a =S1.nextInt();
System.out.println("Enter Month");
int f =S1.nextInt();
System.out.println("Enter year");
int k =S1.nextInt();
System.out.println("=================================================================");
if(a>=1&&a<=31)
{
if(k>=1900&&k<=2100)
{
int b=k-1900;
int d=b/4;
if(f==1)
{
int c=(a+b+d);
float s=c%7 ;
if(s==1.0)
{
System.out.println("MOnday");
}
if(s==2.0)
{
System.out.println("Thusday");
}
if(s==3.0)
{
System.out.println("Wednesday");
}
if(s==4.0)
{
System.out.println("Thrusday");
}
if(s==5.0)
{
System.out.println("Friday");
}
if(s==6.0)
{
System.out.println("Satarday");
}
if(s==7.0)
{
System.out.println("Sunday");
}
}
else if(f==2)
{
int c=(a+b+d+3);
float s=c%7 ;
if(s==1.0)
{
System.out.println("MOnday");
}
if(s==2.0)
{
System.out.println("Thusday");
}
if(s==3.0)
{
System.out.println("Wednesday");
}
if(s==4.0)
{
System.out.println("Thrusday");
}
if(s==5.0)
{
System.out.println("Friday");
}
if(s==6.0)
{
System.out.println("Satarday");
}
if(s==7.0)
{
System.out.println("Sunday");
}
}
else if(f==3)
{
int c=(a+b+d+3);
float s=c%7 ;
if(s==1.0)
{
System.out.println("MOnday");
}
if(s==2.0)
{
System.out.println("Thusday");
}
if(s==3.0)
{
System.out.println("Wednesday");
}
if(s==4.0)
{
System.out.println("Thrusday");
}
if(s==5.0)
{
System.out.println("Friday");
}
if(s==6.0)
{
System.out.println("Satarday");
}
if(s==7.0)
{
System.out.println("Sunday");
}
}
else if(f==4)
{
int c=(a+b+d+6);
float s=c%7 ;
if(s==1.0)
{
System.out.println("MOnday");
}
if(s==2.0)
{
System.out.println("Thusday");
}
if(s==3.0)
{
System.out.println("Wednesday");
}
if(s==4.0)
{
System.out.println("Thrusday");
}
if(s==5.0)
{
System.out.println("Friday");
}
if(s==6.0)
{
System.out.println("Satarday");
}
if(s==7.0)
{
System.out.println("Sunday");
}
}
else if(f==5)
{
int c=(a+b+d+1);
float s=c%7 ;
if(s==1.0)
{
System.out.println("MOnday");
}
if(s==2.0)
{
System.out.println("Thusday");
}
if(s==3.0)
{
System.out.println("Wednesday");
}
if(s==4.0)
{
System.out.println("Thrusday");
}
if(s==5.0)
{
System.out.println("Friday");
}
if(s==6.0)
{
System.out.println("Satarday");
}
if(s==7.0)
{
System.out.println("Sunday");
}
}
else if(f==6)
{
int c=(a+b+d+4);
float s=c%7 ;
if(s==1.0)
{
System.out.println("MOnday");
}
if(s==2.0)
{
System.out.println("Thusday");
}
if(s==3.0)
{
System.out.println("Wednesday");
}
if(s==4.0)
{
System.out.println("Thrusday");
}
if(s==5.0)
{
System.out.println("Friday");
}
if(s==6.0)
{
System.out.println("Satarday");
}
if(s==7.0)
{
System.out.println("Sunday");
}
}
else if(f==7)
{
int c=(a+b+d+6);
float s=c%7 ;
if(s==1.0)
{
System.out.println("MOnday");
}
if(s==2.0)
{
System.out.println("Thusday");
}
if(s==3.0)
{
System.out.println("Wednesday");
}
if(s==4.0)
{
System.out.println("Thrusday");
}
if(s==5.0)
{
System.out.println("Friday");
}
if(s==6.0)
{
System.out.println("Satarday");
}
if(s==7.0)
{
System.out.println("Sunday");
}
}
else if(f==8)
{
int c=(a+b+d+2);
float s=c%7 ;
if(s==1.0)
{
System.out.println("MOnday");
}
if(s==2.0)
{
System.out.println("Thusday");
}
if(s==3.0)
{
System.out.println("Wednesday");
}
if(s==4.0)
{
System.out.println("Thrusday");
}
if(s==5.0)
{
System.out.println("Friday");
}
if(s==6.0)
{
System.out.println("Satarday");
}
if(s==7.0)
{
System.out.println("Sunday");
}
}
else if(f==9)
{
int c=(a+b+d+5);
float s=c%7;
if(s==1.0)
{
System.out.println("MOnday");
}
if(s==2.0)
{
System.out.println("Thusday");
}
if(s==3.0)
{
System.out.println("Wednesday");
}
if(s==4.0)
{
System.out.println("Thrusday");
}
if(s==5.0)
{
System.out.println("Friday");
}
if(s==6.0)
{
System.out.println("Satarday");
}
if(s==7.0)
{
System.out.println("Sunday");
}
}
else if(f==10)
{
int c=(a+b+d);
float s=c%7 ;
if(s==1.0)
{
System.out.println("MOnday");
}
if(s==2.0)
{
System.out.println("Thusday");
}
if(s==3.0)
{
System.out.println("Wednesday");
}
if(s==4.0)
{
System.out.println("Thrusday");
}
if(s==5.0)
{
System.out.println("Friday");
}
if(s==6.0)
{
System.out.println("Satarday");
}
if(s==7.0)
{
System.out.println("Sunday");
}
}
else if(f==11)
{
int c=(a+b+d+3);
float s=c%7 ;
if(s==1.0)
{
System.out.println("MOnday");
}
if(s==2.0)
{
System.out.println("Thusday");
}
if(s==3.0)
{
System.out.println("Wednesday");
}
if(s==4.0)
{
System.out.println("Thrusday");
}
if(s==5.0)
{
System.out.println("Friday");
}
if(s==6.0)
{
System.out.println("Satarday");
}
if(s==7.0)
{
System.out.println("Sunday");
}
}
else if(f==12)
{
int c=(a+b+d+5);
float s=c%7;
if(s==1.0)
{
System.out.println("MOnday");
}
if(s==2.0)
{
System.out.println("Thusday");
}
if(s==3.0)
{
System.out.println("Wednesday");
}
if(s==4.0)
{
System.out.println("Thrusday");
}
if(s==5.0)
{
System.out.println("Friday");
}
if(s==6.0)
{
System.out.println("Satarday");
}
if(s==7.0)
{
System.out.println("Sunday");
}}
else{
System.out.println("Enter Date between 1-12");
}
}
else{
System.out.println("Enter year between 1901-2100");
}
}
else{
System.out.println("Enter Date between 1-31");
}
System.out.println("________________________________________________________________________________");
}
}

public class Astro
{
public static void main(String args[])
{

System.out.println("A Calender in which you can see Day of the Date Between 1901-2100");

System.out.println("=================================================================");
Abc ab=new Abc();
ab.example();
System.out.println("Thank you");
}
}