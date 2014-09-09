/**
 * Created by rohana on 9/9/14.
 */
public class MessagePrinter {
    MessageService messageService;

    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }


    public void printMessage(){
        System.out.println(this.messageService.getMessage());
    }
}
