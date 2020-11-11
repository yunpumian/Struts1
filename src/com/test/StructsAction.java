package com.test;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * @author :wn
 * @program : Test2
 * @descript :
 * @create :2020-11-11 20:02
 */

public class StructsAction extends ActionSupport {
    private String name;

    public String getName() {
        return name;
    }
    public int age;

    public void setName(String name) {
        this.name = name;
    }
    public String excute() throws Exception{
        if(!name.equals("helloWord")){
            Map request=(Map) ActionContext.getContext().get("request");
            request.put("name",getName());
            return  "success";
        }else{
            return "error";
        }
    }
}
