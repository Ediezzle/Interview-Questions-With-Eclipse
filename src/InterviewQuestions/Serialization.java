package InterviewQuestions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
	  FileOutputStream fileStream = new FileOutputStream("Serialization.ser"); 
	  ObjectOutputStream objectStream = new ObjectOutputStream(fileStream); 
	  objectStream.writeObject(new Serialization(5, 6)); 
	  objectStream.close();
	  
	   FileInputStream fileInputStream = new FileInputStream("Serialization.ser"); 
	   ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream); 
	   Serialization Serialization = (Serialization) objectInputStream.readObject(); 
	   objectInputStream.close(); 
	   System.out.println(Serialization.length);// 5 
	   System.out.println(Serialization.breadth);// 6 
	   System.out.println(Serialization.area);// o coz transient value is set to default upon deserialization

	}
	
	 public Serialization(int length, int breadth) 
	 {         
	  this.length = length;         
	  this.breadth = breadth;         
	  area = length * breadth;     
	 } 
	
	int	length;					
	int	breadth;					
	transient int	area;

}
