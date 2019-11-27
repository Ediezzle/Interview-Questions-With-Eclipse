package InterviewQuestions;

public class InitializerExamples {
	
	static int count;	
	int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitializerExamples	example	= new InitializerExamples();	
		InitializerExamples	example2 = new InitializerExamples();	
		InitializerExamples	example3 = new InitializerExamples();

	}
	
	static{					
		//This is a static initializer. Runs only ONCE when	Class is first loaded, 
		//regardless how many times objects are instantiated.					
		//Only static variables can be accessed 					
		System.out.println("Static Initializer");					
		//i	= 6;//COMPILER ERROR					
		System.out.println("Count when Static Initializer is run is	" + count);
		}
	
	{									
  //This is an instance initializers. Runs EVERY time an object is created.         
  //static and instance variables can be accessed         
  System.out.println("Instance Initializer");         
  i = 6;         
  count = count + 1;         
  System.out.println("Count when Instance Initializer is run is " + count);     
	}	
	
}

