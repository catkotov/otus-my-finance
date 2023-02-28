package org.cat.eye.otus.finance.app

import org.junit.Test
import junit.framework.TestCase.assertEquals

class MessageUtilsTest {

    @Test
    fun testGetMessage() {
        assertEquals("Hello World!", MessageUtils.getMessage())
    }

}
