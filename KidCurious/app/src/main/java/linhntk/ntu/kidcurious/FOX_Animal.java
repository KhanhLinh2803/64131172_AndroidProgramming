package linhntk.ntu.kidcurious;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FOX_Animal extends AppCompatActivity {
    Button btnX1, btnD1, btna1;
    EditText edta1;
    private final String correctAnswer = "PIG";
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fox_animal);

        btnD1 = findViewById(R.id.btnD1);
        btnX1 = findViewById(R.id.btnX1);
        edta1 = findViewById(R.id.edta1);
        btna1 = findViewById(R.id.btna1);
        edta1.setText("");
        edta1.setKeyListener(null);

        btnX1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnx1 = new Intent(FOX_Animal.this, Animal.class);
                startActivity(btnx1);
            }
        });
        btnD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnd1 = new Intent(FOX_Animal.this, FOX1_Animal.class);
                startActivity(btnd1);
            }
        });

        // 2. Thiết lập sự kiện chung cho các nút chữ cái
        View.OnClickListener ThemChu = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b = (Button) v;
                // Thêm chữ của nút được bấm vào ô EditText
                edta1.append(b.getText().toString());
            }
        };

        findViewById(R.id.buttonP).setOnClickListener(ThemChu);  // P
        findViewById(R.id.buttonI).setOnClickListener(ThemChu); // I
        findViewById(R.id.buttonG).setOnClickListener(ThemChu); // G
        findViewById(R.id.buttonF).setOnClickListener(ThemChu); // F
        findViewById(R.id.buttonJ).setOnClickListener(ThemChu); // J
        findViewById(R.id.buttonO).setOnClickListener(ThemChu); // O
        findViewById(R.id.buttonX).setOnClickListener(ThemChu); // X

        btna1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userAnswer = edta1.getText().toString().trim();

                // So sánh câu trả lời (không phân biệt chữ hoa/thường)
                if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                    // Nếu ĐÚNG
                    Toast.makeText(FOX_Animal.this, "GOOD JOB!", Toast.LENGTH_SHORT).show();

                    Intent intent1 = new Intent(FOX_Animal.this, FOX2_Animal.class);
                    startActivity(intent1);

                } else {
                    // Nếu SAI`
                    //Nếu bạn muốn chuyển sang màn hình báo sai:**
                    Toast.makeText(FOX_Animal.this, "TRY AGAIN!", Toast.LENGTH_SHORT).show();
                    edta1.setText("");
                }
            }
        });
    }
}