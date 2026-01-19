/*fun main(){
    val manager = ResourceManager()
    val minerals = OutpostResource(1,"Minerals", 300)
    val gas = OutpostResource(2,"Gas",100)
    manager.add(minerals)
    manager.add(gas)
    manager.printAll()

    val bonus = minerals.copy(amount = minerals.amount + 50)
    println("Копия минералов с бонусом: $bonus")
}*/

fun main() {

    val car = Car(model = "LADA", number = "134LAD")
    val aircraft = Aircraft(model = "Boeing", number = "737")


    car.move()
    car.stop()
    aircraft.move()
    aircraft.stop()

    println()

    travel(car)
    travel(aircraft)

    println()


    val movableCar: Movable = Car(model = "Toyota", number = "123ABC")
    val movableAircraft: Movable = Aircraft(model = "Airbus", number = "A320")

    movableCar.move()
    movableAircraft.move()

    println()


    val pavel = WorkingStudent(name = "Pavel")
    pavel.work()
    pavel.study()

    println()

    val player = MediaPlayer()
    player.play()
}