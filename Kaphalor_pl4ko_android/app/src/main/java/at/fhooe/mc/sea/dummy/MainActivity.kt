package at.fhooe.mc.sea.dummy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("debuggerLog", "got into main Activity")
    }

    private fun changeBackground() {
        
    }
}
fun dummy(): Int{
    var palmi:Boolean = false
    return 0
}
