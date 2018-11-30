package com.ideacode.arca.resource;

import com.alibaba.fastjson.JSON;
import com.ideacode.arca.domain.Crash;
import com.ideacode.arca.service.AcraService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * Created by randysu on 2018/11/28.
 */

@Path("CrashApiReport")
public class AcraResource {

    private static final Logger LOGGER = Logger.getLogger(AcraResource.class);

    @Autowired
    AcraService acraService;

    @GET
    @Path("hi")
    @Produces({ MediaType.APPLICATION_JSON })
    public List<String> hi() {
        List<String> result = new ArrayList<String>();
        result.add("hello spring boot");
        result.add("hello micro services");
        return result;
    }

    @POST
    @Path("uploadCrashReport")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN })
    public void crashReport(String crashInfo) {
        LOGGER.info(crashInfo);

        Crash crash = JSON.parseObject(crashInfo, Crash.class);
        acraService.uploadCrashReport(crash);

    }

}
