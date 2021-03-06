/*
 *    Copyright 2019 Ren Binden
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package uk.co.renbinden.teensy.controller.tab

import javafx.scene.control.TextField
import javafx.scene.control.TreeItem
import uk.co.renbinden.teensy.Teensy
import uk.co.renbinden.teensy.world.BitsyResource

abstract class ResourceTab<T: BitsyResource> {

    abstract val teensy: Teensy
    abstract val id: TextField

    fun load(resource: T) {
        id.text = resource.id
    }

    fun updateId(resource: T, resourceTreeItem: TreeItem<String>, oldId: String, newId: String) {
        resource.id = newId
        val oldTreeItem = resourceTreeItem.children.firstOrNull { treeItem -> treeItem.value == oldId }
        val index = resourceTreeItem.children.indexOf(oldTreeItem)
        resourceTreeItem.children.remove(oldTreeItem)
        resourceTreeItem.children.add(index, TreeItem<String>(newId))
    }

}