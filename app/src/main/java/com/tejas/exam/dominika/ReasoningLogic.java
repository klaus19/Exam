package com.tejas.exam.dominika;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tejas.exam.R;
import com.tejas.exam.onlinetests.OnlineTests;

public class ReasoningLogic extends AppCompatActivity {

    // Make sure to use the FloatingActionButton
    // for all the FABs
    FloatingActionButton mAddFab, mAddCallFab, mAddTestFab;


    // These are taken to make visible and invisible along
    // with FABs
    TextView addAlarmActionText, addPersonActionText;

    // to check whether sub FAB buttons are visible or not.
    Boolean isAllFabsVisible;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(R.layout.activity_logical_reasoning);

        CardView cardViewLogical = findViewById(R.id.cardView1Logical);
        CardView cardViewVerbal = findViewById(R.id.cardView2Verbal);




        mAddFab = findViewById(R.id.add_fab);
        // FAB button
        mAddCallFab = findViewById(R.id.add_alarm_fab);
        mAddTestFab = findViewById(R.id.add_test_fab);

        // Also register the action name text, of all the FABs.
        addAlarmActionText = findViewById(R.id.add_call_text);
        addPersonActionText = findViewById(R.id.add_test_action_text);

        // Now set all the FABs and all the action name
        // texts as GONE
        mAddCallFab.setVisibility(View.GONE);
        mAddTestFab.setVisibility(View.GONE);
        addAlarmActionText.setVisibility(View.GONE);
        addPersonActionText.setVisibility(View.GONE);

        // make the boolean variable as false, as all the
        // action name texts and all the sub FABs are invisible
        isAllFabsVisible = false;

        // We will make all the FABs and action name texts
        // visible only when Parent FAB button is clicked So
        // we have to handle the Parent FAB button first, by
        // using setOnClickListener you can see below
        mAddFab.setOnClickListener(
                view -> {
                    if (!isAllFabsVisible) {

                        // when isAllFabsVisible becomes
                        // true make all the action name
                        // texts and FABs VISIBLE.
                        mAddCallFab.show();
                        mAddTestFab.show();
                        addAlarmActionText.setVisibility(View.VISIBLE);
                        addPersonActionText.setVisibility(View.VISIBLE);

                        // make the boolean variable true as
                        // we have set the sub FABs
                        // visibility to GONE
                        isAllFabsVisible = true;
                    } else {

                        // when isAllFabsVisible becomes
                        // true make all the action name
                        // texts and FABs GONE.
                        mAddCallFab.hide();
                        mAddTestFab.hide();
                        addAlarmActionText.setVisibility(View.GONE);
                        addPersonActionText.setVisibility(View.GONE);

                        // make the boolean variable false
                        // as we have set the sub FABs
                        // visibility to GONE
                        isAllFabsVisible = false;
                    }
                });

        cardViewLogical.setOnClickListener(v -> {
          Intent logic = new Intent(ReasoningLogic.this,Logical.class);
          startActivity(logic);
        });

        cardViewVerbal.setOnClickListener(v -> {
              Intent i = new Intent(ReasoningLogic.this,Verbal.class);
              startActivity(i);
        });

        // below is the sample action to handle add person
        // FAB. Here it shows simple Toast msg. The Toast
        // will be shown only when they are visible and only
        // when user clicks on them
       mAddTestFab.setOnClickListener(
               view->{
                   Intent onlinetests = new Intent(ReasoningLogic.this, OnlineTests.class);
                           startActivity(onlinetests);
               }
       );

        // below is the sample action to handle add alarm
        // FAB. Here it shows simple Toast msg The Toast
        // will be shown only when they are visible and only
        // when user clicks on them
        mAddCallFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+919130430500"));
                startActivity(callIntent);
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



}

