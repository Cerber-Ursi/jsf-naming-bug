package ru.cerbe.jsf.naming.bug;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import javax.faces.webapp.FacesServlet;

public class App {
    public static void main(String[] args) {
        try {
            Server server = new Server(9999);

            Connector connector = new ServerConnector(server);
            server.addConnector(connector);

            ServletContextHandler context = new ServletContextHandler();
            context.setContextPath("/test");
            context.addServlet(FacesServlet.class, "*.xhtml");
            server.setHandler(context);

            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
