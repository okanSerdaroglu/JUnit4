package com.example.junit4_examples

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceCompareTest {

    /**
     * initializing ResourceCompare() object here is not a good solution
     * private val resourceCompare = ResourceCompare()
     * each method should create their own instance, but think that there is
     * 30 methods here which uses resourceCompare instance, this causes
     * tons of boiler plate code
     */

    private lateinit var resourceCompare: ResourceCompare

    /**
     * this before method works before every method here and initializes
     * resourceCompare instance
     */
    @Before
    fun setup() {
        resourceCompare = ResourceCompare()
    }

    /**
     * in this method you must remove your objects. Garbagge collector
     * does this for you however sometimes you need to use roomDatabase instance
     * or something like that.
     */
    @After
    fun teardown() {

    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
        //resourceCompare = ResourceCompare()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context, R.string.app_name, "Junit4-Examples")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse() {
        //resourceCompare = ResourceCompare()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceCompare.isEqual(context, R.string.app_name, "Junit4")
        assertThat(result).isFalse()
    }

}