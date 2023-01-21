package com.example.simondice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int controlD=0;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bStart;
    String numeroRecordar;
    String numeroJugador;
    TextView tv1;
    MediaPlayer mp1;
    Random rnd=new Random();

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
        tv1=findViewById(R.id.textView);

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
        trasladar.setDuration(2500);
        //Vuelta completa, 0 a 360º, respecto al ejeX
        ObjectAnimator rotation0=ObjectAnimator.ofFloat(b0,"rotation",0f,360f);
        //La animación durará 5 segundos
        rotation.setDuration(2500);
        //Asociamos la animación con el AnimationSet
        animadorBoton.play(trasladar0).with(rotation0);
        //Lanzamos las animaciones asociadas al AnimationSet
        animadorBoton.start();
        ObjectAnimator trasladarS=ObjectAnimator.ofFloat(bStart,"translationX",-800f,0f);
        //La animación durará 5 segundos
        trasladar.setDuration(2500);
        //Vuelta completa, 0 a 360º, respecto al ejeX
        ObjectAnimator rotationS=ObjectAnimator.ofFloat(bStart,"rotation",0f,360f);
        //La animación durará 5 segundos
        rotation.setDuration(2500);
        // fade en 5 seg. De fade completo a vere como se vería normalmente.
        ObjectAnimator fadeS=ObjectAnimator.ofFloat(bStart,"alpha",0f,1f);
        fade.setDuration(2500);
        //Asociamos la animación con el AnimationSet
        animadorBoton.play(trasladarS).with(fadeS).before(rotationS);
        //Lanzamos las animaciones asociadas al AnimationSet
        animadorBoton.start();
        bStart.setOnClickListener(view -> {
            iniciarJuego(view);
        });
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
                controlD=0;
                bStart.setOnClickListener(view -> {
                    System.out.println("funca");
                    iniciarJuego(view);
                });
                return true;
            case R.id.dificil:
                controlD=1;
                bStart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        System.out.println("no funca" + controlD);
                    }
                });
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void desactivarBotones(){
        b0.setEnabled(false);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
    }
    public void activarBotones(){
        b0.setEnabled(true);
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
    }
    public void iniciarJuego(View v)
    {
        desactivarBotones();
        activarBotones();
        numeroRecordar="";
        agregarUnNumeroAlFinal();
        tv1.setText("Puntuacion: "+ (numeroRecordar.length()-1));
        numeroJugador="";
        emitirSonido(0);
    }

    private void agregarUnNumeroAlFinal() {
        int ale= rnd.nextInt(10);
        switch (ale) {
            case 0:
                numeroRecordar = numeroRecordar + "0";
                break;
            case 1:
                numeroRecordar = numeroRecordar + "1";
                break;
            case 2:
                numeroRecordar = numeroRecordar + "2";
                break;
            case 3:
                numeroRecordar = numeroRecordar + "3";
                break;
            case 4:
                numeroRecordar = numeroRecordar + "4";
                break;
            case 5:
                numeroRecordar = numeroRecordar + "5";
                break;
            case 6:
                numeroRecordar = numeroRecordar + "6";
                break;
            case 7:
                numeroRecordar = numeroRecordar + "7";
                break;
            case 8:
                numeroRecordar = numeroRecordar + "8";
                break;
            case 9:
                numeroRecordar = numeroRecordar + "9";
                break;
        }
        System.out.println(numeroRecordar);
    }

    private void controlarSiEsCorrecto() {
        if (numeroJugador.charAt(numeroJugador.length()-1)!=numeroRecordar.charAt(numeroJugador.length()-1))
        {
            Toast.makeText(this,"Perdiste",Toast.LENGTH_LONG).show();
            System.out.println("numero:" + numeroJugador);
            desactivarBotones();
        }
        else
        if (numeroJugador.length()==numeroRecordar.length())
        {
            desactivarBotones();
            numeroJugador="";
            agregarUnNumeroAlFinal();
            emitirSonido(0);
            tv1.setText("Puntuacion: " + (numeroRecordar.length()-1));
            activarBotones();
        }
    }

    // TODO: 21/1/23 Cambiar a metodo estandar con view.getid
    public void presionBoton0(View v)
    {
        numeroJugador=numeroJugador+"0";
        controlarSiEsCorrecto();
    }
    public void presionBoton1(View v)
    {
        numeroJugador=numeroJugador+"1";
        controlarSiEsCorrecto();
    }
    public void presionBoton2(View v)
    {
        numeroJugador=numeroJugador+"2";
        controlarSiEsCorrecto();
    }
    public void presionBoton3(View v)
    {
        numeroJugador=numeroJugador+"3";
        controlarSiEsCorrecto();
    }
    public void presionBoton4(View v)
    {
        numeroJugador=numeroJugador+"4";
        controlarSiEsCorrecto();
    }
    public void presionBoton5(View v)
    {
        numeroJugador=numeroJugador+"5";
        controlarSiEsCorrecto();
    }
    public void presionBoton6(View v)
    {
        numeroJugador=numeroJugador+"6";
        controlarSiEsCorrecto();
    }
    public void presionBoton7(View v)
    {
        numeroJugador=numeroJugador+"7";
        controlarSiEsCorrecto();
    }
    public void presionBoton8(View v)
    {
        numeroJugador=numeroJugador+"8";
        controlarSiEsCorrecto();
    }
    public void presionBoton9(View v)
    {
        numeroJugador=numeroJugador+"9";
        controlarSiEsCorrecto();
    }

   private void emitirSonido(int posicion) {
        if (mp1!=null)
            mp1.release();
        if(numeroRecordar.charAt(posicion)=='0')
            mp1=MediaPlayer.create(this,R.raw.cero);
        if(numeroRecordar.charAt(posicion)=='1')
            mp1=MediaPlayer.create(this,R.raw.uno);
        if(numeroRecordar.charAt(posicion)=='2')
            mp1=MediaPlayer.create(this,R.raw.dos);
        if(numeroRecordar.charAt(posicion)=='3')
            mp1=MediaPlayer.create(this,R.raw.tres);
        if(numeroRecordar.charAt(posicion)=='4')
            mp1=MediaPlayer.create(this,R.raw.cuatro);
        if(numeroRecordar.charAt(posicion)=='5')
            mp1=MediaPlayer.create(this,R.raw.cinco);
        if(numeroRecordar.charAt(posicion)=='6')
            mp1=MediaPlayer.create(this,R.raw.seis);
        if(numeroRecordar.charAt(posicion)=='7')
            mp1=MediaPlayer.create(this,R.raw.siete);
        if(numeroRecordar.charAt(posicion)=='8')
            mp1=MediaPlayer.create(this,R.raw.ocho);
        if(numeroRecordar.charAt(posicion)=='9')
            mp1=MediaPlayer.create(this,R.raw.nueve);
        mp1.start();
        mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if (posicion<numeroRecordar.length()-1)
                {
                    emitirSonido(posicion+1);
                }
                else
                    activarBotones();
            }
        });

    }
}