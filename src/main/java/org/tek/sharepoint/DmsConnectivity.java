package org.tek.sharepoint;

import lombok.extern.slf4j.Slf4j;
import org.tek.sharepoint.dms.DmsPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.tek.sharepoint.dms.SharepointContextAdapter;

@Slf4j
@SpringBootApplication
public class DmsConnectivity implements CommandLineRunner {

    @Autowired
    private DmsPort dmsPort;
    @Autowired
    private SharepointContextAdapter sharepointContextAdapter;

    public static void main(String[] args) {
        log.info("-----Executing DMS Connectivity Batch Job-----");
        new SpringApplicationBuilder(DmsConnectivity.class)
                .web(WebApplicationType.NONE)    // <— no servlet web context
                .run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        byte[] dummy = "Hello World - Sharepoint Uploader [NTLM]".getBytes();
        dmsPort.sendFile("test.txt", dummy, "BATCH");
        System.out.println("sendFile() completed");
        System.exit(0);
    }
}