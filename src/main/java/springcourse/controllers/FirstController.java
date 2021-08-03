package springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/first")// при таком условие  HTTP-запрос  будет выглядеть следующим
//  образом /first/hello
public class FirstController {
    //этот mapping   по этому запросу выдаст соотвествующие представление
    @GetMapping("/hello")
    public  String  helloPage(HttpServletRequest request){
        // если же в  в URL-запросе не будет этих параметров то сервер возратит null
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        System.out.println("Hello,"+name + " "+ surname);
        return "first/hello"; }
   // или
    @GetMapping("/goodbye")
    public String goodByePAge(
            @RequestParam(value = "name",required = false)String name ,
            @RequestParam(value = "surname",required = false)String surname ){

        // если же в  в URL-запросе не будет этих параметров то сервер даст ошибку
        // избежать ошибки можно если указать в параметрах required = false
        return "first/goodbye";
    }

}