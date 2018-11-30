package com.ideacode.arca;

import com.ideacode.arca.resource.AcraResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Jersey配置
 *
 * Created by randysu on 2018/11/28.
 */

@Configuration
@ComponentScan({"com.ideacode.arca"})
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(AcraResource.class);
        register(CorsFilter.class);
    }

}
