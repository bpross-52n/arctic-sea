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
package org.n52.svalbard.read;

import javax.xml.namespace.QName;

import org.n52.shetland.aqd.AqdConstants;
import org.n52.shetland.inspire.Spelling;

/**
 * TODO JavaDoc
 *
 * @author Christian Autermann
 */
public class SpellingReader extends SubtagReader<Spelling> {

    @Override
    protected QName getSubtagName() {
        return AqdConstants.QN_GN_SPELLING_OF_NAME;
    }

    @Override
    protected XmlReader<Spelling> getSubtagDelegate() {
        return new SpellingOfNameReader();
    }

}
