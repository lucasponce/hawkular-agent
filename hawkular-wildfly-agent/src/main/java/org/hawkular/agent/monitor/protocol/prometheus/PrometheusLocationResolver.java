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

import org.hawkular.agent.monitor.protocol.LocationResolver;
import org.hawkular.agent.monitor.protocol.ProtocolException;

/**
 * @see LocationResolver
 */
public class PrometheusLocationResolver implements LocationResolver<PrometheusNodeLocation> {

    @Override
    public String findWildcardMatch(PrometheusNodeLocation multiTargetLocation, PrometheusNodeLocation singleLocation)
            throws ProtocolException {

        if (multiTargetLocation == null) {
            throw new ProtocolException("multiTargetLocation is null");
        }

        // TODO

        // nothing matched - single location must not have resulted from a query using the given multi-target location
        throw new ProtocolException(String.format("[%s] doesn't match the wildcard from [%s]", singleLocation,
                multiTargetLocation));
    }

    @Override
    public boolean isMultiTarget(PrometheusNodeLocation location) {
        // TODO
        return false;
    }

    @Override
    public PrometheusNodeLocation absolutize(PrometheusNodeLocation base, PrometheusNodeLocation location) {
        // TODO
        if (location == null) {
            return base;
        }
        return location;
    }

    @Override
    public boolean isParent(PrometheusNodeLocation parent, PrometheusNodeLocation child) {

        if (parent == null) {
            throw new IllegalArgumentException(
                    "Cannot compute [" + getClass().getName() + "].isParent() with a null parent argument");
        }

        if (child == null) {
            throw new IllegalArgumentException(
                    "Cannot compute [" + getClass().getName() + "].isParent() with a null child argument");
        }

        // TODO

        return false;
     }

    @Override
    public boolean matches(PrometheusNodeLocation query, PrometheusNodeLocation location) {
        // TODO
        return false;
    }

    @Override
    public String applyTemplate(String nameTemplate, PrometheusNodeLocation location, String endpointName) {
        // TODO
        return nameTemplate;
    }

}
