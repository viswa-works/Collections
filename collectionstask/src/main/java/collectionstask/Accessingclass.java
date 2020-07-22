package collectionstask;
import java.lang.instrument.Instrumentation;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;

public class Accessingclass {
	 public  static Instrumentation instrumentation;
	private static final org.apache.logging.log4j.Logger vissu =LogManager.getLogger(Accessingclass.class);
	public static void main(String args[])
	{
		Scanner ama=new Scanner(System.in);
		ImplementationList<Object> am=new ImplementationList<Object>();
		while(true)
		{
			vissu.info("Select the options 1.print the list 2.add elements 3.delete paartular position 4.fetch data at position 5.break");
			int s=ama.nextInt();
			if(s==1)
			{
				vissu.info(am);
			}
			else if(s==2)
			{
				vissu.info("Enter the how many elements u want to add");
				int w=ama.nextInt();
				for(int i=0;i<w;i++)
				{
					am.adding(ama.next());
					
				}
				
				
			}
			else if(s==3)
			{
				vissu.info("Enter the position to delete at particualar index");
				int g=ama.nextInt();
				
				
				am.remove(g);
				
			}
			else if (s==4)
			{
				vissu.info("Enter the position to fetch the data or acess it");
				int g1=ama.nextInt();
				Object y1=am.getting(g1);
				vissu.info(y1);
			}
			else
			{
				break;
			}
			
			
		}
	}
}
