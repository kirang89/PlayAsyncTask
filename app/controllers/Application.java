package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import jobs.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    /**
     * Controller method to create job based on request.
     * @param Job name
     */
    public static void testJob(String name){
    	String message = null;
    	
    	if(name.equals("job1")){
    		new Job1("active").now();
    		message = "Job 1 has started";
    	} else if(name.equals("job2")){
    		new Job2("active").now();
    		message = "Job 2 has started";
    	} else if(name.equals("job3")){
    		new Job3("active").now();
    		message = "Job 3 has started";
    	} else if(name.equals("job4")){
    		new Job4("active").now();
    		message = "Job 4 has started";
    	} else 
    		message = "ERROR: Please enter a valid job name";
    	
    	renderText(message);
    }

}