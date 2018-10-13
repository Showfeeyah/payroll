import java.util.Scanner;

class Calulation {
	}
public class Details {


	
public static void main(String args[]) {
	Scanner	 scan=new Scanner(System.in);
	
	Employee e=new Employee();
	
	System.out.println("Enter weaver name?");
	e.setEname(scan.nextLine());
	
	System.out.println("Enter carpet name ie savana,fade,hage,bali,peacock...?");
	e.setCname(scan.nextLine());
	
	System.out.println("Enter Length in cm per day?");
	Float length=e.setLen(scan.nextFloat());
	while (length <= 0)
    {
        System.out.print("Please enter a positive number of employees in the division:"); // prompt
       length= e.setLen(scan.nextFloat()); // input
    }

	
	System.out.println("Enter Breadth in cm per day?");
	Float breadth=e.setBth(scan.nextFloat());
	//float breadth=scan.nextFloat();
	
	/*float mtrsqr=(length*breadth)/10000;
	e.setMtrsqr(mtrsqr);*/
	System.out.println(e.disp_meter(e.getLen(),e.getBth()));
	Float sqtmtrmth=e.disp_meter(e.getLen(),e.getBth())*25;
	
	if (e.cname.equalsIgnoreCase("savana"))
	{
		 float wages=e.disp_meter(e.getLen(),e.getBth())*400;
		 e.setWages(wages);
	} 
	else if(e.cname.equalsIgnoreCase("fade"))
	{
		 float wages=e.disp_meter(e.getLen(),e.getBth())*8999;
		 e.setWages(wages);
		}
	else if(e.cname.equalsIgnoreCase("hage"))
	{
		 float wages=e.disp_meter(e.getLen(),e.getBth())*645;
		 e.setWages(wages);
		}
	else if(e.cname.equalsIgnoreCase("bali"))
	{
		 float wages=e.disp_meter(e.getLen(),e.getBth())*679;
		 e.setWages(wages);
		}
	else if(e.cname.equalsIgnoreCase("peacock"))
	{
		 float wages=e.disp_meter(e.getLen(),e.getBth())*2767;
		 e.setWages(wages);
		}
	else {
		System.out.println("carpet name not included! enter valid carpet name");
	}
	
	System.out.println("Enter Medical expences per year?");
	float medicalexp=e.setMedExp(scan.nextFloat());
	
	Float wagemonthly=e.getWages()*25;
	Float wageyearly=e.getWages()*12;
	
	Float medicaltax=(medicalexp*0.15f);
	e.setMedTax(medicaltax);
	
	Float pf=(0.12f*e.getWages()*25);

	Float pfyear=(float) (pf*12);
	
	System.out.println("Do you want monthly details?y or n?");
	e.setMdetail(scan.next());
	

		if (e.mdetail.equals("y") || e.mdetail.equals("Y")) {
			System.out.println("****************MONTHLY DETAILS*********************");
			System.out.println("Employee: "+e.getEname());
			System.out.println("Worked average "+sqtmtrmth+"mtrsq in one month.");
			System.out.println("Earns:Rs."+wagemonthly +" per month. ");
			System.out.println("your provident fund is:Rs."+pf+" per month");
			System.out.println();
			
		}
		 else {
			 	System.out.println("*****************your todays detail is:*******************");
			 	System.out.println("Employee: "+e.getEname());
				System.out.println("Worked "+e.disp_meter(e.getLen(),e.getBth())+" mtrsq per day.");
				System.out.println("Earns:"+e.getWages() +"per day. ");
				System.out.println();
				System.out.println();
		}
	
	System.out.println("Do you want yearly details?y or n?");
	e.setYdetail(scan.next());

	 if(e.ydetail.equals("y") || e.ydetail.equals("Y")){
		System.out.println("****************YEARLY DETAILS*********************");
		System.out.println("Employee               :"+e.getEname());
		System.out.println("Earns                  :"+wageyearly +" per year. ");
		System.out.println("Your provident fund is "+pfyear+" per year");
		System.out.println("Your bonus amount is   "+e.bonus);
		System.out.println("Your medical expenses is "+e.getMedExp());
		System.out.println("Your medical tax becomes "+e.getMedTax()+" per year.");
		System.out.println();
	}
	 else {
		 	System.out.println("*****************your todays detail is:*******************");
		 	System.out.println("Employee: "+e.getEname());
			System.out.println("Worked "+e.disp_meter(e.getLen(),e.getBth())+" mtrsq per day.");
			System.out.println("Earns:"+e.getWages() +"per day. ");
			System.out.println();
	}
	
	
	/*System.out.println("Married Or Unmarried?");
	e.setMaritialStatus(scan.nextLine());
	 // if(e.MaritialStatus.equalsIgnoreCase("married or age>0 and age<20"))
	    if(e.MaritialStatus.equalsIgnoreCase("married"))
	    {
	    	Float bonus=(float) (e.getWages()*0.04);
	    	e.setBonus(bonus);
	    	
	    }
	    else if(e.MaritialStatus.equalsIgnoreCase("unmarried"))
	    {
	    	Float bonus=(float) (e.getWages()*0.05);
	    	e.setBonus(bonus);
	    }
	    else {
	    	System.out.println("enter valid maritial status!");
	    }
	    */
	    
	  
	
}
}
