package cubex.mahesh.tabbedactivity


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Home : Fragment( )

{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v = inflater!!.inflate(R.layout.home_frag_new,
                            container,false)
        return v
    }
}