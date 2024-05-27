/**

 * Project: Space Game
 * Purpose Details: Construction of a text-based Space Game using Java, create class, fields/characteristics and methods/behaviors.Having application print the objects.
 * Course:IST202
 * Author:Christina Yang
 * Date Developed:May26
 * Last Date Changed:May27
 * Revision:4

 */

/**
 * class is ship
 * characteristics are the model and size
 */
public class Ship {
    public String model;
    public String size;
    /**
     * constructor
     */
    public Ship(String model, String size) {
        this.model = model;
        this.size = size;

    }
    /**
     * getter and setter
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

