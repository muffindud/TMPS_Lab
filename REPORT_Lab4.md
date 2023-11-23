# Behavioral Design Patterns


## Author: Corneliu Catlabuga

----

## Objectives:

* Study and understand the Behavioral Design Patterns.
* As a continuation of the previous laboratory work, think about what communication between software entities might
be in your system.
* Create a new project or add some additional functionalities to the previous one using behavioral design patterns.

## Used Design Patterns:

* __State__: The state pattern is used to alter the behaviour of an object as its internal state changes. The pattern 
allows the class for an object to apparently change at run-time.
* __Observer__: The observer pattern is used to allow an object to publish changes to its state. Other objects subscribe
to be immediately notified of any changes.
* __Template__: The template pattern is used to create a group of subclasses that have to execute a similar group of
methods. In this pattern, a super class method is created that defines the methods to be executed, but the method
itself is not implemented in this class. Rather, abstract methods are created and the sub-classes inherit the abstract
methods and implement them in their own way.

## Implementation

### State Pattern

The player can be in one of the following states:
* __InGame__: The player is in the game and can only receive messages from other players.
* __Active__: The player is active and can receive messages and invitations from other players.
* __Away__: The player is away and cannot receive messages or invitations from other players.

```kotlin
class Player (
    ...
    var state: PlayerState,
    ...
) {
    ...
    fun changeState(newState: IState) {
        ...
        state = newState
    }
    fun receiveMessage(message: String, sender: Player) {
        playerState.receiveMessage(message=message, sender=sender, receiver=this)
    }

    fun sendMessage(message: String, receiver: Player) {
        playerState.sendMessage(message=message, sender=this, receiver=receiver)
    }
    ...
}
```

### Observer Pattern

If a player is in the __Active__ state, it can receive messages from other players. The messages are sent to the
__EventManager__ which notifies all the listeners that a message has been received.

```kotlin
object EventManager {
    var listeners: HashMap<String, Player> = HashMap()

    fun addListener(player: Player, eventType: String) {
        ...
    }

    fun removeListener(player: Player, eventType: String) {
        ...
    }

    fun notifyListeners(eventType: String, sender: Player, message: String = "") {
        ...
    }
}
```

### Template Pattern
The template pattern is used on the Equipment abstract class. The modified behaviour is the __applyEffect()__ method
which is implemented in the subclasses.

```kotlin
abstract class Equipment(
    ...
) {
    ...
    fun use() {
        fun use(crews: List<Crew>? = null, tank: ITank? = null) {
            if (checkCount() && checkCooldown()) {
                startCooldown()
                applyEffect(crews, tank)
            }
        }
    }

    abstract fun applyEffect()
}
```

```kotlin
class Heal (...): Equipment(...) {
    ...
    override fun applyEffect(crews: List<Crew>?, tank: ITank?) {
        crews?.forEach {
            it.health += crewHealth
            if (it.health > it.maxHealth) {
                it.health = it.maxHealth
            }
        }
    }
}
```

```kotlin
class Repair (...): Equipment (...) {
    ...
    override fun applyEffect(crews: List<Crew>?, tank: ITank?) {
        if (tank != null) {
            tank.health += tankHealth
            if (tank.health > tank.maxHealth) {
                tank.health = tank.maxHealth
            }
        }
    }
}
```

## Conclusions / Screenshots / Results:
The Behavioral Design Patterns are concerned with algorithms and the assignment of responsibilities between objects. 
They are often used to manage algorithms, relationships and responsibilities between objects, sometimes under the form
of events.
