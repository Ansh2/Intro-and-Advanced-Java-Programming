package Chapter3;
public class Animal {
	
	private String type; 
	private int amountOfAn;  
	private String colorofAn; 
	
	//The point of static instance variables is so that you can use the same instance of that thorughout and you doi not need to have modifers on that instance variable (in some cases
	//it is better to use static varibles rather than non-static instance variables. 
	
	//Create an animal class that has an animal type attribute, one method for the animal sleeping, and another for the animal walking. variable to show the amount of animals. Set and get method for color of animal

	

	public Animal(String type, int amountOfAn, String colorOfAn) {
		this.type = type; 
		this.amountOfAn = amountOfAn; 
		this.colorofAn = colorOfAn; 
	}
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmountOfAn() {
		return amountOfAn;
	}

	public void setAmountOfAn(int amountOfAn) {
		this.amountOfAn = amountOfAn;
	}
	

	public String getColorofAn() {
		return colorofAn;
	}


	public void setColorofAn(String colorofAn) {
		this.colorofAn = colorofAn;
	}

	
	public void isAnimalSleeping() {
		System.out.println(this.type + "is sleeping");
	}
	public void animalWalking() {
		System.out.println(this.type + "is also walking");
	}
	

	
	


	public static void main(String[] args) {
		Animal one = new Animal("Lion", 25, "white");
		Animal two = new Animal("Snake", 3, "grey"); 
		System.out.println(one.getColorofAn());
		two.isAnimalSleeping(); 
		one.animalWalking(); 
		
				
		
	}

}
