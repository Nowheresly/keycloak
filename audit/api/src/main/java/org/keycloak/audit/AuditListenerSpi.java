package org.keycloak.audit;

import org.keycloak.provider.Provider;
import org.keycloak.provider.ProviderFactory;
import org.keycloak.provider.Spi;

/**
 * @author <a href="mailto:sthorger@redhat.com">Stian Thorgersen</a>
 */
public class AuditListenerSpi implements Spi {

    @Override
    public String getName() {
        return "audit-listener";
    }

    @Override
    public Class<? extends Provider> getProviderClass() {
        return AuditListener.class;
    }

    @Override
    public Class<? extends ProviderFactory> getProviderFactoryClass() {
        return AuditListenerFactory.class;
    }

}
