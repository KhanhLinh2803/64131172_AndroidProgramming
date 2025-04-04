package linhntk.ntu.copy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.khaibao> {
    Context ct;
    ArrayList<Item> ar;

    public adapter(Context ct, ArrayList<Item> ar) {
        this.ct = ct;
        this.ar = ar;
    }

    public Context getCt() {
        return ct;
    }

    public void setCt(Context ct) {
        this.ct = ct;
    }

    public ArrayList<Item> getAr() {
        return ar;
    }

    public void setAr(ArrayList<Item> ar) {
        this.ar = ar;
    }

    @NonNull
    @Override
    public khaibao onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layout = LayoutInflater.from(ct);
        View view1 = layout.inflate(R.layout.layoutitem,parent,false);
        khaibao kb = new khaibao(view1);
        return kb;
    }

    @Override
    public void onBindViewHolder(@NonNull khaibao holder, int position) {
        Item item = ar.get(position);
        String tde = item.getTieude();
        String lh = item.getLinkhinh();

        holder.txt1.setText(tde);
        String packname = ct.getPackageName();
        int idhinh = ct.getResources().getIdentifier(lh, "mipmap", packname);
        holder.img1.setImageResource(idhinh);
    }

    @Override
    public int getItemCount() {
        return (ar != null) ? ar.size() : 0;
    }

    public class khaibao extends RecyclerView.ViewHolder{
        TextView txt1;
        ImageView img1;
        public khaibao(@NonNull View itemView) {
            super(itemView);
            txt1 = itemView.findViewById(R.id.txtten);
            img1 = itemView.findViewById(R.id.imghinh);
        }
    }
}
