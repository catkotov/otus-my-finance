package org.cat.eye.otus.finance.init

import kotlin.test.assertEquals
import kotlin.test.Test

class MessageUtilsTest {

    @Test
    fun testGetMessage() {
        assertEquals(
            "Congratulation Alex! You've just started your first Kotlin program!",
            MessageUtils.getMessage("Alex")
        )
    }

    @Test
    fun testGetMessageWithNullArgument() {
        assertEquals(
            "Congratulation anonymous! You've just started your first Kotlin program!",
            MessageUtils.getMessage(null)
        )
    }
}
