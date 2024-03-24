package com.taltech.ecommerce.orderservice.config;

import org.springframework.context.annotation.Configuration;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.mem.InMemoryStateRepository;
import org.togglz.core.user.SimpleFeatureUser;
import org.togglz.core.user.UserProvider;

import com.taltech.ecommerce.orderservice.featureflag.FeatureFlag;

@Configuration
public class TogglzConfiguration implements TogglzConfig {

    @Override
    public Class<? extends Feature> getFeatureClass() {
        return FeatureFlag.class;
    }

    @Override
    public StateRepository getStateRepository() {
        return new InMemoryStateRepository();
    }

    @Override
        public UserProvider getUserProvider() {
            return () -> new SimpleFeatureUser("admin", true);
        }
    }
