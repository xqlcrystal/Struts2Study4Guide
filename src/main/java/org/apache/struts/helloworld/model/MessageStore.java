package org.apache.struts.helloworld.model;

/**
 * Created by xieql2 on 2016/11/21.
 */
public class MessageStore {

    private String message;

    public MessageStore(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {

        return message + " (from toString)";

    }
}
