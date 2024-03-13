package jetbrains.refactoring.course.patterns

class TransportationServiceFactory {
    fun getTransportation(transport: String): Transport =
        when (transport) {
            "car" -> Car()
            "bicycle" -> Bicycle()
            else -> throw IllegalArgumentException("Unknown transport")
        }
}
