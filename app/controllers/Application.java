package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result homePage() {
        return ok(index.render("Your new application is ready."));
    }

}
