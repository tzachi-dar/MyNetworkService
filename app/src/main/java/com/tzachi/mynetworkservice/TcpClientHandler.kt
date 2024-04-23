package com.tzachi.mynetworkservice

import android.content.Intent
import android.util.Log
import java.io.BufferedReader
import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.IOException
import java.io.InputStreamReader


class TcpClientHandler(private val dataInputStream: DataInputStream, private val dataOutputStream: DataOutputStream) : Thread() {
    override fun run() {
        while (true) {
            try {
                dataInputStream.close()
                dataOutputStream.close()

return;
/*
                val process = Runtime.getRuntime().exec("input tap 100 150")
                val bufferedReader = BufferedReader(
                    InputStreamReader(process.inputStream)
                )


                if(dataInputStream.available() > 0){
                    Log.i(TAG, "Received: " + dataInputStream.readUTF())
                    dataOutputStream.writeUTF("Hello Client")
                    sleep(2000L)

                }

 */
            } catch (e: IOException) {
                e.printStackTrace()
                try {
                    dataInputStream.close()
                    dataOutputStream.close()
                } catch (ex: IOException) {
                    ex.printStackTrace()
                }
            } catch (e: InterruptedException) {
                e.printStackTrace()
                try {
                    dataInputStream.close()
                    dataOutputStream.close()
                } catch (ex: IOException) {
                    ex.printStackTrace()
                }
            }
        }
    }

    companion object {
        private val TAG = TcpClientHandler::class.java.simpleName
    }

}
