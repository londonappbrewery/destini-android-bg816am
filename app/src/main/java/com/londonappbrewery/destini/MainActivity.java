package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryText;
    private TextView mChoiceTop;
    private TextView mChoiceBottom;
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
            mStoryText= findViewById(R.id.storyTextView);
            mChoiceTop= findViewById(R.id.buttonTop);
            mChoiceBottom= findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mChoiceTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1) {
                    mChoiceTop.setText(R.string.T3_Ans1);
                    mStoryText.setText(R.string.T3_Story);
                    mChoiceBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else  if(mStoryIndex == 3) {
                    mStoryText.setText(R.string.T6_End);
                    mChoiceTop.setVisibility(View.GONE);
                    mChoiceBottom.setVisibility(View.GONE);
                } else if(mStoryIndex == 2) {
                    mStoryText.setText(R.string.T3_Story);
                    mChoiceTop.setText(R.string.T3_Ans1);
                    mChoiceBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mChoiceBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 1) {
                    mStoryText.setText(R.string.T2_Story);
                    mChoiceTop.setText(R.string.T2_Ans1);
                    mChoiceBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    mStoryText.setText(R.string.T4_End);
                    mChoiceTop.setVisibility(View.GONE);
                    mChoiceBottom.setVisibility(View.GONE);
                } else if(mStoryIndex == 3) {
                    mStoryText.setText(R.string.T5_End);
                    mChoiceTop.setVisibility(View.GONE);
                    mChoiceBottom.setVisibility(View.GONE);
                }
            }
        });

    }
}
