package com.example.testtesttest

import com.github.takahirom.roborazzi.RoborazziRule
import com.github.takahirom.roborazzi.captureRoboImage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.GraphicsMode

@RunWith(androidx.test.ext.junit.runners.AndroidJUnit4::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
class SimpleRoborazziTest {

    @get:Rule
    val roborazziRule = RoborazziRule(
        options = RoborazziRule.Options(
            outputDirectoryPath = "screenshots"
        )
    )

    @Test
    fun capture() {
        captureRoboImage {
            SecondScreen()
        }
    }
}