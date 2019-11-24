package InterviewQuestions;

public class Animal {

		// TODO Auto-generated constructor stub
		public	Animal(String name,	String type)
		{
			this.name	=	name;
			this.type	=	type;
		}
		
		

		@Override
		public String toString() {
			return String.format("Animal [name=%s, type=%s]", name, type);
		}



		String	name;
		String	type;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal =	new	Animal("Tommy",	"Dog");
		System.out.println(animal);
		

	}

}
