package mikesmikes.catfacts.bootstrap;

import mikesmikes.catfacts.controllers.CatFactController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author MikesMikes
 */

@Component
public class Bootstrap implements CommandLineRunner {

    private final CatFactController catFactController;

    public Bootstrap(CatFactController catFactController) {
        this.catFactController = catFactController;
    }

    @Override
    public void run(String... args) throws Exception {
        this.catFactController.getFact();
    }
}
