import scala.math.sqrt

// object Factorization extends App {
//   var target = 50
//   var maxDivisor = sqrt(target).toInt

//   def factorizationRec(
//       num: Int,
//       divisor: Int,
//       acc: Map[Int, Int]
//   ): Map[Int, Int] = {
//     if (divisor > maxDivisor) {
//       if (num == 1) acc else acc + (num -> 1)
//     } else if (num % divisor == 0) {
//       val nextAcc = acc + (divisor -> (acc.getOrElse(divisor, 0) + 1))
//       factorizationRec(num / divisor, divisor, nextAcc)
//     } else {
//       factorizationRec(num, divisor + 1, acc)
//     }
//   }

//   println(factorizationRec(target, 2, Map()))
// }

object Factorization extends App {

  def factorization(
      target: Int
  ): Map[Int, Int] = {
    var maxDivisor = sqrt(target).toInt

    def factorizationRec(
        num: Int,
        divisor: Int,
        acc: Map[Int, Int]
    ): Map[Int, Int] = {
      if (divisor > maxDivisor) {
        if (num == 1) acc else acc + (num -> 1)
      } else if (num % divisor == 0) {
        val nextAcc = acc + (divisor -> (acc.getOrElse(divisor, 0) + 1))
        factorizationRec(num / divisor, divisor, nextAcc)
      } else {
        factorizationRec(num, divisor + 1, acc)
      }
    }

    factorizationRec(target, 2, Map())
  }

  println(factorization(510510))
}
