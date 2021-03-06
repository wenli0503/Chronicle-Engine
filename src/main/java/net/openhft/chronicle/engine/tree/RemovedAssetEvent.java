/*
 * Copyright 2016 higherfrequencytrading.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package net.openhft.chronicle.engine.tree;

import net.openhft.chronicle.wire.AbstractMarshallable;
import org.jetbrains.annotations.NotNull;

/**
 * Created by peter on 22/05/15.
 */
public class RemovedAssetEvent extends AbstractMarshallable implements TopologicalEvent {
    private String assetName;
    private String name;

    private RemovedAssetEvent(String assetName, String name) {
        this.assetName = assetName;
        this.name = name;
    }

    @NotNull
    public static RemovedAssetEvent of(String assetName, String name) {
        return new RemovedAssetEvent(assetName, name);
    }

    @Override
    public boolean added() {
        return false;
    }

    @Override
    public String assetName() {
        return assetName;
    }

    public String name() {
        return name;
    }
}
