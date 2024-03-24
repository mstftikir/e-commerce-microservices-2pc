package com.taltech.ecommerce.orderservice.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.manager.EnumBasedFeatureProvider;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.jdbc.JDBCStateRepository;
import org.togglz.core.spi.FeatureProvider;
import org.togglz.core.user.SimpleFeatureUser;
import org.togglz.core.user.UserProvider;

import com.taltech.ecommerce.orderservice.featureflag.FeatureFlag;

@Configuration
public class TogglzConfiguration {

    @Bean
    public StateRepository stateRepository(DataSource dataSource) {
        return JDBCStateRepository.newBuilder(dataSource)
            .tableName("feature_flags")
            .build();
    }

    @Bean
    public FeatureProvider featureProvider() {
        return new EnumBasedFeatureProvider(FeatureFlag.class);
    }

    @Bean
    public UserProvider getUserProvider() {
        return () -> new SimpleFeatureUser("togglz");
    }
}
