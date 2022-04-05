/*
 * Copyright 2015-${currentYear} 52°North Spatial Information Research GmbH
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
package org.n52.svalbard.encode.json;

import org.n52.shetland.ogc.sos.Sos2Constants;
import org.n52.shetland.ogc.sos.response.UpdateSensorResponse;
import org.n52.svalbard.coding.json.JSONConstants;

import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * TODO JavaDoc
 *
 * @author <a href="mailto:c.autermann@52north.org">Christian Autermann</a>
 *
 * @since 1.0.0
 */
public class UpdateSensorResponseEncoder extends AbstractSosResponseEncoder<UpdateSensorResponse> {

    public UpdateSensorResponseEncoder() {
        super(UpdateSensorResponse.class, Sos2Constants.Operations.UpdateSensorDescription);
    }

    @Override
    protected void encodeResponse(ObjectNode json, UpdateSensorResponse t) {
        json.put(JSONConstants.UPDATED_PROCEDURE, t.getUpdatedProcedure());
    }

}
