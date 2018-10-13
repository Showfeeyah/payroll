
public class Employee {

	String ename;
	String cname;
	Float len;
	float rate;
	Float insurance=1200.00f;
	String mdetail;
	public String getMdetail() {
		return mdetail;
	}
	public void setMdetail(String mdetail) {
		this.mdetail = mdetail;
	}
	public String getYdetail() {
		return ydetail;
	}
	public void setYdetail(String ydetail) {
		this.ydetail = ydetail;
	}
	String ydetail;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Float getLen() {
		return len;
	}
	public Float setLen(Float len) {
		this.len = len;
		return len;
	}
	public Float getBth() {
		return bth;
	}
	public Float setBth(Float bth) {
		this.bth = bth;
		return bth;
	}
	public Float getMtrsqr() {
		return mtrsqr;
	}
	public void setMtrsqr(Float mtrsqr) {
		this.mtrsqr = mtrsqr;
	}
	public Float getWages() {
		return wages;
	}
	public void setWages(Float wages) {
		this.wages = wages;
	}
	Float bth;
	Float mtrsqr;
	Float wages;
	public String getMaritialStatus() {
		return MaritialStatus;
	}
	public String setMaritialStatus(String maritialStatus) {
		return MaritialStatus;
	}
	String MaritialStatus;
	
	Float MedExp;
	public Float getMedExp() {
		return MedExp;
	}
	public Float setMedExp(Float medExp) {
		
		this.MedExp = medExp;
		return MedExp;
	}
	Float MedTax;
	public Float getMedTax() {
		return MedTax;
	}
	public Float setMedTax(Float medTax) {
		this.MedTax = medTax;
		return MedTax;
	}
	Float Pfund;
	public Float getPfund() {
		return Pfund;
	}
	public void setPfund(Float pfund) {
		Pfund = pfund;
	}
	
	Float bonus;
	public Float getBonus() {
		return bonus;
	}
	public Float setBonus(Float bonus) {
		this.bonus = bonus;
		return bonus;
	}
	
	
	public float disp_meter(float length,float breadth)
	{
		float value=(length*breadth)/10000;
		return value;
	}

	
}
