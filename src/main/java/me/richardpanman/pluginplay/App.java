package me.richardpanman.pluginplay;

import java.util.Iterator;
import java.util.ServiceLoader;
import me.richardpanman.pluginplay.services.ReportService;

/**
 * The main class for this Application - run this.
 */
public final class App {
    private App() {}

    /**
     * Print the string for all report instances.
     */
    public static void main(String[] args) {
        ServiceLoader<ReportService> loader = ServiceLoader.load(ReportService.class);
        Iterator<ReportService> iter = loader.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().getString());
        }
    }
}
