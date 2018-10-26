package movie;

import java.util.ArrayList;
import java.util.List;
import movie.upgetset;

public interface upinter {
int upload(upgetset up);
    void update(upgetset up, int movie_id);
    void delete(int id);
    upgetset get(int eid);
    List<upgetset>get();
}
