/*
 *    Copyright 2019 Ross Binden
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

package uk.co.rossbinden.teensy.world.room

import uk.co.rossbinden.teensy.world.BitsyItem
import uk.co.rossbinden.teensy.world.BitsySerializable

class BitsyRoomItem(
    val itemId: String,
    val x: Int,
    val y: Int
): BitsySerializable {

    constructor(item: BitsyItem, x: Int, y: Int): this(item.id, x, y)

    override fun serialize(): String {
        return "ITM $itemId $x,$y\n"
    }

}
