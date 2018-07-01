package adapters;

import entities.*;
import pooa20181.iff.edu.br.tophardware.R;

import java.util.*;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.*;
import android.content.*;
import android.widget.*;

public class CpuListAdapter extends  ArrayAdapter<Cpus>{

    private Context context;
    private List<Cpus> cpus;

    public CpuListAdapter(Context context, List<Cpus> cpus){
        super(context, R.layout.cpu_list_layout, cpus);
        this.context = context;
        this.cpus = cpus;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.cpu_list_layout, parent, false);
        ImageView imageViewPhoto = view.findViewById(R.id.img7700k);
        imageViewPhoto.setImageResource(cpus.get(position).getFoto());
        TextView textViewmodelo = view.findViewById(R.id.txmodelo7700k);
        textViewmodelo.setText(cpus.get(position).getModelo());
        TextView textViewmemoria = view.findViewById(R.id.txfrequencia7700k);
        textViewmemoria.setText(cpus.get(position).getFrequencia());
        TextView textViewpreco = view.findViewById(R.id.txpreco7700k);
        textViewpreco.setText (String.valueOf(cpus.get(position).getPreco()));
        return view;
    }
}
