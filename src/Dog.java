/**
 * Represents a Dog that implements the Animal interface.
 */
public class Dog implements Animal {

    private int energy;
    private int hunger;
    private int happiness;
    private String name;

    /**
     * Constructor to initialize the Dragon's attributes.
     *
     * @param name     The name of the dragon.
     * @param energy   The initial energy level of the dragon.
     * @param hunger   The initial hunger level of the dragon.
     * @param happiness The initial happiness level of the dragon.
     */
    public Dog(String name) {
        this.name = name;
        this.energy = 100;
        this.hunger = 0;
        this.happiness = 100;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating.");
        hunger -=10;
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
        energy +=20;
    }

    @Override
    public void play() {
        System.out.println(name + " is playing.");
        energy -=10;
        happiness +=15;
        hunger +=10;
    }

    @Override
    public void doNothing() {
        System.out.println(name + " is doing nothing.");
        hunger +=5;
        happiness -= 20;
    }
    /**
     * Gets the energy level of the cat.
     *
     * @return The energy level.
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * Gets the hunger level of the cat.
     *
     * @return The hunger level.
     */
    public int getHunger() {
        return hunger;
    }

    /**
     * Gets the happiness level of the cat.
     *
     * @return The happiness level.
     */
    public int getHappiness() {
        return happiness;
    }
}
