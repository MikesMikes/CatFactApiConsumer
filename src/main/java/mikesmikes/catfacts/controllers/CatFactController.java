package mikesmikes.catfacts.controllers;

import mikesmikes.catfacts.Domain.CatFact;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @author MikesMikes
 */
@Controller
public class CatFactController {

    @RequestMapping("/fact")
    @ResponseBody
    public String getFact(){
        String uri = "https://catfact.ninja/fact";
        RestTemplate restTemplate = new RestTemplate();
        CatFact catFact = restTemplate.getForObject("https://catfact.ninja/fact", CatFact.class);
        System.out.println("fact:" + catFact.getFact());
        return catFact.getFact();
    }
}
