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
package org.n52.faroe.settings;

import java.net.URI;

import org.n52.faroe.SettingType;
import org.n52.faroe.SettingValue;

/**
 * @since 1.0.0
 *
 */
public class UriSettingValueForTesting implements SettingValue<URI> {

    private static final long serialVersionUID = -3212846305178900109L;

    private String key;

    private URI value;

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public URI getValue() {
        return value;
    }

    @Override
    public void setValue(URI value) {
        this.value = value;
    }

    @Override
    public SettingType getType() {
        return SettingType.URI;
    }

}
