package com.example.prince.examplecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wenchao.cardstack.CardStack;

public class MainActivity extends AppCompatActivity implements CardStack.CardEventListener {
    private CardStack cardStack;
    private CardStackAdapter cardStackAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImages();
        cardStack = (CardStack)findViewById(R.id.card_stack);
        cardStack.setContentResource(R.layout.card_layout);
        cardStack.setAdapter(cardStackAdapter);
        cardStack.setStackMargin(20);
        cardStack.setListener(this);

    }

    private void initImages() {
        cardStackAdapter = new CardStackAdapter(getApplicationContext(),0);
        cardStackAdapter.add(R.drawable.img1);
        cardStackAdapter.add(R.drawable.img1);
        cardStackAdapter.add(R.drawable.img1);
        cardStackAdapter.add(R.drawable.img1);
        cardStackAdapter.add(R.drawable.img1);
        cardStackAdapter.add(R.drawable.img1);
        cardStackAdapter.add(R.drawable.img1);
        cardStackAdapter.add(R.drawable.img1);
        cardStackAdapter.add(R.drawable.img1);
//        cardStackAdapter.add(R.drawable.img2);
//        cardStackAdapter.add(R.drawable.img1);
//        cardStackAdapter.add(R.drawable.img2);
    }

    @Override
    public boolean swipeEnd(int i, float v) {
        return (v>300)?true:false;
    }

    @Override
    public boolean swipeStart(int i, float v) {
        return false;
    }

    @Override
    public boolean swipeContinue(int i, float v, float v1) {
        return false;
    }

    @Override
    public void discarded(int i, int i1) {

    }

    @Override
    public void topCardTapped() {

    }
}
