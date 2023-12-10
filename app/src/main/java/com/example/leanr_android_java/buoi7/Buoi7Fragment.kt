package com.example.leanr_android_java.buoi7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.leanr_android_java.R

//// TODO: Rename parameter arguments, choose names that match
//// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Buoi7Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Buoi7Fragment : Fragment() {
    companion object{
        fun newFragment(data:String): Buoi7Fragment{
            val fragment=Buoi7Fragment()
            val bundle = Bundle()
            bundle.putString("key5","Day la string")
            fragment.arguments=bundle
            return fragment
        }

    }
    private var btnClickMe: Button?=null
    //Khoi tao 1 fragment duoc goi 1 lan
    //set Style, theme cho tung fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //muon goi activity cha, sau do ep kieu ve activity ma ta muon
        (activity as Buoi7Activity)
        (activity as? Buoi7Activity)?.toastLinhTinh()


    }
    //Tao view cho fragment
    //Chi duoc goi 1 lan

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buoi7, container, false)
    }
    //Khi view duoc khoi tao xong
    //Khoi tao cac du lieu, goi api findviewbyid
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnClickMe = view.findViewById(R.id.btnClickMe)
        btnClickMe?.setOnClickListener {
            (activity as? Buoi7Activity)?.toastLinhTinh()
        }
        val text = arguments?.getString("key5","")
        btnClickMe?.text = text
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStop() {
        super.onStop()
    }
    //phai huy view truoc huy fragment
    // Cac ban can lay 1 so du lieu tu tren view truoc khi chung bi huy
    override fun onDestroyView() {
        super.onDestroyView()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDetach() {
        super.onDetach()
    }
}