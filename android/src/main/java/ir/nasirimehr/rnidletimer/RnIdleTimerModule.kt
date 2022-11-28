package ir.nasirimehr.rnidletimer

import android.app.Activity
import android.view.WindowManager
import expo.modules.kotlin.modules.Module
import expo.modules.kotlin.modules.ModuleDefinition

class RnIdleTimerModule : Module() {
  override fun definition() = ModuleDefinition {
    Name("RnIdleTimer")

    Function("setIdleTimerDisabled") {status:Boolean ->
      appContext.currentActivity.let { activity: Activity? ->
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
  }
}
