package littleware.apps.fishRunner;

import java.io.File;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.glassfish.embeddable.Deployer;
import org.glassfish.embeddable.GlassFish;
import org.glassfish.embeddable.GlassFishProperties;
import org.glassfish.embeddable.GlassFishRuntime;

public class FishApp implements Callable {

    private static final Logger log = Logger.getLogger(FishApp.class.getName());

    @Override
    public Object call() throws Exception {
        System.out.println("********************** FishApp.call invoked ************************");
        log.log(Level.INFO,"========================= FishApp.call invoked =======================");
        return null;
    }
    /*
    String port = System.getenv("PORT");
    GlassFishProperties gfProps = new GlassFishProperties();
    gfProps.setPort("http-listener", Integer.parseInt(port));
    GlassFish glassfish = GlassFishRuntime.bootstrap().newGlassFish(gfProps);
    glassfish.start();
    Deployer deployer = glassfish.getDeployer();
    File file = new File("CalculatorWSAppMavenWebApp-1.0-SNAPSHOT");
    deployer.deploy(file);
     */
}
