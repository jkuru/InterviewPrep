package com.kuru.interviewprep

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class MainKt {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val name = "Kotlin"
            println("Hello, " + name + "!")

            for (i in 1..5) {
                println("i = $i")
            }
        }
    }
}
