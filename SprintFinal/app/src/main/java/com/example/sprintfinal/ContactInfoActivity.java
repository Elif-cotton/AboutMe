package com.example.sprintfinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ContactInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);

        Button linkedinButton = findViewById(R.id.linkedin_button);
        Button whatsappButton = findViewById(R.id.whatsapp_button);
        Button sendEmailButton = findViewById(R.id.email_button);
        Button exitButton = findViewById(R.id.exit_button);

        linkedinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linkedinIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cl.linkedin.com/"));
                startActivity(linkedinIntent);
            }
        });

        whatsappButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whatsappIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("whatsapp://send"));
                startActivity(whatsappIntent);
            }
        });

        sendEmailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "programador.estudios738@gmail.com", null));
                startActivity(Intent.createChooser(emailIntent, "Enviar email"));
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }
}
