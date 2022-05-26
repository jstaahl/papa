package papa

import android.util.Log

class PapaEventLogger : PapaEventListener {

  override fun onEvent(event: PapaEvent) {
    Log.d("LogcatPapaEventListener", event.toString())
  }
}