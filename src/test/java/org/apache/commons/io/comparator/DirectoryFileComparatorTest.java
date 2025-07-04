/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.io.comparator;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests {@link DirectoryFileComparator}.
 */
class DirectoryFileComparatorTest extends ComparatorAbstractTest {

    @BeforeEach
    public void setUp() {
        comparator = (AbstractFileComparator) DirectoryFileComparator.DIRECTORY_COMPARATOR;
        reverse = DirectoryFileComparator.DIRECTORY_REVERSE;
        final File currentDir = FileUtils.current();
        equalFile1 = new File(currentDir, "src");
        equalFile2 = new File(currentDir, "src/site/xdoc");
        lessFile   = new File(currentDir, "src");
        moreFile   = new File(currentDir, "pom.xml");
    }

    /**
     * Test the comparator array sort.
     */
    @Override
    @Test
    void testSortArray() {
        // skip sort test
    }

    /**
     * Test the comparator array sort.
     */
    @Override
    void testSortList() {
        // skip sort test
    }
}

