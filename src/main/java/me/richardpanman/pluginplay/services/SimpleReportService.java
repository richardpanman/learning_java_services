package me.richardpanman.pluginplay.services;

/** ReportServiceB which doesn't use an external service. */
public class SimpleReportService implements ReportService {
    @Override
    public String getString() {
        return "SimpleReportService";
    }
}
