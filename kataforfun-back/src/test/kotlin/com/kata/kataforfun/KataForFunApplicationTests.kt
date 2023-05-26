package com.kata.kataforfun
    
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.junit.jupiter.api.Assertions

@SpringBootTest
class KataForFunApplicationTests {
     private val KATA = "Kata"
     private val FOR = "For"
     private val FUN = "Fun"
    @Test
    fun contextLoads() {
	
        Assertions.assertEquals("1", convertNumber(1))
        Assertions.assertEquals("KataKata", convertNumber(3))
        Assertions.assertEquals("ForFor", convertNumber(5))
        Assertions.assertEquals("Fun", convertNumber(7))
        Assertions.assertEquals("Kata", convertNumber(9))
        Assertions.assertEquals("KataFor", convertNumber(51))
        Assertions.assertEquals("ForKata", convertNumber(53))
        Assertions.assertEquals("KataKataKata", convertNumber(33))
        Assertions.assertEquals("KataFun", convertNumber(27))
        Assertions.assertEquals("KataForFor", convertNumber(15))
	
    }
	
    private fun convertNumber(inputNumber: Int): String {
	  val output = StringBuilder()
		

    if (inputNumber % 3 == 0) {
        output.append(KATA)
    }
    if (inputNumber % 5 == 0) {
        output.append(FOR)
    }
    for (c in inputNumber.toString()) {
        when (c) {
            '3' -> output.append(KATA)
            '5' -> output.append(FOR)
            '7' -> output.append(FUN)
        }
    }

    return if (output.toString().isEmpty()) inputNumber.toString() else output.toString()
}
    }

