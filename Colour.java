public class Colour{
public static void main(String[] box)
{
System.out.println("JVM invoked main method");
String state="Kerala";
stateName("Karnataka");
stateName("Jharkhand");
stateName("Maharastra");
stateName("Gujarat");
stateName("Goa");
stateName("Madhya Pradesh");
stateName("Manipur");
stateName("Odissa"); 
stateName("Panjab");
stateName("TamilNadu");
stateName("Rajasthan");
stateName("Telangana");
stateName("Haryana");
stateName("Assam");
stateName(state);
System.out.println("exit main method");
}

public static void stateName(String name)
{
System.out.println("invoked stateName "+name);
}
}



