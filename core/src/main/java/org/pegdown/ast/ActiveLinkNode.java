/*
 * Copyright © 2015 - 2017 Lightbend, Inc. <http://www.lightbend.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.pegdown.ast;

import org.parboiled.common.ImmutableList;

import java.util.List;

/**
 * An active link is an explicit link with an 'active' class attribute.
 */
public class ActiveLinkNode extends AbstractNode {

    public final String href;
    public final Node child;

    public ActiveLinkNode(String href, Node child) {
        this.href = href;
        this.child = child;
    }

    public List<Node> getChildren() {
        return ImmutableList.of(child);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
