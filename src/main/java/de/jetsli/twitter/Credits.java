/**
 * Copyright (C) 2010 Peter Karich <info@jetsli.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.jetsli.twitter;

import java.io.Serializable;

/**
 *
 * @author Peter Karich, info@jetsli.de
 */
public class Credits implements Serializable {

    private static final long serialVersionUID = 1L;
    private String token;
    private String tokenSecret;
    private String consumerKey;
    private String consumerSecret;

    public Credits() {
    }

    public Credits(String token, String tokenSecret, String consumerKey, String consumerSecret) {
        this.token = token.trim();
        this.tokenSecret = tokenSecret.trim();
        this.consumerKey = consumerKey.trim();
        this.consumerSecret = consumerSecret.trim();
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }

    public String getToken() {
        return token;
    }

    public String getTokenSecret() {
        return tokenSecret;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTokenSecret(String tokenSecret) {
        this.tokenSecret = tokenSecret;
    }
}
