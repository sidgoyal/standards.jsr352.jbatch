/*
 * Copyright 2012 International Business Machines Corp.
 * 
 * See the NOTICE file distributed with this work for additional information
 * regarding copyright ownership. Licensed under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package com.ibm.batch.container.context.impl;

import javax.batch.runtime.Metric;

public class MetricImpl implements Metric {
	
	private MetricName name;
	
	private long value;
	
	public MetricImpl(MetricName name, long value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public MetricName getName() {
		return name;
	}

	@Override
	public long getValue() {
		return this.value;
	}
	
	public void incValue() {
		++this.value;
	}
	
	public void incValueBy(long incValue) {
		this.value = this.value + incValue;
	}
	
	public void decValue() {
		this.value = --this.value;
	}

}
