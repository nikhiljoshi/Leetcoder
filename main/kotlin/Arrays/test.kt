import kotlinx.coroutines.*

import java.util.Calendar
fun main() {
    var data= intArrayOf(1,7,9,10,11)
    println("---")
println(sentenceCount("hello how are you. This is test.yahooo my"))

}

fun sentenceCount(str: String): Int {
    var temp:List<String> = str.split( ".")
   var result = 0

    temp.forEach {
        var couter = wordCount(it)
       if (couter>result)
            result =  couter

    }

    return result

}

fun  wordCount(str: String): Int
{
    val trimmedStr = str.trim()
    return if (trimmedStr.isEmpty()) {
        0
    } else {
        trimmedStr.split("\\s+".toRegex()).size
    }
}


//fun maxWordsCounter(s:String) {
//    var sentencesList:String
//    var wordsList:String
//    var lenList :String
//    var i =0
//    var j =0
//    var wordCounter = 0
//    var updS:StringBuffer = StringBuffer(s);
//
//    updS = updS.replace(@/\.|\!|\?/g, '|'); // replace '.!?' with '|' (pipe symbol)
//    sentencesList = updS.split('|');
//    for (i in sentencesList) {
//        wordsList = [];
//        wordsList = sentencesList[i].split(' ');
//        for (var j in wordsList) {
//            if(wordsList[j].trim() !== '') {
//                wordCounter++;
//            }
//        }
//        lenList.push(wordCounter);
//        wordCounter = 0;
//    }
//    return Math.max(...lenList);
//}






