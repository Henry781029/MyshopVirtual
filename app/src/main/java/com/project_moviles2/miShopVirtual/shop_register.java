package com.project_moviles2.miShopVirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class shop_register extends AppCompatActivity {

    TextView jtvmensaje2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_register);

        getSupportActionBar().hide();

        jtvmensaje2=findViewById(R.id.tvmensaje2);




        Animation animation1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.desplazamiento_abajo);

        jtvmensaje2.setAnimation(animation1);

    }
    public void Back (View view){

        Intent intent= new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);

    }
}