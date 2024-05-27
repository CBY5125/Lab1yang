public class Enemies {
    private String category;
    private int levels;

    public Enemies(String category, int levels) {
        this.category = category;
        this.levels = levels;
    }


    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }


    public int getLevels() {
        return levels;
    }
    public void setLevels(int levels) {
        this.levels = levels;
    }
}