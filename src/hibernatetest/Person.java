package hibernatetest;

import javax.persistence.*;

@Entity
@Table(name="person")
public class Person 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private double height;
	private String name;
	private int age;
	private double weight;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	

}
