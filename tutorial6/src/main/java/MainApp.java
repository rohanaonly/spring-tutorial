import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rohana on 9/9/14.
 */
public class MainApp {

    public static void main(String[] args) {


        ApplicationContext applicationContext;
        applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        MovieLister movieLister=(MovieLister)applicationContext.getBean("movieLister");//equivalent to new MessagePrinter()

        Movie[] movies=movieLister.moviesDirectedBy("rohana");
        System.out.println("*****Films directed by krishan******");
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            System.out.println(movie.getName());
        }


    }
}
