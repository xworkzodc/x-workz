public class Clock1{

public static void main(String[] sn)
{
System.out.println("invoked main method by JVM");
arrayOfBoolean();
System.out.println("exiting main method by JVM");
}
public static void arrayOfBoolean()
{
System.out.println("invoke exampleForBoolean");
boolean earthIsFlat=false;
boolean twoIsAPrimeNumber=true;
boolean colourOfMangoIsBlue=false;
 
 boolean[] trueOrFalse={earthIsFlat,twoIsAPrimeNumber,colourOfMangoIsBlue};
 int sizeOfArray=trueOrFalse.length;
 
 boolean elementAtIndex1=trueOrFalse[1];
 System.out.println("size of array :"+elementAtIndex1);
 }
 }
 