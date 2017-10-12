package com.crocodic.tugas1resepmakanan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ActDetail extends AppCompatActivity {

    TextView title, description, ingredients, procedure;
    ImageView iv_gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_detail);

        title = (TextView)findViewById(R.id.title);
        description = (TextView) findViewById(R.id.description);
        ingredients = (TextView) findViewById(R.id.ingredients);
        procedure = (TextView) findViewById(R.id.procedure);
        iv_gambar = (ImageView) findViewById(R.id.gambar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.back));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        title.setText(MainActivity.resepList.get(MainActivity.tanda).getTitle());
        description.setText(MainActivity.resepList.get(MainActivity.tanda).getDescription());
        ingredients.setText(MainActivity.resepList.get(MainActivity.tanda).getIngredients());
        procedure.setText(MainActivity.resepList.get(MainActivity.tanda).getProcedure());
        iv_gambar.setImageResource(MainActivity.resepList.get(MainActivity.tanda).getGambar());
    }
}
