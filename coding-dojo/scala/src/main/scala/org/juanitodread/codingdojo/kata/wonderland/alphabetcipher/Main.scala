package org.juanitodread.codingdojo.kata.wonderland.alphabetcipher

/**
 * @author juansand
 */
object Main {
  def main(args: Array[String]) {
    val key = "vigilance"
    
    val text    = "meetmeontuesdayeveningatseven"   
    val keycode = AlphabetCipher.buildKeycode(key, text)    
    
    val res = AlphabetCipher.encode(keycode, text)
    assert("hmkbxebpxpmyllyrxiiqtoltfgzzv" == res, "String are not equals")
    println(s"""encode("${key}", "${text}") => "${res}"""")
    
    val text1 = "hmkbxebpxpmyllyrxiiqtoltfgzzv"
    val res1  = AlphabetCipher.decode(keycode, text1)
    assert("meetmeontuesdayeveningatseven" == res1, "String are not equals")
    println(s"""decode("${key}", "${text1}") => "${res1}"""")
  }
}
