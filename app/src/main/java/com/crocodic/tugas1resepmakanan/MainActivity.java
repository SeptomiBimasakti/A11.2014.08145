package com.crocodic.tugas1resepmakanan;

//Septomi Bimasakti A11.2014.08145

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<resep> resepList = new ArrayList<>();
    private RecyclerView recyclerView;
    private resepAdapter rAdapter;

    public static int tanda = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        rAdapter = new resepAdapter(resepList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(rAdapter);

        MenuClickRecyclerview.addTo(recyclerView).setOnItemClickListener(new MenuClickRecyclerview.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                tanda = position;
                Intent i = new Intent(MainActivity.this,ActDetail.class);
                startActivity(i);
            }
        });

        prepareresepData();
    }
    private void prepareresepData() {
        resep Resep1 = new resep("Ketela Balado",
                "Terbuat dari ketela pilihan."
                , R.drawable.telo
                , "Bahan :\n" +
                "3-4 Ketela Pohung\n" +
                "Bumbu Balado\n" +
                "Toples kosong\n" +
                "Minyak Goreng\n"
                , "Proses :\n" +
                "Kupas dan cuci ketela\n" +
                "Potong kecil-kecil sesuai selera\n" +
                "Rebus Ketela setengah matang\n" +
                "Tiriskan lalu goreng hingga kecoklatan\n" +
                "Angkat, masukkan kedalm toples dicampur bumbu lalu dikocok.");
        resepList.add(Resep1);

        resep Resep2 = new resep("Martabak Mie", "Terbuat dari bahan Indomie Instan.", R.drawable.mie, "Bahan :\n" +
                "1 Indomie\n" +
                "1 butir telur\n" +
                "Minyak goreng\n" +
                "Air\n", "Proses :\n" +
                "Rebus indomie hingga matang\n" +
                "Tiriskan lalu campurkan telur dan bumbu indomie kedalam mangkuk, lalu dikocok\n" +
                "Goreng hingga kecoklatan\n" +
                "Martabak mie siap disantap");
        resepList.add(Resep2);

        resep Resep3 = new resep("Sup Wortel", "Sop wortel adalah makanan khas Indonesia yang begitu segar.", R.drawable.sop, "Bahan :\n" +
                "3 wortel\n" +
                "2 buah kentang\n" +
                "1/4 daging sapi (bisa skip)\n" +
                "secukupnya garam\n" +
                "secukupnya merica\n" +
                "minyak goreng untuk menumis\n" +
                "Bumbu Halus :\n" +
                "2 bawang merah\n" +
                "1 bawang putih\n", "Proses :\n" +
                "Tumis bumbu halus sampai wangi\n" +
                "Masukkan merica dan garam\n" +
                "Rebus kentang, wortel dan daging\n" +
                "Masukkan bumbu tumis.\n" +
                "Nikmati selagi hangat");
        resepList.add(Resep3);

        resep Resep4 = new resep("Sayur Bening", "Makanan khas Indonesia yang sangat segar", R.drawable.bening, "Bahan :\n" +
                "1 sayur sawi/sayur bayam\n" +
                "1 bawang putih\n" +
                "2 bawang merah\n" +
                "Garam\n" +
                "1 laos\n", "Proses :\n" +
                "Cincang halus bawang putih,merah dan laos\n" +
                "Rebus air dan masukkan sayur\n" +
                "Masukkan bumbu\n" +
                "Tambahkan garam jika ingin asin\n" +
                "Sayur bening siap di hidangkan.");
        resepList.add(Resep4);

        resep Resep5 = new resep("Tempe Krispi", "Terbuat dari tempe pilihan yang berprotein tinggi.", R.drawable.tempe, "Bahan :\n" +
                "5-10 tempe\n" +
                "Tepung terigu\n" +
                "Tepung siap saji Indofood Tempe Krispi\n" +
                "1 daun bawang\n" +
                "Air secukupnya\n" +
                "Minyak goreng\n", "Proses :\n" +
                "Potong Tempe kecil-kecil\n" +
                "Campur tepung terigu dan tepung krispi dengan sedikit air. Aduk\n" +
                "Masukkan tempe kedalam adonan\n" +
                "Goreng hingga kecoklatan. Siap santap");
        resepList.add(Resep5);


        rAdapter.notifyDataSetChanged();
    }
}
