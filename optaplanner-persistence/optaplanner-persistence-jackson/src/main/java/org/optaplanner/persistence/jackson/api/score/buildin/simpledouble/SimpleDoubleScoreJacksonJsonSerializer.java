/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.persistence.jackson.api.score.buildin.simpledouble;

import org.optaplanner.core.api.score.buildin.simpledouble.SimpleDoubleScore;
import org.optaplanner.persistence.jackson.api.score.AbstractScoreJacksonJsonSerializer;

@SuppressWarnings("checkstyle:javadocstyle")
/**
 * @deprecated Double-based scores are deprecated as floating point numbers can't represent a decimal number correctly.
 */
@Deprecated(/* forRemoval = true */)
public class SimpleDoubleScoreJacksonJsonSerializer extends AbstractScoreJacksonJsonSerializer<SimpleDoubleScore> {

}
