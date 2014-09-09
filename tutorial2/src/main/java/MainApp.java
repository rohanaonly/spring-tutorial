import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rohana on 9/9/14.
 */
public class MainApp {

    public static void main(String[] args) {
        /*MessageService messageService=new MessageService();
        MessagePrinter messagePrinter=new MessagePrinter();

        messagePrinter.setMessageService(messageService);

        messagePrinter.printMessage();*/

        ApplicationContext applicationContext;
        applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        MessagePrinter messagePrinter=(MessagePrinter)applicationContext.getBean("messagePrinter");//equivalent to new MessagePrinter()
        MessageService messageService=(MessageService)applicationContext.getBean("messageService");
        //set the service to the printer
        messagePrinter.setMessageService(messageService);
        messagePrinter.printMessage();


    }
}
