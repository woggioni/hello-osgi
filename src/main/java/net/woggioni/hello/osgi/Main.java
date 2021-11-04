package net.woggioni.hello.osgi;

import net.woggioni.osgi.simple.bootstrapper.api.Application;
import org.osgi.service.component.annotations.Component;

@Component(service = {Application.class})
public class Main implements Application {
    @Override
    public int run(String[] strings) {
        System.out.println("Hello world");
        return 0;
    }
}
