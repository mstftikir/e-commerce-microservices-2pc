package com.taltech.ecommerce.orderservice.featureflag;


import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum FeatureFlag implements Feature {

    @Label("Use Inventory V2 Api")
    USE_INVENTORY_V2_API,
    @Label("Use Chart V2 Api")
    USE_CHART_V2_API,
    @Label("Use Payment V2 Api")
    USE_PAYMENT_V2_API;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }
}
