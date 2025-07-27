public class Platform {
    public int x, y, w;
    public String type;

    public Platform(int x, int y, int w, String type) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.type = type;
    }

    public void print() {
        System.out.println("Platform [" + type + "] at (" + x + "," + y + ") width: " + w);
    }
}
