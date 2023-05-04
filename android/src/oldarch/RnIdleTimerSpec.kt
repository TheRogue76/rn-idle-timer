package com.rnidletimer

import com.facebook.proguard.annotations.DoNotStrip
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod


abstract class RnIdleTimerSpec internal constructor(context: ReactApplicationContext) :
  ReactContextBaseJavaModule(context) {

  @ReactMethod
  @DoNotStrip
  public abstract fun setIdleTimerDisabled(status: Boolean)
}
