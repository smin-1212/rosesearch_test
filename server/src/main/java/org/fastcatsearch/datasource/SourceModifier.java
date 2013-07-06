/*
 * Copyright 2013 Websquared, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fastcatsearch.datasource;

import java.util.Map;

import org.fastcatsearch.ir.common.IRException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class SourceModifier {
	
	protected static Logger logger = LoggerFactory.getLogger(SourceModifier.class);
			
	public abstract String modify(String fieldName, Map<String, Object> keyValueMap) throws IRException;
	
	public abstract void init(Object obj);
}