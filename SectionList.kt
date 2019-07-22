package com.digimva.epoi

import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class SectionList(private val context: AppCompatActivity, internal var sections: List<Section>) : ArrayAdapter<Section>(context, R.layout.layout_list_section, sections) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val listViewItem = inflater.inflate(R.layout.layout_list_section, null, true)

        val textViewNameSection = listViewItem.findViewById(R.id.textViewNameSection) as TextView

        val mysection= sections[position]
        textViewNameSection.text = mysection.name

        return listViewItem
    }
}