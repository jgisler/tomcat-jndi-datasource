package org.gislers.tomcat.jndi;

import org.gislers.tomcat.jndi.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Server {

    private static final Logger logger = LoggerFactory.getLogger(Server.class);

    public static void main( String[] args ) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Server server = (Server) ctx.getBean("server");
        server.run();
    }


    public void run() {
        logger.info( "Running..." );
    }
}
