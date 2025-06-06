package com.example.recipehubfrontend

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

// PUBLIC_INTERFACE
class UserSubmitRecipeFragment : Fragment() {
    /** Fragment allowing users to submit and manage their own recipes **/

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_user_submit_recipe, container, false)
    }
}
