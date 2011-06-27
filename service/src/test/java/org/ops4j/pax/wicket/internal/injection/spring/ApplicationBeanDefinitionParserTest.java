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
package org.ops4j.pax.wicket.internal.injection.spring;

import static org.hamcrest.Matchers.typeCompatibleWith;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.ops4j.pax.wicket.internal.injection.ApplicationDecorator;

public class ApplicationBeanDefinitionParserTest {

    @Test
    public void testRequestBeanType_shouldReturnDefaultContentSourceFactory() throws Exception {
        ApplicationBeanDefinitionParser parserToTest = new ApplicationBeanDefinitionParser();

        Class<?> beanClass = parserToTest.getBeanClass(null);

        assertThat(beanClass, typeCompatibleWith(ApplicationDecorator.class));
    }

    @Test
    public void testParse() throws Exception {
        SpringParserTestUtil parserTestUtil =
            new SpringParserTestUtil("wicket:application", new ApplicationBeanDefinitionParser());

        parserTestUtil.verifyPropertyValue("homepageClass");
        parserTestUtil.verifyPropertyValue("mountPoint");
        parserTestUtil.verifyPropertyValue("applicationName");
        parserTestUtil.verifyPropertyReference("applicationFactory");
        parserTestUtil.verifyMapValue("contextParams", "name2", "value2");
    }
}
