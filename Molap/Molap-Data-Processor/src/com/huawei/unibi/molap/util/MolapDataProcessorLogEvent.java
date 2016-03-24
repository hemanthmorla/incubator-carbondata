/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.huawei.unibi.molap.util;

import com.huawei.iweb.platform.logging.LogEvent;

public enum MolapDataProcessorLogEvent implements LogEvent {
    /**
     * MOLAPENGINE_MSG
     */
    UNIBI_MOLAPDATAPROCESSOR_MSG("molap.dataprocessor");

    private String eventCode;

    private MolapDataProcessorLogEvent(final String eventCode) {
        this.eventCode = eventCode;
    }

    /**
     * @see com.huawei.iweb.platform.logging.LogEvent#getEventCode()
     */

    public String getEventCode() {
        return eventCode;
    }

    /**
     * @see com.huawei.iweb.platform.logging.LogEvent#getModuleName()
     */

    public String getModuleName() {
        return "MOLAP_DATAPROCESSOR";
    }

}