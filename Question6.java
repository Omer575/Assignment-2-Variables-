package day_3;

public class Question6 {

	public static void main(String[] args) {
		
		String name1,name2,name3,name4,name5;
		name1 = "James";
		name2 = "Jill";
		name3 = "Betty";
		name4 = "Herb";
		name5 = "Bob";
		
		System.out.println(name5 + " will sit on the left side aisly.");
		System.out.println(name2 + " will sit next to " + name5);
		System.out.println(name1 + " will sit on the right side aisly.");
		System.out.println(name3 + " & " + name4 + " will sit between " + name1 + " & " + name2);
		System.out.println("The seating order from left to right: " + name5+ ", " + name2 + ", " + name3 + " & " + name4 + ", " + name1 +".");
		

	}

}
