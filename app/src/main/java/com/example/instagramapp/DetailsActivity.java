package com.example.instagramapp;

import

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }
    View contextView = findViewById(R.id.context_view);

    Snackbar.make(contextView, R.string.item_removed_message, Snackbar.LENGTH_SHORT)
            .show();
}
