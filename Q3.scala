object third{
    def main(args: Array[String]): Unit={
        var takeHomeSalary = salary(40, 30) * 0.88
        print("Take Home Salary of an Emplyee is : Rs."+takeHomeSalary)
    }

    def salary(x:Int, y:Int): Int = 250 * x + 85 * y
}