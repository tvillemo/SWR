package corp.tanguy.com.myapplication.model.Units

import corp.tanguy.com.myapplication.model.UnitType

class Unit(val unitType: UnitType, var hp : Int, val redDice : Int, val blackDice : Int) {
    fun hit(damage : Int) : Boolean{
        hp -= damage
        return hp < 0
    }
}