public class IfelseExOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   int valueOne = 10;
	   int valueTwo = 20;
	      //10 < 20,
	      //if(true)
	   if(valueOne < valueTwo)
	   {
	   	System.out.println("Start of outer if block");
	   	//if(true)
	   	if(34>3)
	   	{
	   		System.out.println("Start of Inner if block");
	   		System.out.println("End of Inner if block");
	   	}//close of inner if block
	   	else 
	   	{
	   		System.out.println("Start of Inner else block");
	   		System.out.println("End of Inner else block");

	   	}//close of inner else block
	   }//close of outer if block
	   else
	   {
	   	System.out.println("Start of outer else block");
	   	System.out.println("End of outer else block");
	   }//close outer else block
	   System.out.println("End of Main Method");
	}//end of main method
}//end of class

/*output
======
Start of Main Method
Start of outer if block
Start of Inner if block
End of Inner if block
End of Main Method
*/ 

