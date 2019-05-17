package is.yyx.controller;

import is.yyx.model.Response;
import is.yyx.model.Responses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping(value = "")
public class AppController {

    @GetMapping(value = "/")
    public void swagger(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping(value = "/heartbeat")
    public Response heartbeat() {
        return Responses.ok();
    }
}
