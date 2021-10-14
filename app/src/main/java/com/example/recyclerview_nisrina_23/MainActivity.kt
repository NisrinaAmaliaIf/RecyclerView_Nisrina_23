package com.example.recyclerview_nisrina_23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE= "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val studentsList= listOf<Students>(
            Students(
                R.drawable.nisrina,
                "Nisrina Amalia Iffatunnisa",
                "Perempuan, Pelajar Jurusan RPL SMK Telkom Purwokerto Kelas XI RPL 6, Nomor Presensi 23"

            ),
            Students(
                R.drawable.tata,
                "Ananda Regita Cahyaningrum",
                "Perempuan, Pelajar Jurusan RPL SMK Telkom Purwokerto Kelas XI RPL 6, Nomor Presensi 03"
            ),
            Students(
                R.drawable.dika,
                "Andika Neviantoro",
                "Laki-Laki, Pelajar Jurusan RPL SMK Telkom Purwokerto Kelas XI RPL 6, Nomor Presensi 05"
            ),
            Students(
                R.drawable.ika,
                "Ika Fathisna Mutmainah",
                "Perempuan, Pelajar Jurusan RPL SMK Telkom Purwokerto Kelas XI RPL 6, Nomor Presensi 15"
            ),
            Students(
                R.drawable.meong1,
                "Miauwy si kucing rajin membaca",
                "Halo, namaku Miauwy pake kacamata, lucu kan"
            ),
            Students(
                R.drawable.meong2,
                "Meawy si kucing penasaran",
                "Halo, namaku Meawy sedang mengintip hihi"
            ),
            Students(
                R.drawable.meong3,
                "Brewny si kucing orens",
                "Halo, namaku Brewny pake topi gambar beruang, lucu kan"
            ),
            Students(
                R.drawable.meong4,
                "Wheety si kucing aktif",
                "Halo, namaku Wheety sedang mengintai mangsa, mataku bulat dan jernih lucu kan"
            ),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_students)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = StudentsAdapter(this,studentsList){
            val intent = Intent(this,DetailStudentsActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)
        }
    }
}