package com.kodgemisi.summer;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created at 22.04.2018
 *
 * @author sedat
 */
@Configuration
@EnableConfigurationProperties(BetterErrorPagesConfigurationProperties.class)
public class PropertiesConfiguration {

    private BetterErrorPagesConfigurationProperties properties;

    public PropertiesConfiguration(BetterErrorPagesConfigurationProperties properties) {
        this.properties = properties;
    }
}
