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

import org.hawkular.agent.monitor.inventory.NodeLocation;

/**
 * A Prometheus {@link NodeLocation}.
 */
public class PrometheusNodeLocation implements NodeLocation {

    private final Object nativeLocation;

    public PrometheusNodeLocation(Object object) {
        // TODO
        this.nativeLocation = object;
    }

    public PrometheusNodeLocation(String object) {
        // TODO
        this.nativeLocation = object;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        PrometheusNodeLocation other = (PrometheusNodeLocation) obj;

        // TODO
        if (!this.nativeLocation.equals(other.nativeLocation)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return (nativeLocation != null) ? nativeLocation.hashCode() : 0;
    }

    @Override
    public String toString() {
        return (nativeLocation != null) ? nativeLocation.toString() : "";
    }

}
