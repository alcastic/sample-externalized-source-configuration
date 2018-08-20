package cl.acc.cloud.ssccs.samplespringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableConfigServer
@Configuration

public class SampleSpringCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleSpringCloudConfigServerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
