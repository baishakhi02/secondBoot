package org.anudip.secondBoot.bean;

public class EmpBean {
	int Id;
	String name;
	public EmpBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpBean(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
