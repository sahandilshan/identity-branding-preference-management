/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.branding.preference.resolver.cache;

import org.wso2.carbon.identity.core.cache.CacheEntry;

/**
 * Cache entry which is kept in the custom text resolved tenant cache.
 */
public class TextCustomizedOrgCacheEntry extends CacheEntry {

    private static final long serialVersionUID = 3112605038259278777L;

    private String customTextResolvedTenant;

    /**
     * @param customTextResolvedTenant Domain of the tenant that custom text is resolved from.
     */
    public TextCustomizedOrgCacheEntry(String customTextResolvedTenant) {

        this.customTextResolvedTenant = customTextResolvedTenant;
    }

    /**
     * @return Domain of the tenant that custom text is resolved from.
     */
    public String getCustomTextResolvedTenant() {

        return customTextResolvedTenant;
    }

    /**
     * @param customTextResolvedTenant Domain of the tenant that custom text is resolved from.
     */
    public void setCustomTextResolvedTenant(String customTextResolvedTenant) {

        this.customTextResolvedTenant = customTextResolvedTenant;
    }
}
