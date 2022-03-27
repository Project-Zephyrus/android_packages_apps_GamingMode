package org.exthmui.game.preference

import android.content.Context
import android.util.AttributeSet

import com.android.settingslib.widget.MainSwitchPreference

class SystemSettingMainSwitchPreference @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
): MainSwitchPreference(context, attrs, defStyleAttr, defStyleRes) {
    init {
        setPreferenceDataStore(SystemSettingsStore(context.contentResolver))
    }
}
