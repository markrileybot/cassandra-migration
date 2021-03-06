/**
 * File     : ClassPathResourceSmallTest.java
 * License  :
 *   Original   - Copyright (c) 2010 - 2016 Boxfuse GmbH
 *   Derivative - Copyright (c) 2016 - 2018 cassandra-migration Contributors
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package com.hhandoko.cassandra.migration.internal.util.scanner.classpath;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for ClassPathResource.
 */
public class ClassPathResourceSmallTest {
    @Test
    public void getFilename() throws Exception {
        assertEquals("Mig777__Test.cql", new ClassPathResource("Mig777__Test.cql", Thread.currentThread().getContextClassLoader()).getFilename());
        assertEquals("Mig777__Test.cql", new ClassPathResource("folder/Mig777__Test.cql", Thread.currentThread().getContextClassLoader()).getFilename());
    }

    @Test
    public void loadAsStringUtf8WithoutBOM() {
        assertEquals("SELECT * FROM contents;",
                new ClassPathResource("com/hhandoko/cassandra/migration/internal/util/scanner/classpath/utf8.nofilter", Thread.currentThread().getContextClassLoader()).loadAsString("UTF-8"));
    }

    @Test
    public void loadAsStringUtf8WithBOM() {
        assertEquals("SELECT * FROM contents;",
                new ClassPathResource("com/hhandoko/cassandra/migration/internal/util/scanner/classpath/utf8bom.nofilter", Thread.currentThread().getContextClassLoader()).loadAsString("UTF-8"));
    }
}
