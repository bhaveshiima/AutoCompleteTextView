package bhavesh.vsl.autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var countryarr = resources.getStringArray(R.array.countryList)
        var countryAdepter = ArrayAdapter<String>(this@MainActivity,android.R.layout.simple_list_item_single_choice, countryarr)
        acvt1.setAdapter(countryAdepter)
        acvt1.threshold = 1



    }
}
