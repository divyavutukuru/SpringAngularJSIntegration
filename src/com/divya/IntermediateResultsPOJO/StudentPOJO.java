package com.divya.IntermediateResultsPOJO;

public class StudentPOJO {
	
	private int hallTktNo;
	private String firstName;
	private String lastName;
	private String fullName;
	private int maths;
	private int physics;
	private int chemistry;
	private int total;
	
	public StudentPOJO(){}
	
	public StudentPOJO(int hallTktNo,String firstName,String lastName,String fullName,
						int maths,int physics,int chemistry,int total){
		this.hallTktNo = hallTktNo;
		this.firstName =firstName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.total = total;
	}
	
	public int getHallTktNo() {
		return hallTktNo;
	}

	public void setHallTktNo(int hallTktNo) {
		this.hallTktNo = hallTktNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}


}
