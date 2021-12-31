package me.richardpanman.pluginplay;

import me.richardpanman.pluginplay.services.ReportService;

import java.util.Iterator;
import java.util.ServiceLoader;

/** The main class for this Application - run this. */
public final class App {
    private App() {}

    /** Print the string for all report instances. */
    public static void main(String[] args) {
        getReports();
    }

    /** Get the string for all reports. */
    public static void getReports() {
        ServiceLoader<ReportService> loader = ServiceLoader.load(ReportService.class);
        Iterator<ReportService> iter = loader.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().getString());
        }
    }
}
