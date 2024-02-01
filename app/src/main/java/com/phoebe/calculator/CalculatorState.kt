package com.phoebe.calculator

data class CalculuatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
