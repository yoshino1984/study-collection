package behavioral.command.entity;

import java.util.Objects;

/**
 * @author wangxin
 * 2020/4/18 09:55
 * @since
 **/
public class Event {
    public static final Event GOT_DIAMOND = new Event("GOT_DIAMOND");

    private String name;

    public Event(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(name, event.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
