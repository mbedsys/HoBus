/*
 *   Copyright 2014 Emeric Verschuur <emericv@mbedsys.org>
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *		   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package org.sit4b.util;

/**
 * Formatter, a lite version of java SE Formatter
 * 
 * @author <a href="mailto:emericv@mbedsys.org">Emeric Verschuur</a>
 */
public interface HbFormatter {

	/**
	 * Format string like JavaSE Formatter.format(...)
	 * 
	 * @param fmt string format
	 * @param args arguments
	 */
	public abstract void format(String fmt, Object... args);

}