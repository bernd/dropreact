package com.github.bernd.dropreact;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropReactApplication extends Application<DropReactConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropReactApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropReact";
    }

    @Override
    public void initialize(final Bootstrap<DropReactConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropReactConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
