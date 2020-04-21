package guru.springframework.sfgjms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgJmsApplication {

    public static void main(String[] args) throws Exception {
// run this and use local Acvive MQ broker in docker
//docker run -it --rm -e ARTEMIS_USERNAME=myuser -e ARTEMIS_PASSWORD=otherpassword vromero/activemq-artemis

//        ActiveMQServer server = ActiveMQServers.newActiveMQServer(new ConfigurationImpl()
//                .setPersistenceEnabled(false)
//                .setJournalDirectory("target/data/journal")
//                .setSecurityEnabled(false)
//                .addAcceptorConfiguration("invm", "vm://0"));//configuration from their documentation for the embedded server
//
//        server.start();

        SpringApplication.run(SfgJmsApplication.class, args);
    }

}
