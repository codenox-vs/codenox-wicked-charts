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
package de.adesso.wickedcharts.highcharts.jackson;

import java.awt.Color;
import java.util.Locale;

public abstract class ColorReferenceSerializer<T> extends NullableSerializer<T> {

	private static final String BRIGHTEN_COLOR = "Highcharts.Color(%s).brighten(%.2f).get()";

	protected String brighten(final String colorString, final float brightness) {
		String brightenedString = String.format(Locale.ENGLISH, BRIGHTEN_COLOR, colorString, brightness);
		return brightenedString;
	}

	protected String toHexString(final Color color) {
		return Integer.toHexString(color.getRGB()).replaceFirst("ff", "#");
	}

}
