import java.util.Objects;

public class Pos{
    private Integer x;
    private Integer y;


    public Pos(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer y() {
        return y;
    }

    public Integer x() {
        return x;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pos pos = (Pos) o;
        return Objects.equals(x, pos.x) && Objects.equals(y, pos.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
