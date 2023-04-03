package biz.letsweb;

import io.micronaut.http.annotation.*;

@Controller("/mlMicronautTest2")
public class MlMicronautTest2Controller {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}