package me.richardpanman.pluginplay.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SimpleReportServiceTest {
    @Test
    void testGetString() {
        SimpleReportService simpleReport = new SimpleReportService();
        assertEquals("SimpleReportService", simpleReport.getString());
    }
}
