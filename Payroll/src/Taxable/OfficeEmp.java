package Taxable;

public class OfficeEmp {
 String ename;
 public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
/*public Float getYearly_salary() {
	return yearly_salary;
}
public void setYearly_salary(Float yearly_salary) {
	this.yearly_salary = yearly_salary;
}
Float yearly_salary;*/

 Float tax;
public Float getTax() {
	return tax;
}
public Float setTax(Float tax) {
	this.tax = tax;
	return tax;
}
 public Float getMonthly_sal() {
	return monthly_sal;
}
public Float setMonthly_sal(Float monthly_sal) {
	this.monthly_sal = monthly_sal;
	return monthly_sal;
}

Float monthly_sal;
float net_sal;
public float getNet_sal() {
	return net_sal;
}
public void setNet_sal(float net_sal) {
	this.net_sal = net_sal;
}
String Date;
public String getDate() {
	return Date;
}
public String setDate(String date) {
	Date = date;
	return date;
}
float provident_fund;
public float getProvident_fund() {
	return provident_fund;
}
public void setProvident_fund(float provident_fund) {
	this.provident_fund = provident_fund;
}

Float cit;
Float insurance;
Float deduction;

public Float getDeduction() {
	return deduction;
}
public void setDeduction(Float deduction) {
	this.deduction = deduction;
}
public Float getInsurance() {
	return insurance;
}
public void setInsurance(Float insurance) {
	this.insurance = insurance;
}
public Float getCit() {
	return cit;
}
public void setCit(Float cit) {
	this.cit = cit;
}
String maritialstatus;
public String getMaritialstatus() {
	return maritialstatus;
}
public void setMaritialstatus(String maritialstatus) {
	this.maritialstatus = maritialstatus;
}
}
