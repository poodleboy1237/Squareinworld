public class LevelData {
    public static Level loadLevel(int id) {
        Level level = new Level();

        if (id == 0) {
            level.bgColor = "#130024";
            level.platformColor = "orchid";
            level.goalColor = "aqua";
            level.gravity = 0.6;
            for (int i = 0; i < 150; i++) {
                double angle = i * 0.15;
                int x = (int)(640 + Math.cos(angle) * angle * 40);
                int y = (int)(680 - Math.sin(angle) * angle * 20);
                int w = Math.max((int)(60 - i * 0.2), 30);
                level.layout.add(new Platform(x, y, w, "solid"));
            }
            Platform goal = new Platform(level.layout.get(149).x + 100, level.layout.get(149).y - 40, 30, "goal");
            level.goal = goal;
        }

        if (id == 1) {
            level.bgColor = "#0B1F1D";
            level.platformColor = "#84FFD9";
            level.goalColor = "lime";
            level.gravity = 0.8;
            for (int i = 0; i < 100; i++) {
                int x = 200 + i * 50;
                int y = 400 + (int)(Math.sin(i * 0.25) * 60);
                int w = 40 + (i % 3) * 10;
                String type = (i % 5 == 0) ? "rotating" : "bendable";
                level.layout.add(new Platform(x, y, w, type));
            }
            for (int i = 0; i < 90; i++) {
                int x = 300 + (int)(Math.sin(i * 0.3) * 90);
                int y = 900 - i * 8;
                int w = 50 - (i % 4) * 5;
                String type = (i % 10 == 0) ? "echo" : "solid";
                level.layout.add(new Platform(x, y, w, type));
            }
            level.goal = new Platform(1100, 220, 40, "goal");
        }

        if (id == 2) {
            level.bgColor = "#1F0A2D";
            level.platformColor = "#FFD0F9";
            level.goalColor = "#FFFCF2";
            level.gravity = 0.7;
            for (int i = 0; i < 120; i++) {
                int x = 100 + (int)(Math.sin(i * 0.2) * 80);
                int y = 300 + i * 6;
                int w = 50 + (i % 2) * 20;
                level.layout.add(new Platform(x, y, w, "bendable"));
            }
            for (int i = 0; i < 60; i++) {
                int x = 600 + (int)(Math.cos(i * 0.3) * 100);
                int y = 100 + i * 10;
                int w = 45 + (i % 3) * 15;
                String type = (i % 7 == 0) ? "ghost" : "solid";
                level.layout.add(new Platform(x, y, w, type));
            }
            level.goal = new Platform(1180, 80, 30, "goal");
        }

        return level;
    }
}
