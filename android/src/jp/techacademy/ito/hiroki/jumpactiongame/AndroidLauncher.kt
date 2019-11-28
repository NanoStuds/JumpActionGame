package jp.techacademy.ito.hiroki.jumpactiongame

import android.os.Bundle

import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import jp.techacademy.ito.hiroki.jumpactiongame.JumpActionGame

class AndroidLauncher : AndroidApplication() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val config = AndroidApplicationConfiguration()
        initialize(JumpActionGame(), config)
    }
}