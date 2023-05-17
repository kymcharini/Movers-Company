package com.example.moverscompany

interface FragmentNavigation {
    fun navigateFrag(fragment: LoginFragment, addToStack: Boolean)
    fun navigateFrag(fragment: HomeFragment, addToStack: Boolean) {
        TODO("Not yet implemented")
    }

    fun navigateFrag(registerFragment: RegisterFragment, b: Boolean)
    fun navigateFrag(mapsFragment: MapsFragment, b: Boolean)
}