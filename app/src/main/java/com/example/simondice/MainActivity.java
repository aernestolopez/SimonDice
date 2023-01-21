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
    //Declaramos variables
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
        desactivarBotones();

        //Animacion de los botones

        AnimatorSet animadorBoton=new AnimatorSet();
        ObjectAnimator trasladar0=ObjectAnimator.ofFloat(b0,"translationX",800f,0f);
        trasladar0.setDuration(2500);
        animadorBoton.play(trasladar0);
        animadorBoton.start();

        ObjectAnimator trasladar=ObjectAnimator.ofFloat(b1,"translationX",-800f,0f);
        trasladar.setDuration(2500);
        animadorBoton.play(trasladar);
        animadorBoton.start();

        ObjectAnimator trasladary=ObjectAnimator.ofFloat(b2,"translationY",500f,0f);
        trasladary.setDuration(2500);
        animadorBoton.play(trasladary);
        animadorBoton.start();

        ObjectAnimator fade2=ObjectAnimator.ofFloat(b3,"alpha",0f,1f);
        fade2.setDuration(2500);
        animadorBoton.play(fade2);
        animadorBoton.start();

        ObjectAnimator trasladar1=ObjectAnimator.ofFloat(b4,"translationX",-800f,0f);
        trasladar1.setDuration(2500);
        animadorBoton.play(trasladar1);
        animadorBoton.start();

        ObjectAnimator trasladary1=ObjectAnimator.ofFloat(b5,"translationY",500f,0f);
        trasladary1.setDuration(2500);
        animadorBoton.play(trasladary1);
        animadorBoton.start();

        ObjectAnimator fade=ObjectAnimator.ofFloat(b6,"alpha",0f,1f);
        fade.setDuration(2500);
        animadorBoton.play(fade);
        animadorBoton.start();

        ObjectAnimator trasladar2=ObjectAnimator.ofFloat(b7,"translationX",-800f,0f);
        trasladar2.setDuration(2500);
        animadorBoton.play(trasladar2);
        animadorBoton.start();

        ObjectAnimator trasladary2=ObjectAnimator.ofFloat(b8,"translationY",500f,0f);
        trasladary2.setDuration(2500);
        animadorBoton.play(trasladary2);
        animadorBoton.start();

        ObjectAnimator fade1=ObjectAnimator.ofFloat(b9,"alpha",0f,1f);
        fade1.setDuration(2500);
        animadorBoton.play(fade1);
        animadorBoton.start();
        //Si inicia la partida sin elegir dificultad se inicia en la dificultad facil
        bStart.setOnClickListener(this::iniciarJuego);
    }
    //Inflamos el menu
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
                bStart.setOnClickListener(this::iniciarJuego);
                return true;
            case R.id.dificil:
                controlD=1;
                bStart.setOnClickListener(this::iniciarJuego);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Metodo para desactivar los botones
     */
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

    /**
     * Metodo para activar los botones
     */
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

    /**
     * Metodo para iniciar el juego
     * @param v
     */
    public void iniciarJuego(View v) {
        desactivarBotones();
        numeroRecordar="";
        agregarUnNumeroAlFinal();
        tv1.setText("Puntuacion: "+ (numeroRecordar.length()-1));
        numeroJugador="";
        emitirSonido(0, controlD);
    }

    /**
     * Metodo para agregar un numero al final
     */
    private void agregarUnNumeroAlFinal() {
        //Tomamos un numero aleatorio del 0 al 9 y con el switch lo añadimos al numero a recordar
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
    }

    /**
     * Metodo para comprobar si los botones pulsados coinciden con los que se han dicho
     */
    private void controlarSiEsCorrecto() {
        if (numeroJugador.charAt(numeroJugador.length()-1)!=numeroRecordar.charAt(numeroJugador.length()-1)) {
            Toast.makeText(this,"Perdiste",Toast.LENGTH_LONG).show();
            desactivarBotones();
        }
        else if (numeroJugador.length()==numeroRecordar.length()) {
            desactivarBotones();
            numeroJugador="";
            agregarUnNumeroAlFinal();
            emitirSonido(0, controlD);
            tv1.setText("Puntuacion: " + (numeroRecordar.length()-1));
        }
    }

    //Metodos de los botones
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

    /**
     * Metodo que se encarga de reproducir el sonido dependiendo del numero aleatorio tomado
     * @param posicion
     * @param control variable que se utiliza como control de dificultad para elegir que set de audios usar
     */
   private void emitirSonido(int posicion, int control) {
        if (mp1!=null)
            mp1.release();
        if (control==0) {
            if (numeroRecordar.charAt(posicion) == '0')
                mp1 = MediaPlayer.create(this, R.raw.cero);
            if (numeroRecordar.charAt(posicion) == '1')
                mp1 = MediaPlayer.create(this, R.raw.uno);
            if (numeroRecordar.charAt(posicion) == '2')
                mp1 = MediaPlayer.create(this, R.raw.dos);
            if (numeroRecordar.charAt(posicion) == '3')
                mp1 = MediaPlayer.create(this, R.raw.tres);
            if (numeroRecordar.charAt(posicion) == '4')
                mp1 = MediaPlayer.create(this, R.raw.cuatro);
            if (numeroRecordar.charAt(posicion) == '5')
                mp1 = MediaPlayer.create(this, R.raw.cinco);
            if (numeroRecordar.charAt(posicion) == '6')
                mp1 = MediaPlayer.create(this, R.raw.seis);
            if (numeroRecordar.charAt(posicion) == '7')
                mp1 = MediaPlayer.create(this, R.raw.siete);
            if (numeroRecordar.charAt(posicion) == '8')
                mp1 = MediaPlayer.create(this, R.raw.ocho);
            if (numeroRecordar.charAt(posicion) == '9')
                mp1 = MediaPlayer.create(this, R.raw.nueve);
        }else{
            if (numeroRecordar.charAt(posicion) == '0')
                mp1 = MediaPlayer.create(this, R.raw.cerod);
            if (numeroRecordar.charAt(posicion) == '1')
                mp1 = MediaPlayer.create(this, R.raw.unod);
            if (numeroRecordar.charAt(posicion) == '2')
                mp1 = MediaPlayer.create(this, R.raw.dosd);
            if (numeroRecordar.charAt(posicion) == '3')
                mp1 = MediaPlayer.create(this, R.raw.tresd);
            if (numeroRecordar.charAt(posicion) == '4')
                mp1 = MediaPlayer.create(this, R.raw.cuatrod);
            if (numeroRecordar.charAt(posicion) == '5')
                mp1 = MediaPlayer.create(this, R.raw.cincod);
            if (numeroRecordar.charAt(posicion) == '6')
                mp1 = MediaPlayer.create(this, R.raw.seisd);
            if (numeroRecordar.charAt(posicion) == '7')
                mp1 = MediaPlayer.create(this, R.raw.sieted);
            if (numeroRecordar.charAt(posicion) == '8')
                mp1 = MediaPlayer.create(this, R.raw.ochod);
            if (numeroRecordar.charAt(posicion) == '9')
                mp1 = MediaPlayer.create(this, R.raw.nueved);
        }
        mp1.start();
        mp1.setOnCompletionListener(mp -> {
            if (posicion<numeroRecordar.length()-1) {
                emitirSonido(posicion+1, controlD);
            }else
                activarBotones();
        });
    }

    /**
     * Se liberan recursos no necesarios
     */
    @Override
    protected void onStop() {
        super.onStop();
        if (mp1!=null)
        {
            mp1.release();
            mp1=null;
        }
    }
}
