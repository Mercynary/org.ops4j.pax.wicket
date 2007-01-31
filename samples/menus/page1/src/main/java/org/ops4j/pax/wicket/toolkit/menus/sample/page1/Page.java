/*
 * Copyright 2006 Niclas Hedhman.
 *
 * Licensed  under the  Apache License,  Version 2.0  (the "License");
 * you may not use  this file  except in  compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed  under the  License is distributed on an "AS IS" BASIS,
 * WITHOUT  WARRANTIES OR CONDITIONS  OF ANY KIND, either  express  or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.wicket.toolkit.menus.sample.page1;

import java.util.ArrayList;
import java.util.List;
import org.ops4j.pax.wicket.util.RootContentAggregator;
import wicket.Component;
import wicket.markup.html.WebPage;
import wicket.markup.html.list.ListItem;
import wicket.markup.html.list.ListView;

public class Page extends WebPage
{

    public Page( RootContentAggregator container )
    {
        List<Component> components = new ArrayList<Component>();
        ListView view = new ListView( "menu", components )
        {
            protected void populateItem( ListItem listItem )
            {
                Component comp = (Component) listItem.getModelObject();
                listItem.add( comp );
            }
        };
        components.addAll( container.createComponents( "menuitem", view ) );
        add( view );
    }
}