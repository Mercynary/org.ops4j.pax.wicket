/**
 * Copyright OPS4J
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.wicket.spi.springdm.injection.spring;

import org.ops4j.pax.wicket.spi.springdm.injection.XmlFileTestUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class SpringTestUtil {

    public static Document loadSpringXml() throws Exception {
        return XmlFileTestUtil.loadXml("src/test/resources/spring.xml");
    }

    public static Element loadFirstElementThatMatches(String element) throws Exception {
        return XmlFileTestUtil.loadFirstElementThatMatches(element, "src/test/resources/spring.xml");
    }

}