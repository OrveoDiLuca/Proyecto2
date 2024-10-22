/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.util.Random;

/**
 *
 * @author orveodiluca
 */
public class Fighter {

    // Characters will also work as nodes on queues, so they will have a next
    // attribute
    private Fighter next;
    // Unique ID
    private String id;

    // Cicle counter
    private int counter;

    // Character stats they will always stay between 0 and 100
    private int skillPoints;
    private int healthPoints;
    private int strengthPoints;
    private int agilityPoints;
    // Character quality Booleans depending on the level of each stat, it will
    // qualify as "quality" or not, the requirements for the stat to be quality
    // varies for each stat
    private int overallQuality; //

    // Path of the character image
    private String[] imageCollection;

    private String name;
    
    public Fighter(String id, int skillPoints, int healthPoints, int strengthPoints, int agilityPoints,
            int overallQuality, String imageCollection) {
        this.id = id;
        this.next = null;
        this.counter = 0;
        this.skillPoints = skillPoints;
        this.healthPoints = healthPoints;
        this.strengthPoints = strengthPoints;
        this.agilityPoints = agilityPoints;

        this.overallQuality = overallQuality;

        this.imageCollection = randomCharacter(imageCollection);

        this.name = id + " " + this.imageCollection[1];
    }

    public Fighter getNext() {
        return next;
    }

    public void setNext(Fighter next) {
        this.next = next;
    }

    public String getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getSkillPoints() {
        return skillPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getStrengthPoints() {
        return strengthPoints;
    }

    public int getAgilityPoints() {
        return agilityPoints;
    }

    public int getOverallQuality() {
        return overallQuality;
    }

    public void setOverallQuality(int overallQuality) {
        this.overallQuality = overallQuality;
    }

    public String[] getImageCollection() {
        return imageCollection;
    }

    public void setImageCollection(String[] imageCollection) {
        this.imageCollection = imageCollection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void printStatitics() {
        System.out.println("----------------------------");
        System.out.println("Id: " + getId());
        System.out.println("SkillPoints: " + getSkillPoints());
        System.out.println("HealthPoints: " + getHealthPoints());
        System.out.println("StrengthPoints: " + getStrengthPoints());
        System.out.println("AgilityPoints: " + getAgilityPoints());
        System.out.println("Overall Quality: " + getOverallQuality());
        System.out.println("----------------------------");
    }

    private String[] randomCharacter(String images) {
        String[][] array = {};
        if ("ST".equals(images)) {
            array = STCharacters;
        } else if ("SW".equals(images)) {
            array = SWCharacters;
        }

        // Picking a random element from the array
        Random random = new Random();
        String[] randomElement = array[random.nextInt(array.length)];

        return randomElement;
    }

    // What is below is for testing
    String[][] STCharacters = {
        {"src/images/JamesTKirk.png", "JamesTKirk"},
        {"src/images/Spocks.png", "Spocks"},
        {"src/images/LRell.png", "LRell"},
        {"src/images/Saru.png", "Saru"},
        {"src/images/Adira.png", "Adira"},

    };

    String[][] SWCharacters = {
        {"src/images/Vader.png", "Vader"},
        {"src/images/C-3PO.png", "C-3PO"},
        {"src/images/Yoda.png", "Yoda"},
        {"src/images/Obi-Wan_Kenobi.png", "Obi-Wan Kenobi"},
        {"src/images/Chewbacca.png", "Chewbacca"},
        {"src/images/R2-D2_Droid.png", "R2-D2"}
    };
}
