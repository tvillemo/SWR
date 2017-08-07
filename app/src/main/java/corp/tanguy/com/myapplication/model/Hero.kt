package corp.tanguy.com.myapplication.model

import corp.tanguy.com.myapplication.model.world.Planet

class Hero(val name : String, val skills: HashMap<Skill, Int>){
    var currentPlanet : Planet? = null

}