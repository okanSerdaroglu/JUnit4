package com.example.junit4_examples

object RegistrationUtil {

    /**
     * test cases
     * the input is not valid if ..
     * .. the username/password is empty
     * .. the username is already taken
     * .. the confirmed password is not the same as the real password
     * .. the password contains less then 2 digits
     */

    private val existingUsers = listOf("Peter","Carl")

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        return true
    }

}