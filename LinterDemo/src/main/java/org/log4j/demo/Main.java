package org.log4j.demo;
import org.apache.log4j.Logger;


public class Main {

    private static Logger log=Logger.getLogger(Main.class); //logger

    public static void main(String[] args) {
        log.trace("new trace level log");
        log.debug("debug log");
        log.info("info log");
        log.warn(("this is a warning. You be ugly as sin"));
        log.error("fake error");
        log.fatal("this is not fatal- bt it could be");


//            Service s=new Service();
//            s.service1("test service");
    }



}
