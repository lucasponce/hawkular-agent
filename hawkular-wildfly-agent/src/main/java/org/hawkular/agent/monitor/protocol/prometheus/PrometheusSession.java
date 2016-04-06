/*
 * Copyright 2015-2016 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hawkular.agent.monitor.protocol.prometheus;

import java.io.IOException;

import org.hawkular.agent.monitor.inventory.MonitoredEndpoint;
import org.hawkular.agent.monitor.inventory.ResourceTypeManager;
import org.hawkular.agent.monitor.protocol.Driver;
import org.hawkular.agent.monitor.protocol.LocationResolver;
import org.hawkular.agent.monitor.protocol.Session;

/**
 * @see Session
 */
public class PrometheusSession
        extends Session<PrometheusNodeLocation> {

    private final PrometheusClient client;

    public PrometheusSession(String feedId,
            MonitoredEndpoint endpoint,
            ResourceTypeManager<PrometheusNodeLocation> resourceTypeManager,
            Driver<PrometheusNodeLocation> driver,
            LocationResolver<PrometheusNodeLocation> locationResolver,
            PrometheusClientFactory clientFactory) {
        super(feedId, endpoint, resourceTypeManager, driver, locationResolver);
        // TODO use clientFactory - or pass in client
        client = null;
    }

    @Override
    public void close() throws IOException {
        // TODO close client
    }

    /**
     * Returns a native client.
     *
     * @return a native client
     */
    public PrometheusClient getClient() {
        return client;
    }
}
