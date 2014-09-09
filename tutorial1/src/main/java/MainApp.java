/**
 * Created by rohana on 9/9/14.
 */
public class MainApp {

    public static void main(String[] args) {
        MessageService messageService=new MessageService();
        MessagePrinter messagePrinter=new MessagePrinter();

        messagePrinter.setMessageService(messageService);

        messagePrinter.printMessage();
    }
}
