import java.util.ArrayList;

public class Level {
    public ArrayList<Platform> layout;
    public String bgColor, platformColor, goalColor;
    public double gravity;
    public Platform goal;

    public Level() {
        layout = new ArrayList<>();
    }

    public void printLayout() {
        System.out.println("Background: " + bgColor);
        System.out.println("Gravity: " + gravity);
        for (Platform p : layout) {
            p.print();
        }
        System.out.println("Goal at (" + goal.x + "," + goal.y + ")");
    }
}
