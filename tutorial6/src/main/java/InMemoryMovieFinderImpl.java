import java.util.ArrayList;
import java.util.List;

/**
 * Created by rohana on 9/9/14.
 */
public class InMemoryMovieFinderImpl implements MovieFinder {
    public List<Movie> findAllMovies(){
        ArrayList list=new ArrayList<Movie>();


        Movie movie=new Movie();
        movie.setName("Avatar");
        movie.setDirector("J.Cameron");

        list.add(movie);

        Movie movie1=new Movie();
        movie1.setName("Titanic");
        movie1.setDirector("J.Cameron");

        list.add(movie1);



        Movie movie2=new Movie();
        movie2.setName("The Terminator");
        movie2.setDirector("J.Cameron");

        list.add(movie2);


        Movie movie3=new Movie();
        movie3.setName("Jurassic Park");
        movie3.setDirector("S.Spielberg");

        list.add(movie3);



        return list;
    }
}
