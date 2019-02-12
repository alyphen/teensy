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

package uk.co.rossbinden.teensy.world

import javafx.scene.paint.Color

class BitsyColor(
    val red: Int,
    val green: Int,
    val blue: Int
): BitsySerializable {

    override fun serialize(): String {
        return "$red,$green,$blue\n"
    }

    fun toColor(): Color {
        return Color.color(red / 255.0, green / 255.0, blue / 255.0)
    }

}
