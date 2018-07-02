enum class Months {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

    companion object { //months carousel
        fun getNextMonth(month: Months) : Months {
            return Months.values()[(month.ordinal + 1) % 12] //number of months
        }

        fun getPrevMonth(month: Months) : Months {
            val prevMonthNumber = if (month.ordinal > 0) month.ordinal - 1 else 11 //index of last month

            return Months.values()[prevMonthNumber]
        }
    }
}

class Birthday (val day : Int, val month : Months, val name : String) {

    override fun toString(): String {
        return "${day} of ${month} : ${name}"
    }
}

fun main(args: Array<String>) {
    val birthdate = Birthday(30, Months.JANUARY, "Jora")

    println(birthdate)
    println(Months.getPrevMonth(birthdate.month))
    println(Months.getNextMonth(birthdate.month))
}

