package com.checkboxreborn

import android.graphics.Color
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.CheckboxRebornViewManagerInterface
import com.facebook.react.viewmanagers.CheckboxRebornViewManagerDelegate

@ReactModule(name = CheckboxRebornViewManager.NAME)
class CheckboxRebornViewManager : SimpleViewManager<CheckboxRebornView>(),
  CheckboxRebornViewManagerInterface<CheckboxRebornView> {
  private val mDelegate: ViewManagerDelegate<CheckboxRebornView>

  init {
    mDelegate = CheckboxRebornViewManagerDelegate(this)
  }

  override fun getDelegate(): ViewManagerDelegate<CheckboxRebornView>? {
    return mDelegate
  }

  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): CheckboxRebornView {
    return CheckboxRebornView(context)
  }

  @ReactProp(name = "color")
  override fun setColor(view: CheckboxRebornView?, color: String?) {
    view?.setBackgroundColor(Color.parseColor(color))
  }

  companion object {
    const val NAME = "CheckboxRebornView"
  }
}
