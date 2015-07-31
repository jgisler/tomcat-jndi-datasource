package org.gislers.tomcat.jndi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="org.gislers.tomcat.jndi")
@PropertySource("classpath:META-INF/application.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyJmsProperties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    @Resource(name="jdbc/SportDS")
    public JndiDataSourceLookup jndiDataSourceLookup() {
        final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
        dsLookup.setResourceRef(true);
        return dsLookup;
    }

    @Bean
    public DataSource dataSource() {
        return jndiDataSourceLookup().getDataSource("java:comp/env/jdbc/SportDS");
    }

}
