package SpringDemo;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

@Service
public class SettingLoaderService {
    private Map<String,String> settings = new HashMap<>();

    //add postconstruct to run the load settings automatically

    @PostConstruct
    public void loadSettings(){
        settings.put("appName", "Spring Boot Demo");
        settings.put("version","1.0.0");
        settings.put("author","John Doe");
        System.out.println("Settings have been loaded.");
    }

    public Map<String, String> getSettings() {
        return settings;
    }
}
