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
package org.juanitodread.algorithmslab.string

/**
 * This class represents the algorithm of Selection Sort that consists in sort a
 * collection of data by select the lower element in the array.
 *
 * <code>
 * Complexity:
 * ____________________________________________
 * |    BEST    |    AVERAGE    |    WORST    |
 * |____________|_______________|_____________|
 * |    O(n^2)  |    O(n^2)     |    O(n^2)   |
 * |____________|_______________|_____________|
 * </code>
 *
 * @author juanitodread
 * @version 1.0
 *
 * Aug 10, 2016
 */
object PatternMatching {

  private[this] def isValid(str: String, p: String): Boolean = p.length <= str.length

  def indexOf(str: String, p: String): Int = {
    require(isValid(str, p), s"'$str' length must be >= '$p' length")

    val NotFound = -1
    for (i <- 0 to str.length - p.length) {
      var n = 0
      while (n < p.length && str.charAt(i + n) == p.charAt(n)) {
        n += 1
      }
      if (n == p.length) {
        return i
      }
    }

    NotFound
  }

}
