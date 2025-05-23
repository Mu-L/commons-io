/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;

/**
 * Abstracts some InputStream operations for implementations in this package.
 *
 * @since 2.17.0
 */
public abstract class AbstractInputStream extends InputStream {

    /**
     * Whether {@link #close()} completed successfully.
     */
    private boolean closed;

    /**
     * Constructs a new instance for subclasses.
     */
    public AbstractInputStream() {
        // empty
    }

    /**
     * Checks if this instance is closed and throws an IOException if so.
     *
     * @throws IOException if this instance is closed.
     */
    void checkOpen() throws IOException {
        Input.checkOpen(!isClosed());
    }

    @Override
    public void close() throws IOException {
        super.close();
        closed = true;
    }

    /**
     * Tests whether this instance is closed; if {@link #close()} completed successfully.
     *
     * @return whether this instance is closed.
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     * Sets whether this instance is closed.
     *
     * @param closed whether this instance is closed.
     */
    public void setClosed(final boolean closed) {
        this.closed = closed;
    }

}
