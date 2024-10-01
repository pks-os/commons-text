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
package org.apache.commons.text.similarity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Tests {@link LongestCommonSubsequence}.
 */
public class LongestCommonSubsequenceTest {

    private static LongestCommonSubsequence subject;

    @BeforeAll
    public static void setup() {
        subject = new LongestCommonSubsequence();
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testGettingLogestCommonSubsequenceNullNull() {
        assertThrows(IllegalArgumentException.class, () -> subject.logestCommonSubsequence(null, null));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testGettingLogestCommonSubsequenceNullString() {
        assertThrows(IllegalArgumentException.class, () -> subject.logestCommonSubsequence(null, "right"));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testGettingLogestCommonSubsequenceStringNull() {
        assertThrows(IllegalArgumentException.class, () -> subject.logestCommonSubsequence(" ", null));
    }

    @Test
    public void testGettingLongestCommonSubsequenceApplyNullNull() {
        assertThrows(IllegalArgumentException.class, () -> subject.apply(null, null));
    }

    @Test
    public void testGettingLongestCommonSubsequenceApplyNullString() {
        assertThrows(IllegalArgumentException.class, () -> subject.apply(null, "right"));
    }

    @Test
    public void testGettingLongestCommonSubsequenceApplyStringNull() {
        assertThrows(IllegalArgumentException.class, () -> subject.apply(" ", null));
    }

    @Test
    public void testGettingLongestCommonSubsequenceNullNull() {
        assertThrows(IllegalArgumentException.class, () -> subject.longestCommonSubsequence(null, null));
    }

    @Test
    public void testGettingLongestCommonSubsequenceNullString() {
        assertThrows(IllegalArgumentException.class, () -> subject.longestCommonSubsequence(null, "right"));
    }

    @Test
    public void testGettingLongestCommonSubsequenceStringNull() {
        assertThrows(IllegalArgumentException.class, () -> subject.longestCommonSubsequence(" ", null));
    }

    @Test
    @Deprecated
    public void testLogestCommonSubsequence() {
        assertEquals("", subject.logestCommonSubsequence("", ""));
        assertEquals("", subject.logestCommonSubsequence("left", ""));
        assertEquals("", subject.logestCommonSubsequence("", "right"));
        assertEquals("fog", subject.logestCommonSubsequence("frog", "fog"));
        assertEquals("", subject.logestCommonSubsequence("fly", "ant"));
        assertEquals("h", subject.logestCommonSubsequence("elephant", "hippo"));
        assertEquals("ABC Corp", subject.logestCommonSubsequence("ABC Corporation", "ABC Corp"));
        assertEquals("D  H Enterprises Inc", subject.logestCommonSubsequence("D N H Enterprises Inc", "D & H Enterprises, Inc."));
        assertEquals("My Gym Childrens Fitness", subject.logestCommonSubsequence("My Gym Children's Fitness Center", "My Gym. Childrens Fitness"));
        assertEquals("PENNSYLVNIA", subject.logestCommonSubsequence("PENNSYLVANIA", "PENNCISYLVNIA"));
        assertEquals("t", subject.logestCommonSubsequence("left", "right"));
        assertEquals("tttt", subject.logestCommonSubsequence("leettteft", "ritttght"));
        assertEquals("the same string", subject.logestCommonSubsequence("the same string", "the same string"));
    }

    @Test
    public void testLongestCommonSubsequence() {
        assertEquals("", subject.longestCommonSubsequence("", ""));
        assertEquals("", subject.longestCommonSubsequence("left", ""));
        assertEquals("", subject.longestCommonSubsequence("", "right"));
        assertEquals("fog", subject.longestCommonSubsequence("frog", "fog"));
        assertEquals("", subject.longestCommonSubsequence("fly", "ant"));
        assertEquals("h", subject.longestCommonSubsequence("elephant", "hippo"));
        assertEquals("ABC Corp", subject.longestCommonSubsequence("ABC Corporation", "ABC Corp"));
        assertEquals("D  H Enterprises Inc", subject.longestCommonSubsequence("D N H Enterprises Inc", "D & H Enterprises, Inc."));
        assertEquals("My Gym Childrens Fitness", subject.longestCommonSubsequence("My Gym Children's Fitness Center", "My Gym. Childrens Fitness"));
        assertEquals("PENNSYLVNIA", subject.longestCommonSubsequence("PENNSYLVANIA", "PENNCISYLVNIA"));
        assertEquals("t", subject.longestCommonSubsequence("left", "right"));
        assertEquals("tttt", subject.longestCommonSubsequence("leettteft", "ritttght"));
        assertEquals("the same string", subject.longestCommonSubsequence("the same string", "the same string"));
    }

    @Test
    public void testLongestCommonSubsequenceApply() {
        assertEquals(0, subject.apply("", ""));
        assertEquals(0, subject.apply("left", ""));
        assertEquals(0, subject.apply("", "right"));
        assertEquals(3, subject.apply("frog", "fog"));
        assertEquals(0, subject.apply("fly", "ant"));
        assertEquals(1, subject.apply("elephant", "hippo"));
        assertEquals(8, subject.apply("ABC Corporation", "ABC Corp"));
        assertEquals(20, subject.apply("D N H Enterprises Inc", "D & H Enterprises, Inc."));
        assertEquals(24, subject.apply("My Gym Children's Fitness Center", "My Gym. Childrens Fitness"));
        assertEquals(11, subject.apply("PENNSYLVANIA", "PENNCISYLVNIA"));
        assertEquals(1, subject.apply("left", "right"));
        assertEquals(4, subject.apply("leettteft", "ritttght"));
        assertEquals(15, subject.apply("the same string", "the same string"));
    }
}
