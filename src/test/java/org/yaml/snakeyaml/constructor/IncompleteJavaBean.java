/**
 * Copyright (c) 2008-2011, http://www.snakeyaml.org
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

package org.yaml.snakeyaml.constructor;

public class IncompleteJavaBean {
    private int number;
    private String name = "No name";
    private float amount;

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
        amount += number;
    }

    public int obtainNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "<IncompleteJavaBean name=" + name + ">";
    }
}