/**
 * algorithms-lab
 *
 * Copyright 2015 juanitodread
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
package org.juanitodread.algorithmslab.scala.sorting

/**
 *
 *
 * @author juanitodread
 * @version $
 *
 * Feb 16, 2015
 */
object InsertionSort {

  def sortInt( elements: Array[ Int ] ): Array[ Int ] = {
    sort( elements, ( x: Int, y: Int ) => x < y)
  }
  
  def sortString(elements: Array[Char]): Array[Char]={
    sort(elements, (x: Char, y: Char) => x.toString.compareTo(y.toString) == -1)
  }

  private def swap[T]( elements: Array[ T ], index: Int ): Unit = {
    val aux = elements( index )
    elements( index ) = elements( index - 1 )
    elements( index - 1 ) = aux
  }

  private def sort[T]( elements: Array[T], func: ( T, T ) => Boolean ): Array[ T ] = {
    var j = 0
    for ( i <- 1 until elements.length ) {
      j = i
      while ( j > 0 && func( elements( j ), elements( j - 1 ) ) ) {
        swap( elements, j )
      }
    }
    elements
  }

}