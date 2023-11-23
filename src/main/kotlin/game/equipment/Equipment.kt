package game.equipment

import game.crew.Crew
import game.tank.ITank
import java.math.BigInteger
import java.time.Instant

abstract class Equipment (
    var maxCooldown: Int,
    var cost: Int
) {
    var count: Int = 0
    var lastApplied: BigInteger = BigInteger.ZERO

    fun checkCount(): Boolean {
        return count > 0
    }

    fun checkCooldown(): Boolean {
        return Instant.now().epochSecond - lastApplied.toLong() >= maxCooldown
    }

    fun startCooldown() {
        count--
        lastApplied = BigInteger.valueOf(Instant.now().epochSecond)
    }

    open fun applyEffect(crews: List<Crew>?, tank: ITank?) {

    }

    fun use(crews: List<Crew>? = null, tank: ITank? = null) {
        if (checkCount() && checkCooldown()) {
            startCooldown()
            applyEffect(crews, tank)
        }
    }

    fun buy(ct: Int = 1) {
        count += ct
    }
}