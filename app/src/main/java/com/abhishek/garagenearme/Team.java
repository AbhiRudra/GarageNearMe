package com.abhishek.garagenearme;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Team extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
    }

    public void call1 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+918698675000"));
        startActivity(intent);
    }

    public void mail1 (View v)
    {
        Intent myMail = new Intent(Intent.ACTION_SEND);

        myMail.setData(Uri.parse("mail to:"));
        myMail.setType("message/rfc822");
        String to="guravashish80@gmail.com";
        String sub="Hey:";
        myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
        myMail.putExtra(Intent.EXTRA_TEXT,"Hello");
        startActivity(Intent.createChooser(myMail,"send email"));
    }

    public void call2 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+919422465358"));
        startActivity(intent);
    }

    public void mail2 (View v)
    {
        Intent myMail = new Intent(Intent.ACTION_SEND);

        myMail.setData(Uri.parse("mail to:"));
        myMail.setType("message/rfc822");
        String to="surajharabhare1996@gmail.com";
        String sub="Hey:";
        myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
        myMail.putExtra(Intent.EXTRA_TEXT,"Hello");
        startActivity(Intent.createChooser(myMail,"send email"));
    }

    public void call3 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+919158974316"));
        startActivity(intent);
    }

    public void mail3 (View v)
    {
        Intent myMail = new Intent(Intent.ACTION_SEND);

        myMail.setData(Uri.parse("mail to:"));
        myMail.setType("message/rfc822");
        String to="prasadkhairmode96@gmail.com";
        String sub="Hey:";
        myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
        myMail.putExtra(Intent.EXTRA_TEXT,"Hello");
        startActivity(Intent.createChooser(myMail,"send email"));
    }

    public void call4 (View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+919764966774"));
        startActivity(intent);
    }

    public void mail4 (View v)
    {
        Intent myMail = new Intent(Intent.ACTION_SEND);

        myMail.setData(Uri.parse("mail to:"));
        myMail.setType("message/rfc822");
        String to="sagar13055@gmail.com";
        String sub="Hey:";
        myMail.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
        myMail.putExtra(Intent.EXTRA_SUBJECT,sub);
        myMail.putExtra(Intent.EXTRA_TEXT,"Hello");
        startActivity(Intent.createChooser(myMail,"send email"));
    }

}
