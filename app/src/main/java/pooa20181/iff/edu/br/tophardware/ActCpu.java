package pooa20181.iff.edu.br.tophardware;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import entities.*;
import adapters.*;
import android.widget.*;

import java.math.BigDecimal;
import java.util.*;

public class ActCpu extends AppCompatActivity {

    private Button btnReturn;
    private ListView lvCpus;
    private List<Cpus> cpus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_cpu);

        btnReturn = findViewById(R.id.btnReturn);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainit = new Intent(ActCpu.this, ActMain.class);
                startActivity(mainit);
            }
        });
        cpus = new ArrayList<Cpus>();
        cpus.add(new Cpus("p01", "I7 7700k", "4.0 Ghz", R.drawable.i7770k, BigDecimal.valueOf(305)));
        cpus.add(new Cpus("p02", "I7 8700k", "3.7 GHz", R.drawable.i78770k, BigDecimal.valueOf(380)));
        cpus.add(new Cpus("p03", "Ryzen 5", "3.2 GHz", R.drawable.ryzen5, BigDecimal.valueOf(190)));
        cpus.add(new Cpus("p04", "Ryzen 7", "3 GHz", R.drawable.ryzen7, BigDecimal.valueOf(315)));
        this.lvCpus = (ListView) findViewById(R.id.lvCpus);
        this.lvCpus.setAdapter(new CpuListAdapter(this, cpus));
    }
}
