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
package org.apache.commons.text;

import static java.util.FormattableFlags.LEFT_JUSTIFY;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import java.util.Formattable;
import java.util.Formatter;

import org.junit.jupiter.api.Test;

/**
 * Unit tests {@link FormattableUtils}.
 */
public class FormattableUtilsTest {

    static class SimplestFormattable implements Formattable {
        private final String text;

        SimplestFormattable(final String text) {
            this.text = text;
        }

        @Override
        public void formatTo(final Formatter formatter, final int flags, final int width, final int precision) {
            formatter.format(text);
        }
    }

    private Formatter createFormatter() {
        return new Formatter();
    }

    @Test
    public void testAlternatePadCharacter() {
        final char pad = '_';
        assertEquals("foo", FormattableUtils.append("foo", createFormatter(), 0, -1, -1, pad).toString());
        assertEquals("fo", FormattableUtils.append("foo", createFormatter(), 0, -1, 2, pad).toString());
        assertEquals("_foo", FormattableUtils.append("foo", createFormatter(), 0, 4, -1, pad).toString());
        assertEquals("___foo", FormattableUtils.append("foo", createFormatter(), 0, 6, -1, pad).toString());
        assertEquals("_fo", FormattableUtils.append("foo", createFormatter(), 0, 3, 2, pad).toString());
        assertEquals("___fo", FormattableUtils.append("foo", createFormatter(), 0, 5, 2, pad).toString());
        assertEquals("foo_", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 4, -1, pad).toString());
        assertEquals("foo___", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 6, -1, pad).toString());
        assertEquals("fo_", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 3, 2, pad).toString());
        assertEquals("fo___", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 5, 2, pad).toString());
    }

    @Test
    public void testAlternatePadCharAndEllipsis() {
        assertEquals("foo", FormattableUtils.append("foo", createFormatter(), 0, -1, -1, '_', "*").toString());
        assertEquals("f*", FormattableUtils.append("foo", createFormatter(), 0, -1, 2, '_', "*").toString());
        assertEquals("_foo", FormattableUtils.append("foo", createFormatter(), 0, 4, -1, '_', "*").toString());
        assertEquals("___foo", FormattableUtils.append("foo", createFormatter(), 0, 6, -1, '_', "*").toString());
        assertEquals("_f*", FormattableUtils.append("foo", createFormatter(), 0, 3, 2, '_', "*").toString());
        assertEquals("___f*", FormattableUtils.append("foo", createFormatter(), 0, 5, 2, '_', "*").toString());
        assertEquals("foo_", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 4, -1, '_', "*").toString());
        assertEquals("foo___", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 6, -1, '_', "*").toString());
        assertEquals("f*_", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 3, 2, '_', "*").toString());
        assertEquals("f*___", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 5, 2, '_', "*").toString());

        assertEquals("foo", FormattableUtils.append("foo", createFormatter(), 0, -1, -1, '_', "+*").toString());
        assertEquals("+*", FormattableUtils.append("foo", createFormatter(), 0, -1, 2, '_', "+*").toString());
        assertEquals("_foo", FormattableUtils.append("foo", createFormatter(), 0, 4, -1, '_', "+*").toString());
        assertEquals("___foo", FormattableUtils.append("foo", createFormatter(), 0, 6, -1, '_', "+*").toString());
        assertEquals("_+*", FormattableUtils.append("foo", createFormatter(), 0, 3, 2, '_', "+*").toString());
        assertEquals("___+*", FormattableUtils.append("foo", createFormatter(), 0, 5, 2, '_', "+*").toString());
        assertEquals("foo_", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 4, -1, '_', "+*").toString());
        assertEquals("foo___", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 6, -1, '_', "+*").toString());
        assertEquals("+*_", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 3, 2, '_', "+*").toString());
        assertEquals("+*___", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 5, 2, '_', "+*").toString());
    }

    @Test
    public void testAppendWithNullFormatterAndIntsThrowsNullPointerException() {
        assertThrowsExactly(NullPointerException.class, () -> FormattableUtils.append("", null, 0, 0, 0, '}'));
    }

    @Test
    public void testDefaultAppend() {
        assertEquals("foo", FormattableUtils.append("foo", createFormatter(), 0, -1, -1).toString());
        assertEquals("fo", FormattableUtils.append("foo", createFormatter(), 0, -1, 2).toString());
        assertEquals(" foo", FormattableUtils.append("foo", createFormatter(), 0, 4, -1).toString());
        assertEquals("   foo", FormattableUtils.append("foo", createFormatter(), 0, 6, -1).toString());
        assertEquals(" fo", FormattableUtils.append("foo", createFormatter(), 0, 3, 2).toString());
        assertEquals("   fo", FormattableUtils.append("foo", createFormatter(), 0, 5, 2).toString());
        assertEquals("foo ", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 4, -1).toString());
        assertEquals("foo   ", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 6, -1).toString());
        assertEquals("fo ", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 3, 2).toString());
        assertEquals("fo   ", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 5, 2).toString());
    }

    @Test
    public void testEllipsis() {
        assertEquals("foo", FormattableUtils.append("foo", createFormatter(), 0, -1, -1, "*").toString());
        assertEquals("f*", FormattableUtils.append("foo", createFormatter(), 0, -1, 2, "*").toString());
        assertEquals(" foo", FormattableUtils.append("foo", createFormatter(), 0, 4, -1, "*").toString());
        assertEquals("   foo", FormattableUtils.append("foo", createFormatter(), 0, 6, -1, "*").toString());
        assertEquals(" f*", FormattableUtils.append("foo", createFormatter(), 0, 3, 2, "*").toString());
        assertEquals("   f*", FormattableUtils.append("foo", createFormatter(), 0, 5, 2, "*").toString());
        assertEquals("foo ", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 4, -1, "*").toString());
        assertEquals("foo   ", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 6, -1, "*").toString());
        assertEquals("f* ", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 3, 2, "*").toString());
        assertEquals("f*   ", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 5, 2, "*").toString());

        assertEquals("foo", FormattableUtils.append("foo", createFormatter(), 0, -1, -1, "+*").toString());
        assertEquals("+*", FormattableUtils.append("foo", createFormatter(), 0, -1, 2, "+*").toString());
        assertEquals(" foo", FormattableUtils.append("foo", createFormatter(), 0, 4, -1, "+*").toString());
        assertEquals("   foo", FormattableUtils.append("foo", createFormatter(), 0, 6, -1, "+*").toString());
        assertEquals(" +*", FormattableUtils.append("foo", createFormatter(), 0, 3, 2, "+*").toString());
        assertEquals("   +*", FormattableUtils.append("foo", createFormatter(), 0, 5, 2, "+*").toString());
        assertEquals("foo ", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 4, -1, "+*").toString());
        assertEquals("foo   ", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 6, -1, "+*").toString());
        assertEquals("+* ", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 3, 2, "+*").toString());
        assertEquals("+*   ", FormattableUtils.append("foo", createFormatter(), LEFT_JUSTIFY, 5, 2, "+*").toString());
    }

    @Test
    public void testIllegalEllipsis() {
        assertThrowsExactly(IllegalArgumentException.class, () -> FormattableUtils.append("foo", createFormatter(), 0, -1, 1, "xx"));
    }

    @Test
    public void testIllegalEllipsisWith7Args() {
        final String ellipsis = "xxxx";
        final int precisionLessThanEllipsisLength = ellipsis.length() - 1;
        assertThrowsExactly(IllegalArgumentException.class,
                () -> FormattableUtils.append("foo", createFormatter(), 0, 0, precisionLessThanEllipsisLength, '}', ellipsis));
    }

    @Test
    public void testPublicConstructorExists() {
        new FormattableUtils();
    }

    @Test
    public void testSimplestFormat() {
        final Formattable formattable = new SimplestFormattable("foo");
        assertEquals("foo", FormattableUtils.toString(formattable));
    }

}
