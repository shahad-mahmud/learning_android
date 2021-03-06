package com.shahad.learningandroid.snackBar;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import com.shahad.learningandroid.R;

/*
 * Created by SHAHAD MAHMUD on 7/20/20
 */
public class SnackBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);

        MaterialButton snackBarButton = findViewById(R.id.snack_bar_button);
        CoordinatorLayout coordinatorLayout = findViewById(R.id.coordinatorLayout);

        snackBarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(coordinatorLayout, "This is a snack bar", Snackbar.LENGTH_INDEFINITE);
                snackbar.setAction("To ami ki korbo?", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(SnackBarActivity.this, "Kichu na ghuma",
                                Toast.LENGTH_LONG).show();
                    }
                });

                snackbar.setAnimationMode(Snackbar.ANIMATION_MODE_SLIDE);
                snackbar.show();
            }
        });
    }
}
