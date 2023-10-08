
import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import androidx.appcompat.app.AppCompatActivity;

public class GastosActivity extends AppCompatActivity {

    private Button listarGastosButton; // Novo botão para listar gastos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gastos_activity);

        // Botão para listar gastos
        listarGastosButton = findViewById(R.id.listarGastosButton);
        listarGastosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GastosActivity.this, ListGastosActivity.class));
            }
        });

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.gastos_activity);
        }
    }
}
