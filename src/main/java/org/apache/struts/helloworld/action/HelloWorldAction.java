package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.helloworld.model.MessageStore;

/**
 * Created by xieql2 on 2016/11/21.
 */
public class HelloWorldAction extends ActionSupport {

    private static int helloCount=0;

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public  int getHelloCount() {
        return helloCount;
    }

    public  void setHelloCount(int helloCount) {
        HelloWorldAction.helloCount = helloCount;
    }

    private MessageStore messageStore;

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }

    @Override
    public String execute() throws Exception {
        messageStore=new MessageStore("Hello Struts User");
        helloCount++;
        if(userName!=null){
            messageStore.setMessage(messageStore.getMessage()+" "+userName);
        }
        return SUCCESS;
    }


}
