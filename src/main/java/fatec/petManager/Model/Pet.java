package fatec.petManager.Model;

public class Pet {
	String animalName;
	String animalType;
	String weight;
	int age;
	int criticality;
	int list;
	
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCriticality() {
		return criticality;
	}
	public void setCriticality(int criticality) {
		this.criticality = criticality;
	}
	public int getQueue() {
		return list;
	}
	public void setQueue(int queue) {
		this.list = list;
	}
}