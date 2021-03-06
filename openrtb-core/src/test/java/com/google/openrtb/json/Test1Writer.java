/*
 * Copyright 2014 Google Inc. All Rights Reserved.
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

package com.google.openrtb.json;

import com.google.openrtb.Test.Test1;

import com.fasterxml.jackson.core.JsonGenerator;

import java.io.IOException;

/**
 * Sample JSON writer for a regular extension of message type.
 */
class Test1Writer extends OpenRtbJsonExtWriter<Test1> {

  @Override protected void write(Test1 ext, JsonGenerator gen) throws IOException {
    gen.writeStringField("test1", ext.getTest1());
  }
}
