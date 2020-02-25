package com.stx.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class linstener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext sct = se.getSession().getServletContext();
        System.out.println(se.getSession().getId());
        Integer integer =(Integer) sct.getAttribute("linstener");
        if (integer==null){
            integer = new Integer(1);
        }else {
            int count = integer.intValue();
            integer = new Integer(count+1);
        }
        sct.setAttribute("Linstener",integer);
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext sct = se.getSession().getServletContext();
        Integer integer =(Integer) sct.getAttribute("linstener");
        if (integer==null){
            integer = new Integer(0);
        }else {
            int count = integer.intValue();
            integer = new Integer(count-1);
        }
        sct.setAttribute("Linstener",integer);
   }
}
