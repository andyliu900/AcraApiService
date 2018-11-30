package com.ideacode.arca;

import org.apache.log4j.Logger;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

/**
 * 拦截器
 *
 * Created by randysu on 2018/11/28.
 */

@Provider
@PreMatching
public class CorsFilter implements ContainerResponseFilter {

    private static final Logger LOGGER = Logger.getLogger(CorsFilter.class);

    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        containerResponseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
        containerResponseContext.getHeaders().add("Access-Control-Allow-Headers",
                "X-HTTP-Method-Override, Content-Type, x-requested-with");
        containerResponseContext.getHeaders().add("Access-Control-Allow-Methods", "GET");
        containerResponseContext.getHeaders().add("Access-Control-Allow-Methods", "POST");
        LOGGER.debug(containerResponseContext.getHeaders().get("Access-Control-Allow-Origin"));
    }
}
