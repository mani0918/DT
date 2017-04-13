package com;
import javax.persistence.Entity;
import javax.persistence.*;


@Entity
@Table(name="Student")
public class Student {

	
	@Id
	int studid;
	
	String studname,addr;
	public int getStudid(){
		return studid;
		
	}
	public void setStupid(int studid)
	{
		this.studid=studid;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
