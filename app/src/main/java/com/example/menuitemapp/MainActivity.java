package com.example.menuitemapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //Overriding onCreateOptionsMenu to inflate my_menu (menu Directory)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflating my_menu with menu
        getMenuInflater().inflate(R.menu.my_menu,menu);
        // returning true
        return true;
    }

    //Handling onClick on my_menu items clicked
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Getting item's id in int variable
        int itemID = item.getItemId();

        //if-else=if for multiple menu items
        if (itemID == R.id.menu_search){
            //Toast message
            Toast.makeText(this, "Search Clicked", Toast.LENGTH_SHORT).show();
        } else if (itemID == R.id.menu_home) {
            //Toast message
            Toast.makeText(this, "Home Clicked", Toast.LENGTH_SHORT).show();
        }else {
            //Toast message
            Toast.makeText(this, "Nothing Selected", Toast.LENGTH_SHORT).show();
        }
        // returning items
       return super.onOptionsItemSelected(item);
    }
}