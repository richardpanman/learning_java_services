package me.richardpanman.pluginplay.services;

import lombok.Setter;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;

import java.io.File;

/** ReportServiceB which doesn't use an external service. */
public class ConfigReportService implements ReportService {

    @Setter private String propertiesFile = "user.properties";

    @Override
    public String getString() {
        Configurations configs = new Configurations();
        try {
            PropertiesConfiguration config = configs.properties(new File(propertiesFile));
            return config.getString("reportString");
        } catch (Exception e) {
            return null;
        }
    }
}
