public class Player {
    private String name;
    private int score;
    private int health;
    private int ID;

    public Player(String name, int score, int health, int ID) {
        this.name = name;
        this.score = score;
        this.health = health;
        this.ID = ID;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
}
