"one string"

"""
multiple 
strings of code are enclosed in
"""

'a' 
// characters type is char and character literals are written in single quotes

0.1
//res1: Double = 0.1
//The type is called Double and is for floating point numbers (decimals) and are an approx of real numbers
//A double takes up approx 64 bits, not enough to store infinite
//In general, floating point numbers can lead to nasty surprises if you expect them to act like the reals. 
//They are fine for our purposes in Creative Scala, but don’t go using them to write accounting software!
//In Scala all values are objects, operations like +,- are the object's methods
//we interact with objects by calling/invoking methods
//some methods accept parameters or arguements
//a method call is an expression and evaluates to an object



//Method call syntax anExpression.methodName(paramIfAny)

1 + 2
1. + (2)

//In Scala, these are equivalent, second way is known as operator style
//a b c d e 
// a.b(c).d(e)

//One use of types is stopping us from calling methods that don't exist, type of an expression tells the compiler what methods exist on the value it evaluates to
//code won't compile if we try to call to a method that doesn't exist

:type (2 + 1)
//Int

21 + 21
//arithmetic

"string1".++("string2")
//appending strings using the ++ method, normal method call

"string1" ++ "string2"
//operator style 

1 + 2 * 3
// = 7, Scala does maintain the standard precedence rule

1 + ("Moonage daydream".indexOf("N"))
//res8: Int = 0, can't find indexof("N") because there is no capital N, 
//when can't find, it evaluates to -1, 1+ -1 = 0

1 / 1 + ("Moonage daydream".indexOf("N"))
//res9: Int=0
//according to precedence 1/1 + (-1) evals to 0

:type circle(10)
// doodle.core.Image 
//type is Image

:type circle(10).draw
//Unit
//Unit is type of expressions that have no interesting value to return
//This is the case for draw, we call it bc we want somethign on the screen not bc we have a value for what it returns
//Unit's literal expression is ()

(circle(10) beside rectangle(10,20)).draw
//draws a circle right beside a rectangle

(((circle(10) beside circle(10) beside circle(10)) on circle(30))).draw
//draws 3circles next to each other on a large circle

(circle(10) fillColor Color.red).draw
//draws a circle and fills with red

(circle(10) lineColor Color.blue).draw
//draws circle with blue line

((circle(10) fillColor Color.black) on (circle(20) fillColor Color.cornflowerBlue)on (circle(30) fillColor Color.white) on (circle(50) fillColor Color.darkBlue)).draw
//when pasting multiple lines of code use the below
:paste
//will let you paste muliple lines of code and run it all at once instead of trying ot run it seperately 1 line at a time
//run above cmd then paste code and ctrl + d to exit paste mode to run


((triangle(40, 40)
       lineWidth 6.0
       lineColor Color.darkSlateBlue
       fillColor (Color.red lighten 0.3.normalized saturate 0.2.normalized spin 10.degrees)) above
  ((triangle(40, 40)
      lineWidth 6.0
      lineColor (Color.darkSlateBlue spin (-30.degrees))
      fillColor (Color.green lighten 0.3.normalized saturate 0.2.normalized spin (-20.degrees))) beside
     (triangle(40, 40)
        lineWidth 6.0
        lineColor (Color.darkSlateBlue spin (30.degrees))
        fillColor (Color.yellow lighten 0.3.normalized saturate 0.2.normalized spin (40.degrees)))))
//a triangle made out of 3 triangles 

(
	(rectangle(70,25) fillColor Color.green) below 
	(rectangle(15,5) fillColor Color.brown) below 
	(rectangle(5,15)) below 
	((circle(10)fillColor Color.red) on 
	(circle(20) fillColor Color.white) on 
	(circle(30) fillColor Color.red))
).draw

cd creative-scala-template
./sbt.sh
//cd to directory and run sbt

:q
//quit

exit
//exit and then will still be in the sbt shell?






