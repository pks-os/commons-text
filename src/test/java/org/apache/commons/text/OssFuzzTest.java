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

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class OssFuzzTest {

    /**
     * Input is from clusterfuzz-testcase-StringSubstitutorInterpolatorFuzzer-5447769450741760
     *
     * @throws Exception Thrown when the test fails.
     */
    @Disabled("Until Apache Commons Lang 3.18.0")
    @Test
    public void test() throws Exception {
        StringSubstitutor.createInterpolator().replace(
                "¿ ,${const:ˇda´~e]W]                   ~          t $t ${.u base64encoder{con+s {.u base64encoder{con+s          ~          t   ....................                                                                                      ................ˇˇˇˇˇˇˇˇˇˇ&${localhot:ˇˇˇˇˇˇ4ˇ.........  .........................s${.!. ${..  \\E],${conÅ       EEE]W€EÅE.! ${.u base64encoder{conÅ       EEE]W€EÅE.! ${.u base64encoder{con+s          ~          t   ....................................ˇˇˇˇˇˇˇˇˇˇ&${localhot:ˇˇˇˇˇˇ-636ˇ...............................................................     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - -......     t]V]W€EÅE.! $${.u - - }");
    }

    /**
     * Input is from clusterfuzz-testcase-StringSubstitutorInterpolatorFuzzer-5447769450741760
     *
     * @throws Exception Thrown when the test fails.
     */
    @Test
    public void testStringSubstitutorInterpolatorFuzzer5447769450741760() throws Exception {
        StringSubstitutor.createInterpolator().replace("${date:swswswswswsswswswswswswwswsswswswswsswswswswsswswswswswswswswswswsws}");
    }
}
