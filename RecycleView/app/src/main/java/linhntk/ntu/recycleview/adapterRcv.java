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

public class adapterRcv extends RecyclerView.Adapter<adapterRcv.Batky2> {
    Context context2;
    ArrayList<Thuoctinh> arrayList;

    public adapterRcv(Context context, ArrayList<Thuoctinh> arrayList) {
        this.context2 = context;
        this.arrayList = arrayList;
    }

    public ArrayList<Thuoctinh> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Thuoctinh> arrayList) {
        this.arrayList = arrayList;
    }

    public Context getContext() {
        return context2;
    }

    public void setContext(Context context) {
        this.context2 = context;
    }

    @NonNull
    @Override
    public Batky2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layout1 = LayoutInflater.from(context2);
        View view1 = layout1.inflate(R.layout.recycle, parent, false);
        Batky2 holder1 = new Batky2(view1);
        return holder1;
    }

    @Override
    public void onBindViewHolder(@NonNull Batky2 holder, int position) {
    Thuoctinh hienthi2 = arrayList.get(position);
    String caption2 = hienthi2.getTen1();
    String hinhanh2 = hienthi2.getHinh();
    holder.text.setText(caption2);
    String pck = holder.itemView.getContext().getPackageName();
    int pckhinh = holder.itemView.getResources().getIdentifier(hinhanh2,"mipmap",pck);
    holder.image.setImageResource(pckhinh);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class Batky2 extends RecyclerView.ViewHolder{
        TextView text;
        ImageView image;

        public Batky2(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.txtcaption);
            image = itemView.findViewById(R.id.imageView3);
        }
    }
}
