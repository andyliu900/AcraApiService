package com.ideacode.arca.resource;

import com.alibaba.fastjson.JSON;
import com.ideacode.arca.domain.DeviceInfo;
import com.ideacode.arca.service.DeviceService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by randysu on 2018/12/18.
 */

@Path("DeviceApi")
public class DeviceResource {

    private static final Logger LOGGER = Logger.getLogger(DeviceResource.class);

    @Autowired
    DeviceService deviceService;

    @POST
    @Path("registDevice")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN })
    public void crashReport(String deviceInfoString) {
        LOGGER.info(deviceInfoString);

        DeviceInfo deviceInfo = JSON.parseObject(deviceInfoString, DeviceInfo.class);
        deviceService.registDevice(deviceInfo);
    }

}
