package Taxable;

import java.util.Scanner;

public class OfficeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		OfficeEmp obj=new OfficeEmp();
		
		
		
		System.out.println("enter name:");
		obj.setEname(input.next());
		
		System.out.println("enter  monthly salary:");
		float msal=obj.setMonthly_sal(input.nextFloat());
		
		float ysal=msal*12;
		System.out.println("Yearly salary :Rs"+ysal);

		Float bonus=ysal*0.04f;
		System.out.println("Your bonus:Rs"+bonus);
		float total_sal=ysal+bonus;
		System.out.println("your total salary:Rs"+total_sal);
		
		
		
		System.out.println("Fiscal year(yyyy):");
		String date=obj.setDate(input.next());
		  System.out.println(date);
		if(date.equals("2074")) {
			float provident_fund=total_sal*0.12f;
			obj.setProvident_fund(provident_fund);
		}
		else if(date.equals("2075")) {
			float provident_fund=total_sal*0.13f;
			obj.setProvident_fund(provident_fund);
		}
		
		System.out.println("Enter yearly citizen Investment Trust:");
		obj.setCit(input.nextFloat());
		
		System.out.println("your Yearly Insurance:");
		obj.setInsurance(input.nextFloat());
		
		System.out.println("Your PF:Rs"+obj.getProvident_fund());
		System.out.println("Your CIT:Rs"+obj.getCit());
		System.out.println("Your Insuance:Rs"+obj.getInsurance());
		System.out.println();
		
		obj.setDeduction(obj.getProvident_fund()+obj.getCit()+obj.getInsurance());
		System.out.println("total deduction:"+obj.getDeduction());
		
		
		float net_salary=total_sal-obj.getDeduction();
		System.out.println("net salary:Rs"+net_salary);
		System.out.println();
		
		System.out.println("Married Or Unmarried?");
		obj.setMaritialstatus(input.next());
		String marry=obj.getMaritialstatus();
		
		
		/////////////////////////////////first phase///////////////////////////////
		
		if(marry.equalsIgnoreCase("unmarried"))
		{
			if (net_salary<=350000) {
				Float tax=obj.setTax(net_salary*0.01f);
				obj.setTax(tax);
				}
				
				else if (net_salary>350000 && net_salary<=450000 ){
					
					Float tax=(350000*0.01f)+((net_salary-350000)*0.1f);
					obj.setTax(tax);
				}
				else if(net_salary>450000 && net_salary<=650000) {

					Float tax=(350000*0.01f)+(100000*0.1f)+((net_salary-450000)*0.2f);
					obj.setTax(tax);
				}
				else if (net_salary>650000 && net_salary<=2000000)
				{
					Float tax=(350000*0.01f)+(100000*0.1f)+(200000*0.2f)+((net_salary-650000)*0.3f);
					obj.setTax(tax);
				}
				else {
					Float tax=(350000*0.01f)+(100000*0.1f)+(200000*0.2f)+(1350000*0.3f)+((net_salary-2000000)*0.39f);
					obj.setTax(tax);
				}
				System.out.println("Total tax:Rs"+obj.getTax());
		}
		else if(marry.equalsIgnoreCase("married")) {
			
			if (net_salary<=400000) {
				Float tax=obj.setTax(net_salary*0.01f);
				obj.setTax(tax);
				}
				
				else if (net_salary>400000 && net_salary<=500000 ){
					
					Float tax=(400000*0.01f)+((net_salary-400000)*0.1f);
					obj.setTax(tax);
				}
				else if(net_salary>500000 && net_salary<=700000) {

					Float tax=(400000*0.01f)+(100000*0.1f)+((net_salary-500000)*0.2f);
					obj.setTax(tax);
				}
				else if (net_salary>700000 && net_salary<=2000000)
				{
					Float tax=(400000*0.01f)+(100000*0.1f)+(200000*0.2f)+((net_salary-700000)*0.3f);
					obj.setTax(tax);
				}
				else {
					Float tax=(400000*0.01f)+(100000*0.1f)+(200000*0.2f)+(130000*0.3f)+((net_salary-2000000)*0.39f);
					obj.setTax(tax);
				}
				System.out.println("Total tax:Rs"+obj.getTax());
		}
		else
		{
			System.out.println("No Data to be displayed!\n Enter valid maritial status");
		}
	}
}