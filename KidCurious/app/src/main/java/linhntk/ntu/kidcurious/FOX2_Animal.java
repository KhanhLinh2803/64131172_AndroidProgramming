package linhntk.ntu.kidcurious;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FOX2_Animal extends AppCompatActivity {


    Button buttonYay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fox2_animal);


        buttonYay = findViewById(R.id.buttonYay);


        // Quay về MainActivity khi nhấn nút

        buttonYay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToMain = new Intent(FOX2_Animal.this, Animal.class);
                intentToMain.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(intentToMain);
                finish(); // Kết thúc RewardActivity để không bị quay lại
            }
        });
    }
}