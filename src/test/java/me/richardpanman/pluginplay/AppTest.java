package me.richardpanman.pluginplay;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/** Tests for the main App. */
class AppTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Test
    void testApp() {
        System.setOut(new PrintStream(out));
        App.getReports();
        assertEquals(
                "Report Service with External Interface"
                        + System.lineSeparator()
                        + "SimpleReportService"
                        + System.lineSeparator()
                        + "ConfigReportService"
                        + System.lineSeparator(),
                out.toString());
        System.setOut(originalOut);
    }
}
