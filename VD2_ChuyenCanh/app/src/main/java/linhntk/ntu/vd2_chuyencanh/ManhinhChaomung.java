package linhntk.ntu.vd2_chuyencanh;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ManhinhChaomung extends AppCompatActivity {
    private TextView txtChaomung;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_manhinh_chaomung);
        txtChaomung = findViewById(R.id.txtChaomung);
        String tenDn = getIntent().getStringExtra("123");
        txtChaomung.setText("Chào Mừng " + tenDn);

    }
}