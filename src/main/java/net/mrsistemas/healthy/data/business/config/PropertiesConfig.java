package net.mrsistemas.healthy.data.business.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:rest.properties")
public class PropertiesConfig implements EnvironmentAware {

    private static  Environment env;

    public PropertiesConfig() {
        super();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public String getProperty(String key){
        return env.getProperty(key);
    }


    @Override
    public void setEnvironment(Environment environment) {
        PropertiesConfig.env = environment;
    }
}
