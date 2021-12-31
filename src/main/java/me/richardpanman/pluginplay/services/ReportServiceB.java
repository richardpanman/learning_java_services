package me.richardpanman.pluginplay.services;

/**ReportServiceB which doesn't use an external service. */
public class ReportServiceB implements ReportService {
    @Override
    public String getString() {
        return "Report Service B";
    }
}
