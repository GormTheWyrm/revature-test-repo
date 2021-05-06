package org.example.main;

import io.javalin.Javalin;

public class JavelinDemo {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(8000);
        //1 path...
        app.get("/", ctx -> {
            ctx.result("Hello and welcome to Javelin!");
        });
        //
        app.get("/test", ctx -> {
            ctx.result("Hello and welcome to Javelin test!");
        });
        app.post("/", ctx -> {
            ctx.result("Post Javelin!");
        });
        app.put("/", ctx -> {
            ctx.result("Put Javelin!");
        });
        app.delete("/", ctx -> {
            ctx.result("Deleting Javelin!");
        });
        app.patch("/", ctx -> {
            ctx.result("Patch to Javelin!");
        });




        System.out.println("!");
    }


}
