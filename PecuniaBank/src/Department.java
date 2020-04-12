public class Department {
	int dptNo;
	String dptName;
	int mngId;
	public int getDptNo() {
		return dptNo;
	}
	public void setDptNo(int dptNo) {
		this.dptNo = dptNo;
	}
	public String getDptName() {
		return dptName;
	}
	public void setDptName(String dptName) {
		this.dptName = dptName;
	}
	public int getMngId() {
		return mngId;
	}
	public void setMngId(int mngId) {
		this.mngId = mngId;
	}
	public Department(int dptNo, String dptName, int mngId) {
		this.dptNo=dptNo;
		this.dptName=dptName;
		this.mngId=mngId;
	}

}