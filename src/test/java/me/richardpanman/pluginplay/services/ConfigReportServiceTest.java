package me.richardpanman.pluginplay.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConfigReportServiceTest {
    ConfigReportService configReport;

    @BeforeEach
    void setup() {
        configReport = new ConfigReportService();
    }

    @Test
    void testGetString() {
        assertEquals("ConfigReportService", configReport.getString());
    }

    @Test
    void testMissingPropertiesFile() {
        configReport.setPropertiesFile("unknown.properties.file");
        assertNull(configReport.getString());
    }
}
