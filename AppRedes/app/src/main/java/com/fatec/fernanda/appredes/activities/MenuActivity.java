package com.fatec.fernanda.appredes.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.fatec.fernanda.appredes.R;
import com.fatec.fernanda.appredes.domain.Usuario;

public class MenuActivity extends AppCompatActivity {

    Usuario user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Bundle extras = getIntent().getExtras();
        user = extras.getParcelable("usuario");

        final TextView txtConteudos = (TextView) findViewById(R.id.conteudosLink);
        final TextView txtTestes = (TextView) findViewById(R.id.testesLink);
        final TextView txtRevisoes = (TextView) findViewById(R.id.revisoesLink);

        txtConteudos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuConteudosIntent = new Intent(MenuActivity.this, MenuConteudosActivity.class);
                MenuActivity.this.startActivity(menuConteudosIntent);
            }
        });

        txtTestes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
         //       Intent menuTestesIntent = new Intent(MenuActivity.this, MenuTestesActivity.class);
         //       MenuActivity.this.startActivity(menuTestesIntent);

            }
        });

        txtRevisoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        //        Intent menuRevisoesIntent = new Intent(MenuActivity.this, MenuRevisoesActivity.class);
        //        MenuActivity.this.startActivity(menuRevisoesIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu, this adds items to the action baf if it is present
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*
        Handle action bar item clicks here. The action bar will
        automatically handle clicks on the Home/Up button,
        so long as you specify activity in AndroidManifest.xml
        */

        int id = item.getItemId();

        switch(id){
            case R.id.perfilLink:
                Intent perfilIntent = new Intent(MenuActivity.this, PerfilActivity.class);
                perfilIntent.putExtra("usuario", user);

                MenuActivity.this.startActivity(perfilIntent);
                return true;
            case R.id.tutorialLink:

            case R.id.sistemaLink:

            case R.id.logoutLink:

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}