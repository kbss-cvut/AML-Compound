/******************************************************************************
* Copyright 2013-2014 LASIGE                                                  *
*                                                                             *
* Licensed under the Apache License, Version 2.0 (the "License"); you may     *
* not use this file except in compliance with the License. You may obtain a   *
* copy of the License at http://www.apache.org/licenses/LICENSE-2.0           *
*                                                                             *
* Unless required by applicable law or agreed to in writing, software         *
* distributed under the License is distributed on an "AS IS" BASIS,           *
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    *
* See the License for the specific language governing permissions and         *
* limitations under the License.                                              *
*                                                                             *
*******************************************************************************
* Lists the string similarity measures available for the StringMatcher.       *
*                                                                             *
* @author Daniel Faria                                                        *
* @date 11-09-2014                                                            *
* @version 2.1                                                                *
******************************************************************************/
package aml.settings;

public enum StringSimMeasure
{
	ISUB ("ISub"),
	EDIT ("Levenstein"),
	JW ("Jaro-Winkler"),
	QGRAM ("Q-gram");
	
	String label;
	
	StringSimMeasure(String s)
    {
    	label = s;
    }
	
	public static StringSimMeasure parseMeasure(String m)
	{
		for(StringSimMeasure s : StringSimMeasure.values())
			if(m.equalsIgnoreCase(s.toString()))
				return s;
		return null;
	}
	
    public String toString()
    {
    	return label;
	}
}