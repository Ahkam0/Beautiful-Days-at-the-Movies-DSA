import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'beautifulDays' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER i
 *  2. INTEGER j
 *  3. INTEGER k
 */

fun beautifulDays(i: Int, j: Int, k: Int): Int {
    // Write your code here
    
    var totalDays = 0 
    
    for(l in i .. j){
        val rNum = l.toString().reversed().toInt()
        var nom =  l - rNum
        
        if(nom == 0){
            totalDays++
        } else if (nom < 0) {
            nom = nom * -1
            if( (nom % k) == 0 ){
                totalDays++
            }
        } else {
            if( (nom % k) == 0 ){
                totalDays++
            }
        }
        
    }
    
    return totalDays
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val i = first_multiple_input[0].toInt()

    val j = first_multiple_input[1].toInt()

    val k = first_multiple_input[2].toInt()

    val result = beautifulDays(i, j, k)

    println(result)
}
