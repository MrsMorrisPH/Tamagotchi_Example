/**
 * This interface defines the basic behaviors of an animal.
 */
public interface Animal {
    
    /**
     * Represents the action of eating.
     */
    void eat();

    /**
     * Represents the action of sleeping.
     */
    void sleep();

    /**
     * Represents the action of playing.
     */
    void play();

    /**
     * Represents the action of doing nothing.
     */
    void doNothing();

    int getEnergy();

    int getHunger();
    int getHappiness(); 
}
