import java.util.Scanner;
import javax.swing.JOptionPane;
public class Student3
{
	private int id;
    private String name;
    private String dept;
	private  float avg;
	private String rate;
	static int count=0;
	static int count1=0;
 Scanner in=new Scanner(System.in);
 Scanner in1=new Scanner(System.in);
    //......................................	 
	 void add()
	 {  
	 	id=count;
	 	System.out.println ("Enter the name : ");
	 	name=in.nextLine();
	 	System.out.println ("Enter the department : ");
	 	dept=in.nextLine();
	 	System.out.println ("OK.. inserted a new Student .");
	 	count++;
	 	count1++;	 	
	 }
	 //.............................
	 void setname()
	 {
	 	System.out.println ("enter a new name : ");
	 	name=in1.nextLine();	
	 }
	 //.............................
	 void setdept()
	 {
	 	System.out.println ("enter a new dept : ");
	 	dept=in1.nextLine();		
	 }
	 //.............................
	 void getStudent()
	 {
	 	System.out.println ("id = "+id);
	 	System.out.println ("name = "+name);
	 	System.out.println ("dept = "+dept);
	 	System.out.println ("avg = "+avg);
	 	System.out.println ("rate = "+rate);
	 }
	 
	 //..........................
	 void delstudent()
	 {
	 	name=null;
	 	dept=null;
	    count1--;
	   System.out.println ("delete Student");
	   	
	 }
	 
	 //.............................
	 
	void calcAvg()
	{
		int n;
		float sum=0f;
		System.out.println ("Enter num of subject");
		n=in.nextInt();
		float sub[]=new float [n];
		for (int i = 0; i<sub.length; i++)
		{
			System.out.println ("Enter d"+(i+1)+"  :  ");
			sub[i]=in.nextFloat();
		}
		
		for (int i = 0; i<sub.length; i++)
			sum=sum+sub[i];
			
		 avg=sum/n;
		
		if(avg >=90 && avg<=100)
			rate= "Excellent";
		else if(avg >=80 && avg<90)
			rate= "V.good";
			
		else if(avg >=65 && avg<80)
			rate= "Good";
		
		else if(avg >=50 && avg<65)
			rate= "Pass";
			
		else
			rate= "Fail";
			
	}
	
	
	//..............................
	
	
    static void get_count()
    {
    	System.out.println ("Count of student is : "+count1);
    }
	
	//..........................
        
   
    public static void main(String[] args) {
    	
    	JOptionPane.showMessageDialog(null,"Welcome to KSA University");
    	int index=0;
    	Student3 e[]=new Student3[20];
       for(int i=0;i<e.length;i++)
       	e[i]=new Student3();
    	
    	int ch=1;
    	int id;
		do
		{
			System.out.println("Main Menu\n1.Add Student\n2.Update Student\n3.Serach\n4.Delete Student \n5.Display all\n6.Calculate avg\n7.Count of student\n8.exit\n");
		
			Scanner in =new Scanner(System.in);
			ch=in.nextInt();
			switch(ch)
			{ 
				case 1:
					e[index].add();
					index++;
					break;


               case 2:
					System.out.println ("enter  number of employee u want to update .");
					 id=in.nextInt();
					System.out.println ("1-update name\n2-update dept\n");
					int n=in.nextInt();
					switch(n)
					{
						case 1:e[id].setname();break;
						case 2:e[id].setdept();break;
						default:System.out.println ("error");
					}				
					break;					
			 case 3:
					System.out.println ("enter  number of Student u want to search .");
					 id=in.nextInt();
				    e[id].getStudent();
				break;				
			 case 4:
					System.out.println ("enter  number of Student u want to delete .");
					 id=in.nextInt();
					e[id].delstudent();
					break;				
			case 5:
					for(int i=0;i<index;i++)
					{
						e[i].getStudent();
						System.out.println ("---------------");
					}
							
					break;
					
			case 6:
					System.out.println ("enter  number of Student u want to calculate avg .");
					 id=in.nextInt();
					e[id].calcAvg();
					break;
					
			case 7:
				get_count();
				break;
			}
		}
		while(ch!=8); }
		
		}
