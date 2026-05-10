package Ejs

import java.time.LocalDate
import java.time.Year
import java.time.temporal.ChronoUnit

fun main(){
    println(ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.parse("2027-01-01")))
}
