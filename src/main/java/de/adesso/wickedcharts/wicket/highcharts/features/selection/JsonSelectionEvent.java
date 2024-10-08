/**
 *   Copyright 2012-2019 Wicked Charts (http://github.com/adessoAG/wicked-charts)
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package de.adesso.wickedcharts.wicket.highcharts.features.selection;

import java.util.ArrayList;
import java.util.List;

/**
 * Helper class that is used as a container for deserialized JSON.
 *
 * @author Tom Hombergs (tom.hombergs@gmail.com)
 */
public class JsonSelectionEvent {

    private final List<JsonSelection> xAxes = new ArrayList<JsonSelection>();

    private final List<JsonSelection> yAxes = new ArrayList<JsonSelection>();

    public List<JsonSelection> getxAxes() {
        return this.xAxes;
    }

    public List<JsonSelection> getyAxes() {
        return this.yAxes;
    }
}
