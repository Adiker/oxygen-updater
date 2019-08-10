package com.arjanvlek.oxygenupdater.views

import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.arjanvlek.oxygenupdater.ApplicationData
import com.arjanvlek.oxygenupdater.R

/**
 * Sets support action bar and enables home up button on the toolbar
 *
 * @author Adhiraj Singh Chauhan (github.com/adhirajsinghchauhan)
 */
abstract class SupportActionBarActivity : AppCompatActivity() {

    private var applicationData: ApplicationData? = null

    override fun setContentView(@LayoutRes layoutResId: Int) {
        super.setContentView(layoutResId)

        setupToolbar()
    }

    override fun setContentView(view: View) {
        super.setContentView(view)

        setupToolbar()
    }

    override fun setContentView(view: View, params: ViewGroup.LayoutParams) {
        super.setContentView(view, params)

        setupToolbar()
    }

    private fun setupToolbar() {
        val toolbar = findViewById<Toolbar>(R.id.toolbar)

        setSupportActionBar(toolbar)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    protected fun getApplicationData(): ApplicationData {
        if (applicationData == null) {
            applicationData = application as ApplicationData
        }
        return applicationData as ApplicationData
    }
}