import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the type of pet
        System.out.println("What type of pet would you like? (cat, dog, unicorn, dragon)");
        String petType = scanner.nextLine().toLowerCase();

        // Ask the user for the name of the pet
        System.out.println("What would you like to name your pet?");
        String petName = scanner.nextLine();

        // Create the appropriate pet object based on user input
        Animal pet = createPet(petType, petName);
        System.out.println("You have adopted a " + petType + " named " + petName + "!");
        
        while(pet.getEnergy() > 0 && pet.getHappiness() > 0 && pet.getHunger() < 100) {
            // Display pet options
            displayPetOptions(petType);
            System.out.println("Choose an action for your pet:");
            String action = scanner.nextLine().toLowerCase();

            // Perform the chosen action
            switch (action) {
                case "eat":
                    pet.eat();
                    break;
                case "sleep":
                    pet.sleep();
                    break;
                case "play":
                    pet.play();
                    break;
                case "do nothing":
                    pet.doNothing();
                    break;
                default:
                    System.out.println("Invalid action. Please choose again.");
                    continue;
            }
        }

            // Display the pet's current status
            System.out.println(petName + "'s Status - Energy: " + pet.getEnergy() + ", Hunger: " + pet.getHunger() + ", Happiness: " + pet.getHappiness());
        
        
        }
    

    public static Animal createPet(String petType, String petName) {
        Animal pet;
        switch (petType.toLowerCase()) {
            case "cat":
                pet = new Cat(petName);
                break;
            case "dog":
                pet = new Dog(petName);
                break;
            case "unicorn":
                pet = new Unicorn(petName);
                break;
            case "dragon":
                pet = new Dragon(petName);
                break;
            default:
                pet = null;
                break;
        }
        return pet;
    }

    public static void displayPetOptions(String petType){
        switch (petType.toLowerCase()) {
            case "cat":
                displayCatOptions();
                break;
            case "dog":
                displayDogOptions();
            case "unicorn":
                displayUnicornOptions();
            case "dragon":
                displayDragonOptions();
            default:
                break;
        }
    }
    public static void displayCatOptions() {
        System.out.println("Options for Cat: eat, sleep");
    }
    public static void displayDogOptions() {
        System.out.println("Options for Dog: eat, sleep, play, do nothing");
    }
    public static void displayUnicornOptions() {
        System.out.println("Options for Unicorn: eat, sleep, play, do nothing");
    }
    public static void displayDragonOptions() {
        System.out.println("Options for Dragon: eat, sleep, play, do nothing");
    }
// test
public static void test() {
    System.out.println("testing commit");
}
}
