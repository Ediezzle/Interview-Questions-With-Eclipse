package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cricketer implements Comparable<Cricketer>{
	int runs;
	String name;
	
	public Cricketer(String name, int runs)
	{
		super();
		this.name=name;
		this.runs=runs;
	}
	
	@Override
	public String toString() {
		return name + " " + runs;
	}
	
	//compareTo takes an argument of the same type of the class
	//compareTo returns -1 if this<that
	//1 if this > that
	//0 if this=that
	@Override
	public int compareTo(Cricketer that) {
		if (this.runs > that.runs)
			return 1;
		
		else if(this.runs < that.runs)
			return -1;
		
		else
			return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Cricketer> cricketers = new ArrayList<>();
		cricketers.add(new Cricketer("Bradman", 9996));
		cricketers.add(new Cricketer("Sachin", 14000));
		cricketers.add(new Cricketer("Dravid", 12000));
		cricketers.add(new Cricketer("Ponting", 11000));
		System.out.println(cricketers);
		Collections.sort(cricketers);
		System.out.println(cricketers);
		Collections.reverse(cricketers);
		System.out.println(cricketers);

	}

}
