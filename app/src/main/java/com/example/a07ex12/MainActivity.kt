package com.example.a07ex12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity() {
    private lateinit var mapView: MapView
    private lateinit var gmap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicialize o MapView e o GoogleMap
        mapView = findViewById(R.id.map)
        mapView.onCreate(savedInstanceState)
        mapView.getMapAsync { googleMap -> gmap = googleMap }

        val parqueDoPeao = LatLng(-48.6002142, -20.5095090)
        val barretosCountryHotel = LatLng(-48.587792, -20.575574)
        val pracaFranciscoBarreto = LatLng(-48.5695613, -20.5583946)


        val buttonParqueDoPeao = findViewById<Button>(R.id.btnParque)
        val buttonBarretosCountryHotel = findViewById<Button>(R.id.btnCountry)
        val buttonPracaFranciscoBarreto = findViewById<Button>(R.id.btnPraca)


        buttonParqueDoPeao.setOnClickListener {
            gmap.addMarker(MarkerOptions().position(parqueDoPeao).title("Parque do Peão"))
            gmap.moveCamera(CameraUpdateFactory.newLatLng(parqueDoPeao))
        }

        buttonBarretosCountryHotel.setOnClickListener {
            gmap.addMarker(MarkerOptions().position(barretosCountryHotel).title("Barretos Country Hotel"))
            gmap.moveCamera(CameraUpdateFactory.newLatLng(barretosCountryHotel))
        }

        buttonPracaFranciscoBarreto.setOnClickListener {
            gmap.addMarker(MarkerOptions().position(pracaFranciscoBarreto).title("Praça Francisco Barreto"))
            gmap.moveCamera(CameraUpdateFactory.newLatLng(pracaFranciscoBarreto))
        }
    }
}