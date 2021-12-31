package me.richardpanman.pluginplay.services;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;

import java.io.File;

/** ReportServiceB which doesn't use an external service. */
public class ConfigReportService implements ReportService {
    @Override
    public String getString() {
        Configurations configs = new Configurations();
        try {
            PropertiesConfiguration config = configs.properties(new File("user.properties"));
            return config.getString("reportString");
        } catch (Exception e) {
            return null;
        }
    }
}
