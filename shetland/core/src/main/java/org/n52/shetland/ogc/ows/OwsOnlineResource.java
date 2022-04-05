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
package org.n52.shetland.ogc.ows;

import java.net.URI;

import org.n52.shetland.w3c.xlink.Actuate;
import org.n52.shetland.w3c.xlink.Link;
import org.n52.shetland.w3c.xlink.Show;

/**
 * TODO JavaDoc
 *
 * @author Christian Autermann
 */
public class OwsOnlineResource extends Link {
    public OwsOnlineResource(URI href) {
        super(href);
    }

    public OwsOnlineResource(URI href, String title) {
        super(href, title);
    }

    public OwsOnlineResource(URI href, URI role, URI arcrole, String title,
                             Show show, Actuate actuate) {
        super(href, role, arcrole, title, show, actuate);
    }

}
