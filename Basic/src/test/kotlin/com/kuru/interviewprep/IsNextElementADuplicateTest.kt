package com.kuru.interviewprep

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


class IsNextElementADuplicateTest {

    @Test
    fun `returns true when next element is a duplicate`() {
        val inputArray = arrayOf(1, 1, 2, 3, 3, 3)
        assertTrue(isNextElementADuplicate(inputArray, 0))
        assertTrue(isNextElementADuplicate(inputArray, 3))
    }

    @Test
    fun `returns false when next element is not a duplicate`() {
        val inputArray = arrayOf(1, 2, 3)
        assertFalse(isNextElementADuplicate(inputArray, 0))
    }

    @Test
    fun `returns false for the last element`() {
        val inputArray = arrayOf(1, 2, 3)
        assertFalse(isNextElementADuplicate(inputArray, 2))
    }
}