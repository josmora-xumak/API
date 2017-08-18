/**
 * LayerX API Bundle
 * (layerx.api)
 *
 * Copyright (C) 2017 Tikal Technologies, Inc. All rights reserved.
 *
 * Licensed under GNU Affero General Public License, Version v3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.gnu.org/licenses/agpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied;
 * without even the implied warranty of MERCHANTABILITY.
 * See the License for more details.
 */

package layerx.api;

/**
 * User: joshuaoransky
 * Date: 11/8/13
 * Time: 1:45
 * Purpose:
 * Location:
 */
public interface ContentModel {

    public ContentModel set(String name, Object value);

    public String getAsString(String name);

    public Object get(String name);

    public <T> T getAs(String name, Class<T> type)
            throws Exception;

    public boolean has(String name);

    public <T> boolean is(String name, Class<T> type);

}