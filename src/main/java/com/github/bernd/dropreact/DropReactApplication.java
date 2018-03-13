package com.github.bernd.dropreact;

import com.github.bernd.dropreact.resources.SystemInfo;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
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
        bootstrap.addBundle(new AssetsBundle("/web/assets/", "/", "index.html"));
    }

    @Override
    public void run(final DropReactConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new SystemInfo());
    }

}
