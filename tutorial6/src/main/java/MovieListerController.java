import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Created by rohana on 9/9/14.
 */
public class MovieListerController implements Controller {

    private MovieLister movieLister;

    public MovieLister getMovieLister() {
        return movieLister;
    }

    public void setMovieLister(MovieLister movieLister) {
        this.movieLister = movieLister;
    }

    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        String by=httpServletRequest.getParameter("by");
        if(by==null){
            by="rohana";
        }
        ModelAndView modelAndView=new ModelAndView("list","movies",movieLister.moviesDirectedBy(by));
        modelAndView.addObject("by",by);
        return modelAndView;
    }
}
