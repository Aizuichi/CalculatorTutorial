package com.example.calculator

sealed class CalculatorAction {
    data class Number(val number: Int): CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
    object Decimal: CalculatorAction()
    data class Operation(val operation: CalculatorOperations): CalculatorAction()
    object Calculate: CalculatorAction()
    object LastCalc: CalculatorAction()
}
