package lt.javau5.weatherApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ApiController {

    @GetMapping("/home")
    public String getHome(Model model) {
        List<Integer> xData = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> yData = Arrays.asList(10, 20, 15, 30, 25);

        model.addAttribute("xData", xData);
        model.addAttribute("yData", yData);

        return "home";
    }
}
