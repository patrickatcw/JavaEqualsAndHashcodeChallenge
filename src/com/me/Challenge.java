package com.me;


/*
challenge QUESTION.....
- when overriding the equals() method in the heavenlybody class, we
were careful to make sure that it would not return true if a heavenlybody
was compared to a subclass of itself
- we did that to demonstrate that a method, but it was actually
unnecessary in the heavenlybody class
- the mini-challenge is just a question, why was it unnecessary to do that
check in the heavenlybody class to make sure that it would not return true if the
heavenly body was compared to a sub-class of itself?

-HINT: lecture 97
 */

/*
challenge ANSWER....
- the heavenlybody class is declared final, so cannot be subclassed.
- the java string class is also final, which is why it can safely
use the instanceof method without having to worry about
comparison with a subclass
 */

//step 2 challenge create a dog class to demonstrate challenge question / answer

//step 1 challenge, create challenge class
public class Challenge {

}
