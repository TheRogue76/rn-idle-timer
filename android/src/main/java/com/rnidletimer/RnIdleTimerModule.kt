package com.rnidletimer

import android.app.Activity
import android.view.WindowManager
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod

class RnIdleTimerModule internal constructor(context: ReactApplicationContext) :
  RnIdleTimerSpec(context) {

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  override fun setIdleTimerDisabled(status: Boolean) {
    currentActivity.let { activity: Activity? ->
      activity?.runOnUiThread {
        kotlin.run {
          if (status) {
            activity.window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
          } else {
            activity.window.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
          }
        }
      }
    }
  }

  companion object {
    const val NAME = "RnIdleTimer"
  }
}
