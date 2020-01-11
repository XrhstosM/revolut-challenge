package challenge;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class challengeApplication extends Application<challengeConfiguration> {

    public static void main(final String[] args) throws Exception {
        new challengeApplication().run(args);
    }

    @Override
    public String getName() {
        return "challenge";
    }

    @Override
    public void initialize(final Bootstrap<challengeConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final challengeConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
