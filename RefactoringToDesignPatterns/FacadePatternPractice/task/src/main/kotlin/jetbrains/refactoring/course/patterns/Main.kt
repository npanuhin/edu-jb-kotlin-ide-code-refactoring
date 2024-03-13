package jetbrains.refactoring.course.patterns

import jetbrains.refactoring.course.patterns.video.EncodedVideo

fun main(args: Array<String>) {
    val originalVideoName = args[0]
    val processedVideoName = args[1]

    VideoConversionFacade().convertVideo(originalVideoName ,processedVideoName)
}
