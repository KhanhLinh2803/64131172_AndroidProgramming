package linhntk.ntu.ex_224;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tim
        bottomNa = findViewById(R.id.bot_menu);
        //lang nghe
        bottomNa.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int menuItemID = item.getItemId();
                if (menuItemID == R.id.navHome){
                    Intent home = new Intent(MainActivity.this, HomeFragment.class);
                        startActivities(home);}
                else if
                    (menuItemID == R.id.navSearch)
                    Toast.makeText(MainActivity.this, "Thay Search", Toast.LENGTH_SHORT).show();
                else if
                    (menuItemID == R.id.navProfile)
                    Toast.makeText(MainActivity.this, "Thay Profile", Toast.LENGTH_SHORT).show();
                else return false;
                return true;
            }
        });

    }

    private void startActivities(Intent home) {
    }
}