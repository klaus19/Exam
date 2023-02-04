package com.tejas.exam.dominika

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.tejas.exam.R
import com.tejas.exam.adapters.MyListAdapter
import com.tejas.exam.technical.*

class Technical: AppCompatActivity() {


    val operations = arrayOf<String>("Analog And Digital Communication",
        "Analog Electronics","Control Systems","Digital Electronics","Electric Circuits","Electrical Measurements",
        "Electrical Drives","Electrical Machines","Electromagnetic Fields","Engineering Materials","Engineering Mathematics",
        "Heating and Welding","Illumination","Microprocessors","Power Electronics")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_technical)

        val listviewTechnicalProducts = findViewById<ListView>(R.id.listTechnicalProducts)
        val myListAdapter = MyListAdapter(this, operations)
        listviewTechnicalProducts.adapter = myListAdapter

        listviewTechnicalProducts.setOnItemClickListener { adapterView, view, position, id ->

            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)

            when(position) {

                0->{
                    val ADCommunicationIntent = Intent(this, AnalogandDigitalCommunication::class.java)
                    startActivity(ADCommunicationIntent)
                }
                1->{
                    val analogElectronics = Intent(this, AnalogElectronics::class.java)
                    startActivity(analogElectronics)
                }
                2->{
                    val controlSystemIntent = Intent(this, ControlSystems::class.java)
                    startActivity(controlSystemIntent)
                }
                3->{
                    val digitalElectronicsIntent = Intent(this, DigitalElectronics::class.java)
                    startActivity(digitalElectronicsIntent)
                }
                4->{
                    val electricCircuitsIntent = Intent(this, ElectricCircuits::class.java)
                    startActivity(electricCircuitsIntent)
                }
                5->{
                    val electricalMeasurment = Intent(this,ElectricalInstruments::class.java)
                    startActivity(electricalMeasurment)
                }
                6->{
                    val electricalDrives = Intent(this,ElectricalDrives::class.java)
                    startActivity(electricalDrives)
                }
                7->{
                    val electricalMachines = Intent(this,ElectricalMachines::class.java)
                    startActivity(electricalMachines)
                }
                8->{
                    val electroMagneticfields = Intent(this,ElectromagneticField::class.java)
                    startActivity(electroMagneticfields)
                }
                9->{
                    val engineeringMaterials = Intent(this,EngineeringMaterials::class.java)
                    startActivity(engineeringMaterials)
                }
                10->{
                    val engineeringMathematics = Intent(this,EngineeringMathematics::class.java)
                    startActivity(engineeringMathematics)
                }
                11->{
                    val welding = Intent(this,HeatingAndWelding::class.java)
                    startActivity(welding)
                }
                12->{
                    val illumination = Intent(this,Illumination::class.java)
                    startActivity(illumination)
                }
                13->{
                    val microprocessor = Intent(this,Microprocessors::class.java)
                    startActivity(microprocessor)
                }
                14->{
                    val powerElectronics = Intent(this,PowerElectronics::class.java)
                    startActivity(powerElectronics)
                }

            }
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}