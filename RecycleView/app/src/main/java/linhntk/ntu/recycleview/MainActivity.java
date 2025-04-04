package linhntk.ntu.recycleview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Adapterr chothen;
    ArrayList<LandScape> chothen2;
    RecyclerView rcv;
    Button btnChuyenMan;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        chothen2 = cloz();
        rcv = findViewById(R.id.rcv);
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this);
        rcv.setLayoutManager(layout);
        chothen = new Adapterr(this, chothen2);
        rcv.setAdapter(chothen);
        btnChuyenMan = findViewById(R.id.btnChuyenMan);

        btnChuyenMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyenman = new Intent(MainActivity.this, Ontao.class);
                startActivity(chuyenman);
            }
        });


    }
    ArrayList<LandScape> cloz(){
        ArrayList<LandScape> qq = new ArrayList<LandScape>();
        //khai bao mot class sau do nhap du lieu cho no
        LandScape loz = new LandScape("XIN CHAO CAC BAN", "z6323460198705_17f54e12443a9a8d0a2740ea2c80b4bc");
        qq.add(loz);
        return qq;
    }
}