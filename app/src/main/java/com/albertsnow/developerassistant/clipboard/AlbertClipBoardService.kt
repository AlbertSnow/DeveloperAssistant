package com.albertsnow.developerassistant.clipboard

import android.app.Service
import android.content.Intent
import android.os.IBinder

class AlbertClipBoardService : Service() {

    init {

    }

    override fun onBind(intent: Intent?): IBinder? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        ClipBoardManager.copy(this, intent)
        return super.onStartCommand(intent, flags, startId)
    }

}