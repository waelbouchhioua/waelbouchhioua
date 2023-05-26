package com.kata.kataforfun.services

import org.springframework.stereotype.Component

@Component
class KataForFunService {
	private val KATA ="Kata"
    private val FOR = "For"
    private val FUN = "Fun"
		/*
		 Cette méthode convertNumber prend un entier en entrée et renvoie
		 une chaîne de caractères
		 en fonction des conditions spécifiées.  
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

    return if (output.toString().isEmpty()) inputNumber.toString() else output.toString()
}


}