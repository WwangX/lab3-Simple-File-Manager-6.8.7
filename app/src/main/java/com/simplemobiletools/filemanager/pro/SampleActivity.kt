package com.simplemobiletools.filemanager.pro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.Menu
import android.widget.TextView
import com.simplemobiletools.commons.dialogs.RadioGroupDialog
import com.simplemobiletools.commons.extensions.getAdjustedPrimaryColor
import com.simplemobiletools.commons.extensions.getFontSizeText
import com.simplemobiletools.commons.extensions.updateTextColors
import com.simplemobiletools.commons.helpers.FONT_SIZE_EXTRA_LARGE
import com.simplemobiletools.commons.helpers.FONT_SIZE_LARGE
import com.simplemobiletools.commons.helpers.FONT_SIZE_MEDIUM
import com.simplemobiletools.commons.helpers.FONT_SIZE_SMALL
import com.simplemobiletools.commons.models.RadioItem
import com.simplemobiletools.filemanager.pro.extensions.config
import kotlinx.android.synthetic.main.activity_settings.*
import com.simplemobiletools.commons.activities.BaseSimpleActivity

class SampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)
        //setupImportance()
    }
    /*override fun onResume() {
        super.onResume()
        setupImportance()
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        updateMenuItem(menu)
        return super.onCreateOptionsMenu(menu)
    }*/

    /*private fun setupSectionColors() {
        val adjustedPrimaryColor = getAdjustedPrimaryColor()
        arrayListOf(visibility_label, file_operations_label, security_label).forEach {
            it.setTextColor(adjustedPrimaryColor)
        }
    }

    private fun setupImportance() {
        settings_font_size.text = getFontSizeText()
        settings_font_size_holder.setOnClickListener {
            val items = arrayListOf(
                RadioItem(FONT_SIZE_SMALL, getString(R.string.small)),
                RadioItem(FONT_SIZE_MEDIUM, getString(R.string.medium)),
                RadioItem(FONT_SIZE_LARGE, getString(R.string.large)),
                RadioItem(FONT_SIZE_EXTRA_LARGE, getString(R.string.extra_large)))

            RadioGroupDialog(this@SampleActivity, items, config.fontSize) {
                config.fontSize = it as Int
                settings_font_size.text = getFontSizeText()
            }
        }
    }*/
}
