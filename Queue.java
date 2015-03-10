

public class Queue 
{
	
		private Person firstPerson;
		private Person lastPerson;
		int count;
		public Queue()
		{
			this.firstPerson = null;
			this.lastPerson = null;
			count = 0;
		}
		public void enqueue(Person p)
		{
			Person currPerson = p;
			if(this.firstPerson == null)
			{
			this.firstPerson = currPerson;
			this.lastPerson = currPerson;
			count++;
			}
			else
			{
			lastPerson.setNextPerson(currPerson);
			currPerson.setPrevPerson(lastPerson);
			lastPerson = currPerson;
			count++;
			}
		}
		public Person dequeue() throws Exception
		{
			if(this.count == 0)
			{
			throw new Exception("It Is Empty Queue");
			}
			else if(this.count == 1)
			{
			Person currPerson = lastPerson;
			this.firstPerson = null;
			this.lastPerson = null;
			this.count--;
			return currPerson;
			}
			else
			{
			Person currPerson = firstPerson;
			currPerson.getNextPerson().setPrevPerson(null);
			lastPerson = currPerson.getNextPerson();
			currPerson.setNextPerson(null);
			this.count--;
			return currPerson;
			}
			
		
		}
}
