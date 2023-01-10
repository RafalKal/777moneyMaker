package com.example.a777moneymaker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.example.a777moneymaker.activities.AddExpenseActivity;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_wallet_activity);

        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);

        findViewById(R.id.imageMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        NavigationView navigationView = findViewById(R.id.navigationView);
        navigationView.setItemIconTintList(null);

        NavController navController = Navigation.findNavController(this, R.id.navHostFragment);
        NavigationUI.setupWithNavController(navigationView, navController);

    }

    public void addExpense(View view){
        Intent intent = new Intent(getApplicationContext(), AddExpenseActivity.class);
        startActivity(intent);
    }

    public void addIncome(View view){
        Intent intent = new Intent(getApplicationContext(), AddExpenseActivity.class);
        startActivity(intent);
    }

    public void show(View view){
        Intent intent = new Intent(getApplicationContext(), AddExpenseActivity.class);
        startActivity(intent);
    }
}