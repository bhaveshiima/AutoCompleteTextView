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

        // Single Selection [ START ]
        var countryAdepter = ArrayAdapter<String>(this@MainActivity,android.R.layout.simple_list_item_single_choice, countryarr)
        acvt1.setAdapter(countryAdepter)
        acvt1.threshold = 1
        // Single Selection [ END ]


        // Selection From Kotlin File [ START ]
        var CountryArr = arrayListOf("India","Indonasia","South Africa", "South","Japan","Jaimica", "Canada")
        var countryArrAdepter = ArrayAdapter<String>(this@MainActivity,android.R.layout.simple_list_item_multiple_choice,CountryArr)
        acvt2.setAdapter(countryArrAdepter)
        acvt2.threshold = 1
        //  From Kotlin File Selection [ END ]


        // Select Multiple Skills Selection [ START ]
        var skillArr = resources.getStringArray(R.array.skillsList)
        var skillAdapter = ArrayAdapter<String>(this@MainActivity,android.R.layout.simple_list_item_single_choice, skillArr )
        acSkill.setAdapter(skillAdapter)
        acSkill.threshold = 1
        // Select Multiple Skills Selection [ START ]


    }
}
