package me.richardpanman.pluginplay.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExternalReportServiceTest {
    @Test
    void testGetString() {
        ExternalReportService externalReport = new ExternalReportService();
        assertEquals(externalReport.getTestString(), "Report Service with External Interface");
        assertEquals("Report Service with External Interface", externalReport.getString());
    }
}
