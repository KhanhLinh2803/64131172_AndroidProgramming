package linhntk.ntu.vd_btnnut;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public Button btnNut;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnNut = findViewById(R.id.btnNut);
        btnNut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chao ="xin chao";
                //int dodai = Toast.LENGTH_SHORT;
                //Toast chao1 =
                Toast.makeText(MainActivity.this, chao,Toast.LENGTH_SHORT).show();
                //chao1.show();
            }
        });
    }
}