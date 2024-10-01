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

package org.apache.commons.text.translate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Tests {@link UnicodeEscaper}.
 */
public class UnicodeEscaperTest {

    @Test
    public void testAbove() {
        final UnicodeEscaper escaper = UnicodeEscaper.above('F');
        final String input = "ADFGZ";
        final String result = escaper.translate(input);
        assertEquals("ADF\\u0047\\u005A", result, "Failed to escape Unicode characters via the above method");
    }

    @Test
    public void testBelow() {
        final UnicodeEscaper escaper = UnicodeEscaper.below('F');
        final String input = "ADFGZ";
        final String result = escaper.translate(input);
        assertEquals("\\u0041\\u0044FGZ", result, "Failed to escape Unicode characters via the below method");
    }

    @Test
    public void testBetween() {
        final UnicodeEscaper escaper = UnicodeEscaper.between('F', 'L');
        final String input = "ADFGZ";
        final String result = escaper.translate(input);
        assertEquals("AD\\u0046\\u0047Z", result, "Failed to escape Unicode characters via the between method");
    }
}
