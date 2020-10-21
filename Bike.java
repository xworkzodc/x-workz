public class Bike{
public static void main(String[] ssn)

{
System.out.println("invoked main method by JVM");
arrayOfPercentage();
System.out.println("exiting main method by JVM");
}
public static void arrayOfPercentage()
{
		 System.out.println("invoked arrayOfPercentage");

		 float tenthPercentage=78.72f;
		 float pucPercentage=60.33f;
		 float degreePercentage=54.31f;

	     float[] percentage={tenthPercentage,pucPercentage,degreePercentage};
		 float sizeOfPercentage=percentage.length;
		 System.out.println("Total elements "+sizeOfPercentage);


		 float elementAtIndex1=percentage[1];

		 System.out.println("Element at index one "+elementAtIndex1);

		 float elementAtIndex2=percentage[2];

		 System.out.println("Element at index two "+elementAtIndex2);

	}
}
