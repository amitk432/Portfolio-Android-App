package com.example.amitkumar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity
{
       @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


                // buttons on click listners

        Button btn = (Button) findViewById(R.id.download);
        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent myWebLink = new Intent(Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://drive.google.com/file/d/1c296Nehw9E5Wb7tBEFju63GoBrB8MEuS/view?usp=sharing"));
                startActivity(myWebLink);
            }
        });


        Button btnc = (Button) findViewById(R.id.contact);
        btnc.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
               // Intent myWebLink = new Intent(Intent.ACTION_VIEW);
               // myWebLink.setData(Uri.parse("https://wa.me/918619407348"));
              //  startActivity(myWebLink);

                dialContactPhone("+918619407348");

            }
        });


        ImageView img = (ImageView) findViewById(R.id.fb_logo);
        img.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent myWebLink = new Intent(Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.facebook.com/amitk432/"));
                startActivity(myWebLink);
            }
        });

        ImageView imgt = (ImageView) findViewById(R.id.icon_twitter);
        imgt.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent myWebLink = new Intent(Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://twitter.com/amitkumar0432"));
                startActivity(myWebLink);
            }
        });

        ImageView imgi = (ImageView) findViewById(R.id.icon_insta);
        imgi.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent myWebLink = new Intent(Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.instagram.com/amitkumar_ig/"));
                startActivity(myWebLink);
            }
        });

        ImageView imgl = (ImageView) findViewById(R.id.icon_linked);
        imgl.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent myWebLink = new Intent(Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.linkedin.com/in/amitkumar0432"));
                startActivity(myWebLink);
            }
        });

        ImageView imgy = (ImageView) findViewById(R.id.icon_youtube);
        imgy.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent myWebLink = new Intent(Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://www.youtube.com/channel/UCHVOoybov2Ij4QyKwIzBNQg"));
                startActivity(myWebLink);
            }
        });


        ImageView imgg = (ImageView) findViewById(R.id.icon_git);
        imgg.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent myWebLink = new Intent(Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://github.com/amitk432"));
                startActivity(myWebLink);
            }
        });


    }






                    //phone call

    private void dialContactPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }







            //Bottom navigation menu

    public void profile(MenuItem item) {

        Intent pIntent = new Intent(this, MainActivity.class);
        startActivity(pIntent);
        finish();

    }

    public void projects(MenuItem item) {

        Intent pIntent = new Intent(this, Projects.class);
        startActivity(pIntent);
        finish();
    }

    public void about(MenuItem item) {

        Intent pIntent = new Intent(this, About.class);
        startActivity(pIntent);
        finish();

    }
}
