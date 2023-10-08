import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class ListGastosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_gastos);

        // Simule uma lista de gastos (você pode obter esses dados de onde preferir)
        List<String> gastos = new ArrayList<>();
        gastos.add("Gasto 1: $50.00");
        gastos.add("Gasto 2: $30.00");
        gastos.add("Gasto 3: $20.00");

        // Configure um ArrayAdapter para exibir a lista de gastos em um ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, gastos);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
