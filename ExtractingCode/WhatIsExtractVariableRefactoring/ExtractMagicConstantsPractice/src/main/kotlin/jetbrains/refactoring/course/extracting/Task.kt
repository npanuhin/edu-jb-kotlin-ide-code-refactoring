package jetbrains.refactoring.course.extracting

private const val PlanckConstant = 6.62607015e-34

private const val SpeedOfLight = 299792458.0

fun calculatePhotonEnergy(waveLength: Double): Double {
    val frequency = SpeedOfLight / waveLength
    return PlanckConstant * frequency
}

fun calculatePhotonMass(energy: Double): Double {
    val waveLength = SpeedOfLight * SpeedOfLight
    return energy / waveLength
}

fun main() {
    val photonEnergy = calculatePhotonEnergy(0.5e-6)
    val photonMass = calculatePhotonMass(photonEnergy)

    println("Photon energy: $photonEnergy Joules")
    println("Photon mass: $photonMass kg")
}
