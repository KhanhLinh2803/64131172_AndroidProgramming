package linhntk.ntu.lt_gk;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Cau4 extends AppCompatActivity {
    ImageView imgHomeavt;
    Button btnFB, btnZalo;
    TextView txtHoten, txtSothich;
    ListView lvSothich;
    ArrayList<String> sothich = new ArrayList<String>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau4);
        imgHomeavt = findViewById(R.id.imgHomeavt);
        btnFB = findViewById(R.id.btnFB);
        btnZalo = findViewById(R.id.btnZalo);
        txtHoten = findViewById(R.id.txtHoten);
        txtSothich = findViewById(R.id.txtSothich);
        lvSothich = findViewById(R.id.lvSothich);

        sothich.add("Nghe và chill theo nhạc");
        sothich.add("Xem và vẻ truyện tranh");
        sothich.add("Ngủ (Sít rịt)");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sothich);
        lvSothich.setAdapter(adapter);
        lvSothich.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String output = sothich.get(position);
                Toast.makeText(Cau4.this, output, Toast.LENGTH_SHORT).show();
            }
        });

        imgHomeavt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent avt = new Intent(Cau4.this, MainActivity.class);
                startActivity(avt);
            }
        });
        btnFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String facebookUrl = "https://www.facebook.com/taihuong.jung";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl));
                startActivity(intent);
            }
        });
        btnZalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String acc = "0333097243";
                Toast.makeText(Cau4.this, acc, Toast.LENGTH_SHORT).show();
            }
        });
    }
}