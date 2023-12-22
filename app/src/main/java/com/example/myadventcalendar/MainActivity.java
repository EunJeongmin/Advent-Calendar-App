package com.example.myadventcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private TextView subText, countdownText;
    private Button button1, button2, button3, button4, button5, button6, button7, button8,
            button9, button10, button11, button12, button13, button14, button15, button16,
            button17, button18, button19, button20, button21, button22, button23, button24;

    private boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countdownText = findViewById(R.id.countdownText);
        subText = findViewById(R.id.subText);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);
        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);
        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);

        // 크리스마스까지의 남은 시간을 밀리초로 계산
        Calendar christmas = Calendar.getInstance();
        christmas.set(Calendar.MONTH, Calendar.DECEMBER);
        christmas.set(Calendar.DAY_OF_MONTH, 25);
        christmas.set(Calendar.YEAR, 2023);

        long currentTime = System.currentTimeMillis();
        long christmasTime = christmas.getTimeInMillis();
        long timeDiff = christmasTime - currentTime;

        // CountDownTimer 설정
        new CountDownTimer(timeDiff, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                // 남은 시간을 시, 분, 초로 변환
                int days = (int) (millisUntilFinished / 86400000);
                int hours = (int) ((millisUntilFinished % 86400000) / 3600000);
                int minutes = (int) ((millisUntilFinished % 3600000) / 60000);
                int seconds = (int) ((millisUntilFinished % 60000) / 1000);

                // 시간을 화면에 표시
                String countdown = String.format(Locale.getDefault(), "D-%02d  %02d시간 %02d분 %02d초", days, hours, minutes, seconds);
                countdownText.setText(countdown);
            }

            @Override
            public void onFinish() {
                countdownText.setText("메리 크리스마스!");
                subText.setVisibility(View.GONE);
            }
        }.start();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(1)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(2)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(3)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(4)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(5)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(6)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(7)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(8)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(9)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(10)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(11)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(12)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(13)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(14)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(15)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(16)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(17)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(18)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(19)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(20)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(21)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(22)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(23)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isButtonClickable(24)) {
                    String buttonText = ((Button) view).getText().toString();
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("selectedButtonText", buttonText);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "아직 오픈일이 아닙니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    // 클릭 가능 여부를 판단하는 메서드
    private boolean isButtonClickable(int buttonNumber) {
        Calendar today = Calendar.getInstance();
        today.setTimeInMillis(System.currentTimeMillis());

        Calendar buttonDate = Calendar.getInstance();
        buttonDate.set(Calendar.MONTH, Calendar.DECEMBER);
        buttonDate.set(Calendar.DAY_OF_MONTH, buttonNumber);
        buttonDate.set(Calendar.YEAR, 2023);

        return !today.before(buttonDate);
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "뒤로가기 버튼을 한 번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 3000); // 2초 동안 대기
    }
}