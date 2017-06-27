public class MyProgram {


	public static void main(String[] args)
	 {

		Objects people = new Objects("Nadhif");
		people.setAge(19);
		Aging(people);
		//Printing my Age
		System.out.println(people.getAge());

		//Printing my Name
		System.out.println(people.name);
	
	} 

	//Printing out the age

	static void Aging(Objects ages)
	{
		ages.setAge(ages.getAge()+1);
	}
}
	
