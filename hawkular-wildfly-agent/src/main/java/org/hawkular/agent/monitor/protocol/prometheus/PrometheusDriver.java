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

import java.util.Map;

import org.hawkular.agent.monitor.diagnostics.ProtocolDiagnostics;
import org.hawkular.agent.monitor.inventory.AttributeLocation;
import org.hawkular.agent.monitor.protocol.Driver;
import org.hawkular.agent.monitor.protocol.ProtocolException;

/**
 * @see Driver
 */
public class PrometheusDriver implements Driver<PrometheusNodeLocation> {

    private final PrometheusClient client;
    private final ProtocolDiagnostics diagnostics;

    /**
     * Creates the Prometheus driver.
     *
     * @param client the client used to connect to the Prometheus Server
     * @param diagnostics
     */
    public PrometheusDriver(PrometheusClient client, ProtocolDiagnostics diagnostics) {
        super();
        this.client = client;
        this.diagnostics = diagnostics;
    }

    @Override
    public Map<PrometheusNodeLocation, PrometheusClient> fetchNodes(PrometheusNodeLocation query)
            throws ProtocolException {
        try {
            // TODO
            return null;
        } catch (Exception e) {
            throw new ProtocolException(e);
        }
    }

    @Override
    public boolean attributeExists(AttributeLocation<PrometheusNodeLocation> location)
            throws ProtocolException {
        // TODO
        return true;
    }

    @Override
    public Object fetchAttribute(AttributeLocation<PrometheusNodeLocation> location) throws ProtocolException {
        try {

            String[] attribute = location.getAttribute().split("#"); // [0]=reference, [1]=sub-reference

            // TODO
            return null;

        } catch (Exception e) {
            diagnostics.getErrorRate().mark(1);
            throw new ProtocolException(e);
        }
    }

    @Override
    public Map<PrometheusNodeLocation, Object> fetchAttributeAsMap(AttributeLocation<PrometheusNodeLocation> location)
            throws ProtocolException {
        // TODO
        return null;
    }

    public PrometheusClient getClient() {
        return client;
    }

}
