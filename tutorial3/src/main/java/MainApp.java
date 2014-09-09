import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rohana on 9/9/14.
 */
public class MainApp {

    public static void main(String[] args) {

        MovieLister movieLister=new MovieLister();

        Movie[] movies=movieLister.moviesDirectedBy("J.Cameron");
        System.out.println("*****Films directed by J.Cameron******");
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            System.out.println(movie.getName());
        }


    }
}
