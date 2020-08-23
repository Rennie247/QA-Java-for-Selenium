package Assignment_4;

public class AdetolaPg39Point4 {

	public static void main(String[] args) {
		// Define a string array with 5 strings and search for a string in the array
		
		String animals[] = {"Dog", "Cat", "Goat", "Sheep", "Lion"};
		String findAnimal = "Sheep";  //findAnimal will be the variable used to search a string array

		boolean animalFound = false;
		
		for(String a : animals) {
				if(a == findAnimal) { 
					animalFound= true;
					break;
				}
			}
		
		if (animalFound==true) {
			System.out.println(findAnimal + " can be found");
		}
			else {
				System.out.println(findAnimal + " can not be found");
				} 
		
			}  
		}	
	

