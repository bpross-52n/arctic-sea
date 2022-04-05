/*
 * Copyright 2015-2022 52°North Spatial Information Research GmbH
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
package org.n52.svalbard;

import java.util.Set;

/**
 * @author <a href="mailto:c.hollmann@52north.org">Carsten Hollmann</a>
 * @since 1.0.0
 */
public interface ProcedureCoder {
    /**
     * Get the supported procedure description formats for this
     * {@linkplain ProcedureCoder} and the specified service and version.
     *
     * @param service
     *            the service
     * @param version
     *            the version
     *
     * @return the procedure description formats
     */
    Set<String> getSupportedProcedureDescriptionFormats(String service, String version);
}
