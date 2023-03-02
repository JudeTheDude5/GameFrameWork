package com.example.game_test_b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.GameFramework.GameMainActivity;
import com.example.GameFramework.gameConfiguration.GameConfig;
import com.example.GameFramework.infoMessage.GameState;
import com.example.GameFramework.LocalGame;


public class MainActivity extends GameMainActivity {

    @Override
        public GameConfig createDefaultConfig() {
            return null;
        }


    @Override
    public LocalGame createLocalGame(GameState gameState) {
        return null;
    }
}