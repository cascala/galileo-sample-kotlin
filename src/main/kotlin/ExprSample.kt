package sample

import galileo.expr.Number
import galileo.expr.Variable

class ExprSample : SampleInterface {
	override fun run() {
		val n = Number( 1.0 )
		val v = Variable( "a" )
		println( n )
		println( v )
	}
}