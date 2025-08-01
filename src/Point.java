
import java.io.Serializable;
import javax.persistence.*;
/* Point Class
 Author: ObjectDB Manual
 */

@Entity
public class Point implements Serializable {

    //The serialVersionUID is a universal version identifier for a Serializable class
    private static final long serialVersionUID = 1L;
    //This annotation specifies the primary key of the entity
    @Id
    //generate primary key value automatically
    @GeneratedValue
    private long id;

    private int x;
    private int y;

    public Point() {}

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Long getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}
