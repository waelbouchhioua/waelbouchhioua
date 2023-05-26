package com.kata.kataforfun.services

import org.springframework.stereotype.Component

@Component
class KataForFunService {
    private val KATA ="Kata"
    private val FOR = "For"
    private val FUN = "Fun"
		
	/*	
         This convertNumber method takes an integer 
         as input and returns a string based on the specified conditions.  
	   */
    fun convertNumber(inputNumber: Int): String {
	  val output = StringBuilder()
		
	/*
        If the number is divisible by 3 
	*/
    if (inputNumber % 3 == 0) {
        output.append(KATA)
    }
            /*
	      if the number is divisible by 5 
	       */
    if (inputNumber % 5 == 0) {
        output.append(FOR)
    }
	 /*
	      if the number contains 7, replace 7 by "Fun".
	      or contains 3 replace 3 by "Kata"
	      or contains 5, replace 5 by "For"
          */
    for (c in inputNumber.toString()) {
        when (c) {
            '3' -> output.append(KATA)
            '5' -> output.append(FOR)
            '7' -> output.append(FUN)
			  
        }
    }
/*if the output is empty, otherwise it returns 
    the string representation of the output */
    return if (output.toString().isEmpty()) inputNumber.toString() else output.toString()
}


}
