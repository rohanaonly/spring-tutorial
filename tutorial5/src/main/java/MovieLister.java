import java.util.Iterator;
import java.util.List;

/**
 * Created by rohana on 9/9/14.
 */
public class MovieLister {

    private MovieFinder finder;

    //setter based dependency injection
    public void setFinder(MovieFinder finder) {
        this.finder = finder;
    }

    /**
     * Method that we need to share.
     * @param arg
     * @return
     */

    public Movie[] moviesDirectedBy(String arg) {
        List allMovies = finder.findAllMovies();
        for (Iterator it = allMovies.iterator(); it.hasNext();) {
            Movie movie = (Movie) it.next();
            if (!movie.getDirector().equals(arg)) it.remove();
        }
        return (Movie[]) allMovies.toArray(new Movie[allMovies.size()]);
    }



}
