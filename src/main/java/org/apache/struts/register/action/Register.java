package org.apache.struts.register.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.register.model.Person;

/**
 * Created by xieql2 on 2016/11/21.
 */
public class Register extends ActionSupport {

    private Person personBean;

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person personBean) {
        this.personBean = personBean;
    }


    public void validate(){
        if(personBean.getFirstName().length()==0){
            addFieldError("personBean.firstName","First name is required");
        }
        if(personBean.getEmail().length()==0){
            addFieldError("personBean.email","Email is required");
        }
        if(personBean.getAge()<18){
            addFieldError("personBean.age","Age is required and must be 18 or older");
        }
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
