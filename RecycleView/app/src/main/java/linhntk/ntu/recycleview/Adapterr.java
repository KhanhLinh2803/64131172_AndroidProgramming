package linhntk.ntu.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapterr extends RecyclerView.Adapter<Adapterr.Batky> {

    Context context;
    ArrayList<LandScape> cc;

    public Adapterr(Context context, ArrayList<LandScape> cc) {
        this.context = context;
        this.cc = cc;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public ArrayList<LandScape> getCc() {
        return cc;
    }

    public void setCc(ArrayList<LandScape> cc) {
        this.cc = cc;
    }

    @NonNull
    @Override
    public Batky onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater dm = LayoutInflater.from(context);
        View vRecycle = dm.inflate(R.layout.recycle, parent, false);
        Batky holder = new Batky(vRecycle);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Batky holder, int position) {
        //lấy đối tượng hiển thị
        LandScape hienthi = cc.get(position);
        String caption = hienthi.getTen();
        String hinhanh = hienthi.getLinkhinh();
        holder.Ten.setText(caption);
        //laays anhr
        String packpageName = holder.itemView.getContext().getPackageName();
        int packerhinh = holder.itemView.getResources().getIdentifier(hinhanh, "mipmap", packpageName);
        holder.Hinh.setImageResource(packerhinh);
    }

    @Override
    public int getItemCount() {
        return cc.size();
    }

    class Batky extends RecyclerView.ViewHolder{
        TextView Ten;
        ImageView Hinh;

        public Batky(@NonNull View itemView) {
            super(itemView);
            Ten = itemView.findViewById(R.id.txt);
            Hinh = itemView.findViewById(R.id.img);
        }
    }
}
