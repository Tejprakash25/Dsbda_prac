object SimpleProgram {

  def main(args: Array[String]): Unit = {

    val numbers = Array(10, 20, 30, 40, 50)

    var sum = 0

    for (n <- numbers) {
      sum = sum + n
    }

    println("Sum is: " + sum)
  }
}
