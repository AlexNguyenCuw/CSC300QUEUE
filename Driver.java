
public class Driver
{
	public static void main(String[] elephant)throws Exception
	{
		Person p = new Person ("Person 1");
		Person p2 = new Person ("Person 2");
		p.display();
		p2.display();
		
		Queue q = new Queue(); 
		for(int i =1; i < 101; i++)
		{
			Person p1= new Person("Person" + i);
			q.enqueue(p1);
		}
		for(int j =1; j < 101; j++)
		{
			q.dequeue().display();
		}
		
	}
	
	
}
