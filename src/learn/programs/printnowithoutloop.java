package learn.programs;

public class printnowithoutloop {
	
	public static void main(String[] args) {
		
		printnowithoutloop p = new printnowithoutloop();
		int i =1;
		p.print(i);
		
	}


public void print(int no)
{
	
	if(no<=100)
	{
		System.out.println(no);
		no++;
		print(no);

	}


}
	
}

