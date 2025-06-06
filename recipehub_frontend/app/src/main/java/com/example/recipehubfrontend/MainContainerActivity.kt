package com.example.recipehubfrontend

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton

// PUBLIC_INTERFACE
class MainContainerActivity : AppCompatActivity() {
    /** Main container that holds navigation and all app features for RecipeHub **/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.RecipeHubAppTheme)
        setContentView(R.layout.activity_main_container)

        // Initialize Bottom Navigation
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomNav.setOnNavigationItemSelectedListener(navigationListener)
        // Set default selection
        bottomNav.selectedItemId = R.id.nav_home

        // FAB for user recipe submission
        val fab = findViewById<FloatingActionButton>(R.id.fab_add_recipe)
        fab.setOnClickListener {
            // Open submission fragment
            openFragment(UserSubmitRecipeFragment())
        }
    }

    private val navigationListener = BottomNavigationView.OnNavigationItemSelectedListener { item: MenuItem ->
        when (item.itemId) {
            R.id.nav_home -> {
                openFragment(HomeFragment())
                true
            }
            R.id.nav_favorites -> {
                openFragment(FavoritesFragment())
                true
            }
            R.id.nav_profile -> {
                openFragment(ProfileFragment())
                true
            }
            else -> false
        }
    }

    // PUBLIC_INTERFACE
    fun openFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_fragment_container, fragment)
            .commit()
    }
}
