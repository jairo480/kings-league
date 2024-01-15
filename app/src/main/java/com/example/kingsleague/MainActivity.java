package com.example.kingsleague;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.TextView;



import com.example.kingsleague.ui.menu.menuPantalla;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import com.example.kingsleague.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {

    private CalendarView calendarView;
    private ImageView imageView;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



     binding = ActivityMainBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home,R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }
    public void cuervos(View View){
        Intent siguiente = new Intent(this, cuervos.class);
        startActivity(siguiente);
    }
    public void parceros(View View){
        Intent parceros = new Intent(this, parceros.class);
        startActivity(parceros);
    }
    public void galacticos(View View){
        Intent siguiente = new Intent(this, galacticos.class);
        startActivity(siguiente);
    }
    public void aliens(View View){
        Intent aliens = new Intent(this, aliens.class);
        startActivity(aliens);
    }
    public void chamos(View View){
        Intent chamos = new Intent(this, chamos.class);
        startActivity(chamos);
    }
    public void muchachos(View View){
        Intent muchachos = new Intent(this, muchachos.class);
        startActivity(muchachos);
    }
    public void olimpo(View View){
        Intent siguiente = new Intent(this, olimpo.class);
        startActivity(siguiente);
    }
    public void peluche_caligari(View View){
        Intent siguiente = new Intent(this, peluche_caligari.class);
        startActivity(siguiente);
    }
    public void persas(View View){
        Intent siguiente = new Intent(this, persas.class);
        startActivity(siguiente);
    }
    public void raniza(View View){
        Intent siguiente = new Intent(this, raniza.class);
        startActivity(siguiente);
    }
    public void titan(View View){
        Intent siguiente = new Intent(this, titan.class);
        startActivity(siguiente);
    }
    public void west(View View){
        Intent siguiente = new Intent(this, west.class);
        startActivity(siguiente);
    }
     }