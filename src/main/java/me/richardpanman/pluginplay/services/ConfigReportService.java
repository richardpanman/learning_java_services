package me.richardpanman.pluginplay.services;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

/** ReportServiceB which doesn't use an external service. */
public class ConfigReportService implements ReportService {
    @Override
    public String getString() {
        Yaml yaml = new Yaml();
        InputStream inputStream;
        Map<String, Object> config;
        try {
            inputStream = new FileInputStream(new File("config.yaml"));
            config = yaml.load(inputStream);
            return (String) config.get("reportString");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return "";
    }
}
