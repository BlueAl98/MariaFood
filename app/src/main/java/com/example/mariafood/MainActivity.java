package com.example.mariafood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    private EditText txburro, txham, txtor, txmega, txtacos, txhot, txsincro, txincroburguer;

    private ImageButton bburritos, bham, btor, bmega, btaco, bhot, bsincro, bsincroburguer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int nightModeFlags = getApplicationContext().getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
        switch (nightModeFlags) {
            case Configuration.UI_MODE_NIGHT_YES:
                /* si esta activo el modo oscuro lo desactiva */
                AppCompatDelegate.setDefaultNightMode(
                        AppCompatDelegate.MODE_NIGHT_NO);
                break;
        }



        txburro = findViewById(R.id.txtBurro);
        txham = findViewById(R.id.txtHamburguesa);
        txtor = findViewById(R.id.txttorta);
        txmega = findViewById(R.id.txtmega);
        txtacos = findViewById(R.id.txttacos);
        txhot = findViewById(R.id.txthot);
        txsincro =  findViewById(R.id.txtsincro);
        txincroburguer = findViewById(R.id.txtSincroburguer);


        bburritos =  findViewById(R.id.bburritos);
        bham = findViewById(R.id.bhamburguesa);
        btor = findViewById(R.id.btorta);
        bmega = findViewById(R.id.bmega);
        btaco = findViewById(R.id.btacos);
        bhot = findViewById(R.id.bhot);
        bsincro = findViewById(R.id.sincro);
        bsincroburguer = findViewById(R.id.sincroburguer);













        bburritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String burros = txburro.getText().toString().trim();

                if (TextUtils.isEmpty(burros)){
                    txburro.setText("0");
                }else{




                String burroTx =  txburro.getText().toString();

                int burroInt =  Integer.parseInt(burroTx);

                int suma = burroInt + 1;

                String burroFinal = String.valueOf(suma);

                txburro.setText(burroFinal);
                }
            }
        });

        bham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String hambur = txham.getText().toString().trim();



                if (TextUtils.isEmpty(hambur)){
                    txham.setText("0");
                }else {


                    String burroTx = txham.getText().toString();

                    int burroInt = Integer.parseInt(burroTx);

                    int suma = burroInt + 1;

                    String burroFinal = String.valueOf(suma);

                    txham.setText(burroFinal);
                }
            }
        });

        btor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String torta = txtor.getText().toString().trim();



                if (TextUtils.isEmpty(torta)){
                    txtor.setText("0");
                }else {

                    String burroTx = txtor.getText().toString();

                    int burroInt = Integer.parseInt(burroTx);

                    int suma = burroInt + 1;

                    String burroFinal = String.valueOf(suma);

                    txtor.setText(burroFinal);
                }
            }
        });

        bmega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String mega = txmega.getText().toString().trim();

                if (TextUtils.isEmpty(mega)){
                    txmega.setText("0");
                }else {


                    String burroTx = txmega.getText().toString();

                    int burroInt = Integer.parseInt(burroTx);

                    int suma = burroInt + 1;

                    String burroFinal = String.valueOf(suma);

                    txmega.setText(burroFinal);
                }
            }
        });


        btaco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String tacos = txtacos.getText().toString().trim();

                if (TextUtils.isEmpty(tacos)){
                    txtacos.setText("0");
                }else {

                    String burroTx = txtacos.getText().toString();

                    int burroInt = Integer.parseInt(burroTx);

                    int suma = burroInt + 1;

                    String burroFinal = String.valueOf(suma);

                    txtacos.setText(burroFinal);
                }
            }
        });

        bhot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String hot = txhot.getText().toString().trim();

                if (TextUtils.isEmpty(hot)){
                    txhot.setText("0");
                }else {

                    String burroTx = txhot.getText().toString();

                    int burroInt = Integer.parseInt(burroTx);

                    int suma = burroInt + 1;

                    String burroFinal = String.valueOf(suma);

                    txhot.setText(burroFinal);
                }
            }
        });



        bsincro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String hot = txsincro.getText().toString().trim();

                if (TextUtils.isEmpty(hot)){
                    txsincro.setText("0");
                }else {

                    String burroTx = txsincro.getText().toString();

                    int burroInt = Integer.parseInt(burroTx);

                    int suma = burroInt + 1;

                    String burroFinal = String.valueOf(suma);

                    txsincro.setText(burroFinal);
                }
            }
        });



        bsincroburguer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String hot = txincroburguer.getText().toString().trim();

                if (TextUtils.isEmpty(hot)){
                    txincroburguer.setText("0");
                }else {

                    String burroTx = txincroburguer.getText().toString();

                    int burroInt = Integer.parseInt(burroTx);

                    int suma = burroInt + 1;

                    String burroFinal = String.valueOf(suma);

                    txincroburguer.setText(burroFinal);
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        // SparseBooleanArray checked = listV.getCheckedItemPositions();



        switch (item.getItemId()){
            case R.id.barCobrar: {

                String tacos = txtacos.getText().toString().trim();
                String burros = txburro.getText().toString().trim();
                String torta = txtor.getText().toString().trim();
                String mega = txmega.getText().toString().trim();
                String hot = txhot.getText().toString().trim();
                String hambur = txham.getText().toString().trim();
                String sincro = txsincro.getText().toString().trim();
                String sincroburguer = txincroburguer.getText().toString().trim();


                if (TextUtils.isEmpty(tacos) || TextUtils.isEmpty(burros) || TextUtils.isEmpty(torta) || TextUtils.isEmpty(mega) || TextUtils.isEmpty(hot) || TextUtils.isEmpty(sincro)||  TextUtils.isEmpty(sincroburguer) ||TextUtils.isEmpty(hambur)) {
                    Toast.makeText(this, "ingrese todos los campos", Toast.LENGTH_LONG).show();

                } else {


                    int numTacos = Integer.parseInt(tacos);
                    int numburros = Integer.parseInt(burros);
                    int numtorta = Integer.parseInt(torta);
                    int nummega = Integer.parseInt(mega);
                    int numhot = Integer.parseInt(hot);
                    int numham = Integer.parseInt(hambur);
                    int numsin = Integer.parseInt(sincro);
                    int numsincroburguer = Integer.parseInt(sincroburguer);



                    int cBurro = 18;
                    int cham = 40;
                    int ctorta = 40;
                    int cmega = 60;
                    int chot = 15;
                    int csincro = 25;
                    int csincroburguer = 30 ;


                    int cuenta = (cBurro * numburros) + (numTacos) + (ctorta * numtorta) + (cmega * nummega) + (chot * numhot) + (cham * numham) +
                            (csincro * numsin) + (csincroburguer * numsincroburguer)  ;


                    final EditText input = new EditText(MainActivity.this);
                    input.setText("0");
                    input.setInputType(InputType.TYPE_CLASS_NUMBER);
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Ingrese extras si hay:");

                    builder.setView(input);

                    builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            String extras = input.getText().toString().trim();

                            if (TextUtils.isEmpty(extras) ) {
                                Toast.makeText(MainActivity.this, "ingrese todos los campos", Toast.LENGTH_LONG).show();

                            }else{


                                int intExtras = Integer.parseInt(extras);

                                int finalCuenta =  cuenta+intExtras;





                                calculoF(finalCuenta);





                                txburro.setText("0");
                                txham.setText("0");
                                txtor.setText("0");
                                txmega.setText("0");
                                txtacos.setText("0");
                                txhot.setText("0");
                                txsincro.setText("0");
                                txincroburguer.setText("0");

                            }



                        }
                    });

                    AlertDialog dialog = builder.create();
                    dialog.show();


                }

            }
            break;
        }




        return true;
    }


    public void calculoF(int cuenta){

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("El pago es de: ");
       alert.setMessage(""+cuenta);
       alert.setPositiveButton("Aceptar", null);

        AlertDialog dialog = alert.create();
        dialog.show();

    }



}