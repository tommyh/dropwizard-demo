package com.yammer.dropwizarddemo.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import org.sikuli.script.*;

// TODO: use reflection for java classes (and methods)
//import java.lang.reflect.Constructor;


@Path("/cmd/screen/")
public class HelloWorldResource {

    @GET @Path("/click")
    public String click(@QueryParam("x") Integer x, @QueryParam("y") Integer y) throws FindFailed {
        Screen s = new Screen();
        Location loc = new Location(x,y);
        s.click(loc);
        return "success";
    }

    @GET @Path("/write")
    public String write(@QueryParam("str") String str) {
        Screen s = new Screen();
        s.write(str);
        return "success";
    }
}
