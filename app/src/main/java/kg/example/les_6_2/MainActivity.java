package kg.example.les_6_2;

import static kg.example.les_6_2.R.id.button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardView = findViewById(R.id.card_view);
        cardView.setBackgroundResource(R.drawable.bg_card_view);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            cardView.setAlpha(0);
            if (cardView.getAlpha()==1){
                cardView.animate().alpha(0);
            }else {
                cardView.animate().alpha(1);
            }
        });


    }
}