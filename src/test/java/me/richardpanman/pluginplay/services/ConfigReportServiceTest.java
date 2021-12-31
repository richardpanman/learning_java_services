package me.richardpanman.pluginplay.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConfigReportServiceTest {
    @Test
    void testGetString() {
        ConfigReportService configReport = new ConfigReportService();
        assertEquals("ConfigReportService", configReport.getString());
    }
}
