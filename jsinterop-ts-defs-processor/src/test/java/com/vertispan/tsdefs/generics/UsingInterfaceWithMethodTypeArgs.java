/*
 * Copyright © 2023 Vertispan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.vertispan.tsdefs.generics;

import jsinterop.annotations.JsType;

@JsType
public class UsingInterfaceWithMethodTypeArgs<B>
    implements InterfaceWithGenericMethod,
        GenericInterfaceWithGenericMethod<String>,
        GenericInterfaceWithDualGenericMethod<B> {
  @Override
  public <T, S> B doSomething(T value1, B value2, S value3) {
    return null;
  }

  @Override
  public <T> String bar(T value1, String value2) {
    return null;
  }

  @Override
  public <T> T foo(T value1) {
    return null;
  }
}
