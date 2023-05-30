package ezen.io.raf;

import java.io.Serializable;

/**
 * 친구정보 추상화
 * 230530 수업
 */
public class Friend implements Serializable {
	
	private static final long serialVersionUID = -4926479879943290774L;
	
	private String name;
	private int age;
	private double weight;
	private String telephone;

	public Friend(){}
	
	public Friend(String name, int age, double weight, String telephone) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.telephone = telephone;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}
	
	public String getName(){
		return name;
	}
	
	public String getTelephone(){
		return telephone;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Friend [name=" + name + ", telephone=" + telephone + ", age="
				+ age + ", weight=" + weight + "]";
	}
}
