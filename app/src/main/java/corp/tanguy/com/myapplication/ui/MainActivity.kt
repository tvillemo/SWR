package corp.tanguy.com.myapplication.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.view.Window
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.ListView
import butterknife.bindView
import corp.tanguy.com.myapplication.R
import corp.tanguy.com.myapplication.model.Role
import corp.tanguy.com.myapplication.model.world.Galaxy


class MainActivity : AppCompatActivity() {
    var galaxy = Galaxy()
    val drawer: DrawerLayout by bindView<DrawerLayout>(R.id.drawer_layout)
    val drawerList: ListView by bindView<ListView>(R.id.left_drawer)
    var playerRole : Role = Role.Empire

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
        val drawerOptions : Array<String>
        if (playerRole == Role.Empire) {
            drawerOptions = resources.getStringArray(R.array.empire_option)
        } else {
            drawerOptions = resources.getStringArray(R.array.rebel_option)
        }
        drawerList.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, drawerOptions)
        drawerList.onItemClickListener = DrawerItemClickListener()

        val drawerToggle = ActionBarDrawerToggle(this, drawer, R.string.drawer_open, R.string.drawer_close)
        drawer.addDrawerListener(drawerToggle)

    }

}
