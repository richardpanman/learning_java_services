package me.richardpanman.pluginplay.services;

import me.richardpanman.pluginplay.ExternalSystemInterface;

/**ReportServiceA which uses the ExternalSystemInterface. */
public class ReportServiceA extends ExternalSystemInterface implements ReportService {
    public ReportServiceA() {
        this.setTestString("Report Service A from Interface");
    }

    @Override
    public String getString() {
        return this.getTestString();
    }
}
