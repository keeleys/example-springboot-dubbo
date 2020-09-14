package cc.sitec.example;
import cc.sitec.example.config.ServiceConfig;
import org.springframework.boot.SpringApplication;


public class ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceConfig.class,args);
    }
}
