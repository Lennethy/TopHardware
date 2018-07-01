package adapters;

import entities.*;
import pooa20181.iff.edu.br.tophardware.R;

import java.util.*;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.*;
import android.content.*;
import android.widget.*;

public class GpuListAdapter extends ArrayAdapter<Gpus>{

    private Context context;
    private List<Gpus> gpus;
    public GpuListAdapter(Context context, List<Gpus> gpus){
        super(context, R.layout.gpu_list_layout, gpus);
        this.context = context;
        this.gpus = gpus;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.gpu_list_layout, parent, false);
        ImageView imageViewPhoto = view.findViewById(R.id.img7700k);
        imageViewPhoto.setImageResource(gpus.get(position).getFoto());
        TextView textViewmodelo = view.findViewById(R.id.txmodelo1070);
        textViewmodelo.setText(gpus.get(position).getModelo());
        TextView textViewmemoria = view.findViewById(R.id.txmemoria1070);
        textViewmemoria.setText(gpus.get(position).getMemoria());
        TextView textViewpreco = view.findViewById(R.id.txpreco1070);
        textViewpreco.setText (String.valueOf(gpus.get(position).getPreco()));

        return view;
    }
}
