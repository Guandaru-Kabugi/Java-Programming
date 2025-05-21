package SpringDemo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    //setting  loader auto wiring
    @Autowired
    private SettingLoaderService settingLoaderService;
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);

    }

    //method called after configuration is complete
    @PostConstruct
    public void initialize(){
        System.out.println("The application has configured and initialized.");
        System.out.println("Loaded Settings. " + settingLoaderService.getSettings());

    }
}
