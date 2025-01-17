/*
 * Copyright 2023 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.stunner.client.yaml.mapper.api.internal.deser.collection;

import java.util.Queue;

import org.kie.workbench.common.stunner.client.yaml.mapper.api.YAMLDeserializer;

/**
 * Base {@link YAMLDeserializer} implementation for {@link java.util.Queue}.
 *
 * @param <Q> {@link java.util.Queue} type
 * @param <T> Type of the elements inside the {@link java.util.Queue}
 * @author Nicolas Morel
 * @version $Id: $
 */
public abstract class BaseQueueYAMLDeserializer<Q extends Queue<T>, T>
    extends BaseCollectionYAMLDeserializer<Q, T> {

  /**
   * Constructor for BaseQueueYAMLDeserializer.
   *
   * @param deserializer {@link YAMLDeserializer} used to map the objects inside the {@link
   *     java.util.Queue}.
   */
  public BaseQueueYAMLDeserializer(YAMLDeserializer<T> deserializer) {
    super(deserializer);
  }

  /** {@inheritDoc} */
  @Override
  protected boolean isNullValueAllowed() {
    return false;
  }
}
