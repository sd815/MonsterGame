public class Person {
    int x, y;
    String image = "\uD83E\uDDD9";
    int live = 3;

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean isMoveCorrect(int x, int y) {
        return this.x == x && Math.abs(this.y - y) == 1 || this.y == y && Math.abs(this.x - x) == 1;
    }
}
