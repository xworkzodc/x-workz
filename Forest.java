public class Forest
{
public static void main(String[] s)

{
System.out.println("invoked main method by JVM");
arrayOfGrade();
System.out.println("exiting main method by JVM");
}
public static void arrayOfGrade()
{
		 System.out.println("invoked arrayOfGrade");

		 char firstGrade='A';
		 char secondGrade='B';
		 char thirdGrade='C';
		 char fourthGrade='D';
		 char fifthGrade='E';
		 char sixthGrade='F';
		 char seventhGrade='G';
		 char eighthGrade='H';
		 char ninthGrade='S';
		 char tenthGrade='P';

	     char[] grade={firstGrade,secondGrade,thirdGrade,fourthGrade,fifthGrade,sixthGrade,seventhGrade,eighthGrade,ninthGrade,tenthGrade};
		 int sizeOfGrade=grade.length;
		 System.out.println("Total elements "+sizeOfGrade);


		 char elementAtIndex1=grade[1];

		 System.out.println("Element at index one "+elementAtIndex1);

		 char elementAtIndex2=grade[2];

		 System.out.println("Element at index two "+elementAtIndex2);

	}
} 