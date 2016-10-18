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
package org.juanitodread.algorithmslab.datastructures

/**
 * Very simple generic stack implementation
 *
 * @author juanitodread
 * @version 1.0.0
 *
 *          Oct 18, 2016
 */
class Stack[A] {
  private var stck = List[A]()

  def push(item: A) = stck = item :: stck

  def pop: Unit = stck = stck.tail

  def isEmpty: Boolean = stck.isEmpty

  override def toString = "MyStack(" + stck.reverse.mkString(",") + ")"
}

object Stack {
  def apply[A]() = new Stack[A]()
}
