package com.geordin;
import org.apache.log4j.Logger;

public class Main {
    private static Logger log=Logger.getLogger(Main.class);
    public static void main(String[] args) {
        //log hello message
        log.info("Loading...");
        //call menu

        

    }
}


/*
Bank App
customer can
    apply for an account
    view balance
    make withdrawals and deposits
EMPloyee can
    approve or deny accounts
    view balances...
        - sort/filter by
            + customer
            + account
            + day (stretch goal
~~~~~
MAIN
    menu
        - sign in as employee or customer
        - exit application
        subMenu
            + sign in as employee
                - see open applications
                - view customer (activity/balance plus applications)
                    -activity
                    -balance
                - view account (activity plus balance
                    -activity
                    -balance
            +sign in as customer
                - select account belonging to that customer
                - apply for new account
            + logout to main menu

    ~~~
Main calls menu, which can be a method in main or a separate class... probably doesnt need to be a separate class...
Menu handles most logic, keep it in main
Menu calls employee signin or customer signin methods
    these methods take in a person object?
...
//need to figure out logging first
// then write a basic menu...



uses a scanner to determine if


friday, 46 min in, 2:30 video
 */