/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.plc4x.java.mock;

import org.apache.plc4x.java.api.exceptions.PlcInvalidFieldException;
import org.apache.plc4x.java.api.model.PlcField;
import org.apache.plc4x.java.spi.connection.DefaultPlcFieldHandler;
import org.apache.plc4x.java.spi.messages.items.BaseDefaultFieldItem;

public class MockFieldHandler extends DefaultPlcFieldHandler {

    @Override
    public PlcField createField(String fieldQuery) throws PlcInvalidFieldException {
        return new MockField(fieldQuery);
    }

    @Override
    public BaseDefaultFieldItem encodeBoolean(PlcField field, Object[] values) {
        return new MockFieldItem(values);
    }

    @Override
    public BaseDefaultFieldItem encodeByte(PlcField field, Object[] values) {
        return new MockFieldItem(values);
    }

    @Override
    public BaseDefaultFieldItem encodeShort(PlcField field, Object[] values) {
        return new MockFieldItem(values);
    }

    @Override
    public BaseDefaultFieldItem encodeInteger(PlcField field, Object[] values) {
        return new MockFieldItem(values);
    }

    @Override
    public BaseDefaultFieldItem encodeBigInteger(PlcField field, Object[] values) {
        return new MockFieldItem(values);
    }

    @Override
    public BaseDefaultFieldItem encodeLong(PlcField field, Object[] values) {
        return new MockFieldItem(values);
    }

    @Override
    public BaseDefaultFieldItem encodeFloat(PlcField field, Object[] values) {
        return new MockFieldItem(values);
    }

    @Override
    public BaseDefaultFieldItem encodeBigDecimal(PlcField field, Object[] values) {
        return new MockFieldItem(values);
    }

    @Override
    public BaseDefaultFieldItem encodeDouble(PlcField field, Object[] values) {
        return new MockFieldItem(values);
    }

    @Override
    public BaseDefaultFieldItem encodeString(PlcField field, Object[] values) {
        return new MockFieldItem(values);
    }

    @Override
    public BaseDefaultFieldItem encodeTime(PlcField field, Object[] values) {
        return new MockFieldItem(values);
    }

    @Override
    public BaseDefaultFieldItem encodeDate(PlcField field, Object[] values) {
        return new MockFieldItem(values);
    }

    @Override
    public BaseDefaultFieldItem encodeDateTime(PlcField field, Object[] values) {
        return new MockFieldItem(values);
    }

    @Override
    public BaseDefaultFieldItem encodeByteArray(PlcField field, Object[] values) {
        return new MockFieldItem(values);
    }
}