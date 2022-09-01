
public class Employee {

	String name;
	double salary;
	int workHours;
	int hireYear;
	
	Employee(String name,double salary,int workHours,int hireYear)
	{
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
		
	}
	
	public double tax()
	{
		if(this.salary>=1000)
		{
			return this.salary*0.03;
		}
		else return 0;
	}
	public double bonus()
	{
		if(this.workHours>40)
		{
			return (this.workHours-40)*30;
		}
		else return 0;
	}
	public double raiseSalary()
	{
		int year=2021;
		int time=year-this.hireYear;
		
		if(time<10) 
		{
			return this.salary*0.05;
		}
		if(time>9 && time<20) 
		{
			return this.salary*0.01;
		}
		if(time>19) 
		{
			return this.salary*0.15;
		}
		return 0;
	}
	
	public double totalSalary()
	{
		double total=this.salary+raiseSalary()+bonus();
		return total; 
	}
	public double netSalary()
	{
		double net=totalSalary()-tax();
		return net;
	}
	
	public String toString()
	{
		return "Adý: "+this.name+"\rMaaþý: "+this.salary+"\rÇalýþma Saati: "+this.workHours+"\rÝþe Giriþ Yýlý: "+this.hireYear
				+"\rVergi Tutarý: "+tax()+"\rBonus Tutarý: "+bonus()+"\rMaaþ Artýþ Tutarý: "+raiseSalary()
				+"\rToplam Maaþ: "+totalSalary()+"\rNet Maaþ: "+netSalary();
	}
}
