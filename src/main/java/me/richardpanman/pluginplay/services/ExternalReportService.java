package me.richardpanman.pluginplay.services;

import me.richardpanman.pluginplay.ExternalSystemInterface;

/** ReportServiceA which uses the ExternalSystemInterface. */
public class ExternalReportService extends ExternalSystemInterface implements ReportService {
    public ExternalReportService() {
        this.setTestString("Report Service with External Interface");
    }

    @Override
    public String getString() {
        return this.getTestString();
    }
}
