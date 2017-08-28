/**
 * Danta API Bundle
 * (danta.api)
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

package danta.api.exceptions;

/**
 * Accepts Exception
 *
 * @author      joshuaoransky
 * @version     1.0.0
 * @since       2016-04-29
 */
public class AcceptsException
        extends Exception {

    public AcceptsException() {
    }

    public AcceptsException(String message) {
        super(message);
    }

    public AcceptsException(String message, Throwable cause) {
        super(message, cause);
    }

    public AcceptsException(Throwable cause) {
        super(cause);
    }

    public AcceptsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
