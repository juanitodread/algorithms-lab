/**
 * algorithms-lab
 *
 * Copyright 2016 juanitodread
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
 *
 */
package org.juanitodread.algorithmslab.util

trait Utils {

  /**
   * Helper method to swap two elements of the array.
   *
   * @param elements Array of T
   * @param origin Current position to swap
   * @param dest Destiny position to swap
   */
  def swap[T](elements: Array[T], origin: Int, dest: Int): Array[T] = {
    val aux = elements(origin)
    elements(origin) = elements(dest)
    elements(dest) = aux
    elements
  }

}
