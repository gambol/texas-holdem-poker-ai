package edu.ntnu.texasai.dependencyinjection;

import com.google.inject.AbstractModule;
import edu.ntnu.texasai.controller.ControllerModule;
import edu.ntnu.texasai.utils.GameProperties;

import javax.inject.Singleton;

public class TexasModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new ControllerModule());

        bind(GameProperties.class).in(Singleton.class);
    }
}