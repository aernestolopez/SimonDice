package com.example.simondice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bStart;
    int controlDificultad=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        bStart=findViewById(R.id.Start);
        //TranslationX
        //Objeto que necesitaremos para cualquier animación
        AnimatorSet animadorBoton=new AnimatorSet();
        //1.º Trasladar de una posición inicial (-800) a una final (donde estaba la vista)
        ObjectAnimator trasladar=ObjectAnimator.ofFloat(b1,"translationX",-800f,0f);
        //La animación durará 2.5 segundos
        trasladar.setDuration(2500);
        //Asociamos la animación con el AnimationSet
        animadorBoton.play(trasladar);
        //Lanzamos las animaciones asociadas al AnimationSet
        animadorBoton.start();

        //Trasladar y
        //1.º Trasladar de una posición inicial 500px hacia abajo
        ObjectAnimator trasladary=ObjectAnimator.ofFloat(b2,"translationY",500f,0f);
        //La animación durará 2.5 segundos
        trasladary.setDuration(2500);
        //Asociamos la animación con el AnimationSet
        animadorBoton.play(trasladary);
        //Lanzamos las animaciones asociadas al AnimationSet
        animadorBoton.start();

        //Rotation
        //Vuelta completa, 0 a 360º
        ObjectAnimator rotation=ObjectAnimator.ofFloat(b3,"rotation",0f,360f);
        //La animación durará 2.5 segundos
        rotation.setDuration(2500);
        //Asociamos la animación con el AnimationSet
        animadorBoton.play(rotation);
        //Lanzamos las animaciones asociadas al AnimationSet
        animadorBoton.start();

        //Rotacion X
        //Vuelta completa, 0 a 360º, respecto al ejeX
        ObjectAnimator rotationx=ObjectAnimator.ofFloat(b4,"rotationX",0f,360f);
        //La animación durará 5 segundos
        rotationx.setDuration(2500);
        //Asociamos la animación con el AnimationSet
        animadorBoton.play(rotationx);
        //Lanzamos las animaciones asociadas al AnimationSet
        animadorBoton.start();

        //Rotacion Y
        //Vuelta completa, 0 a 360º, respecto al ejeY
        ObjectAnimator rotationy=ObjectAnimator.ofFloat(b5,"rotationY",0f,360f);
        //La animación durará 2.5 segundos
        rotationy.setDuration(2500);
        //Asociamos la animación con el AnimationSet
        animadorBoton.play(rotationy);
        //Lanzamos las animaciones asociadas al AnimationSet
        animadorBoton.start();

        //Alpha
        // fade en 2.5 seg. De fade completo a vere como se vería normalmente.
        ObjectAnimator fade=ObjectAnimator.ofFloat(b6,"alpha",0f,1f);
        fade.setDuration(2500);
        //Asociamos la animación con el AnimationSet
        animadorBoton.play(fade);
        //Lanzamos las animaciones asociadas al AnimationSet
        animadorBoton.start();

        //Scale X
        //Escalado desde tamaño 0 al doble del tamaño inicial respecto al ejeX
        ObjectAnimator scaleX=ObjectAnimator.ofFloat(b7,"ScaleX",2f,1f);
        scaleX.setDuration(2500);
        //Asociamos la animación con el AnimationSet
        animadorBoton.play(scaleX);
        //Lanzamos las animaciones asociadas al AnimationSet
        animadorBoton.start();

        //Scale Y
        //Escalado desde tamaño 0 al doble tamaño inicial respecto al ejeY
        ObjectAnimator scaleY=ObjectAnimator.ofFloat(b8,"ScaleY",2f,1f);
        scaleY.setDuration(2500);
        //Asociamos la animación con el AnimationSet
        animadorBoton.play(scaleY);
        //Lanzamos las animaciones asociadas al AnimationSet
        animadorBoton.start();

        ObjectAnimator fade1=ObjectAnimator.ofFloat(b9,"alpha",0f,1f);
        fade1.setDuration(2500);
        //Asociamos la animación con el AnimationSet
        animadorBoton.play(fade1);
        //Lanzamos las animaciones asociadas al AnimationSet
        animadorBoton.start();


        //1.º Trasladar de una posición inicial (-800) a una final (donde estaba la vista)
        ObjectAnimator trasladar0=ObjectAnimator.ofFloat(b0,"translationX",-800f,0f);
        //La animación durará 5 segundos
        trasladar.setDuration(5000);

        //Vuelta completa, 0 a 360º, respecto al ejeX
        ObjectAnimator rotation0=ObjectAnimator.ofFloat(b0,"rotation",0f,360f);
        //La animación durará 5 segundos
        rotation.setDuration(5000);

        //Asociamos la animación con el AnimationSet
        animadorBoton.play(trasladar0).with(rotation0);
        //Lanzamos las animaciones asociadas al AnimationSet
        animadorBoton.start();


        ObjectAnimator trasladarS=ObjectAnimator.ofFloat(bStart,"translationX",-800f,0f);
        //La animación durará 5 segundos
        trasladar.setDuration(5000);

        //Vuelta completa, 0 a 360º, respecto al ejeX
        ObjectAnimator rotationS=ObjectAnimator.ofFloat(bStart,"rotation",0f,360f);
        //La animación durará 5 segundos
        rotation.setDuration(5000);

        // fade en 5 seg. De fade completo a vere como se vería normalmente.
        ObjectAnimator fadeS=ObjectAnimator.ofFloat(bStart,"alpha",0f,1f);
        fade.setDuration(5000);

        //Asociamos la animación con el AnimationSet
        animadorBoton.play(trasladarS).with(fadeS).before(rotationS);
        //Lanzamos las animaciones asociadas al AnimationSet
        animadorBoton.start();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menudificultad, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**
     * Creamos los casos para los diferentes items seleccionados
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int n=item.getItemId();
        switch(n){
            case R.id.facil:
                controlDificultad=0;
                System.out.println(controlDificultad);
                //recreate();
                return true;
            case R.id.dificil:
                controlDificultad=1;
                System.out.println(controlDificultad);

                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}