package com.example.myadventcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {

    private ImageButton backBtn;
    private TextView dayText, mainText, musicText, movieText;
    private ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        backBtn = findViewById(R.id.backBtn);
        dayText = findViewById(R.id.dayText);
        mainText = findViewById(R.id.mainText);
        musicText = findViewById(R.id.musicText);
        movieText = findViewById(R.id.movieText);
        image = findViewById(R.id.image);

        // 이전 액티비티로부터 전달받은 데이터
        Intent intent = getIntent();
        String selectedButtonText = intent.getStringExtra("selectedButtonText");

        // 버튼의 텍스트를 기반으로 날짜를 설정하고 뷰 업데이트
        updateViews(selectedButtonText);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 현재 액티비티를 종료하여 뒤로가기 역할
                finish();
            }
        });

    }

    private void updateViews(String selectedButtonText) {
        // 버튼의 텍스트를 기반으로 날짜 설정
        dayText.setText("12월 " + selectedButtonText + "일");

        // 날짜에 따라 다른 내용을 설정하기 위한 데이터
        String[] mainTextArray = {
                "12월은 크리스마스가 있는 달! 😆",
                "선물은 생각해 두셨나요? 💝",
                "1년동안 고생한 자신에게 주는 선물은 어때요? ☺️",
                "따듯한 코코아에 마시멜로우를 얹어 마시기! ☕",
                "가족과 함께 보내는 크리스마스! 👨‍👩‍👧‍👦",
                "맛있는 쿠키와 따듯한 음료를 함께하면 행복하죠 🍪🫖",
                "트리를 꾸밀 예정이라면 이런 오너먼트는 어때요? ✨",
                "눈이 내린 트리에 어울릴 것 같은 이 오너먼트! 참 예쁘죠! ✨💖",
                "쿠기를 구워 주변 사람들에게 선물해보기는 어때요? 🍪💑",
                "따듯한 코코아 한 잔 추천합니다! ☕",
                "슬슬 선물이 들어갈 양말을 구비해야할 때! 🧦🎁",
                "거대한 트리를 보러 밖으로 나가 봐요! 🪟🎄",
                "크리스마스가 다가와요! 🍀",
                "크리스마스 캐럴을 들어봐요 🎶",
                "크리스마스에 즐거운 계획은 세우셨나요? 📅",
                "개성적인 크리스마스 트리는 어때요? 🌲🎄",
                "이번 크리스마스 트리는 꾸미셨나요? 🌲",
                "크리스마스의 별빛이 당신의 길을 비춰줄 수 있기를 ❄️⭐",
                "올해 크리스마스에는 새로운 추억을 만들어봐요! 📷",
                "사랑이 넘치는 크리스마스가 다가오길! 💖",
                "올해 크리스마스는 화이트 크리스마스일까요? ☃️",
                "크리스마스의 따듯한 기운이 당신을 행복하게 만들어 주길 🎁",
                "모든 소망과 꿈이 이루어지는 크리스마스가 되길 💫",
                "Merry Christmas and Happy New Year! 🎅🏻🎄"
        };

        String[] musicTextArray = {
                "Jonas Brothers - Like It's Christmas",
                "shawn Mendes & Camila Cabello - The Christmas Song",
                "Kelly Clarkson - Underneath the Tree",
                "NCT DREAM - JOY",
                "New Rules - Might Ruin Christmas",
                "Ed Sheeran & Elton John - Merry Christmas",
                "Bebe Rexha - Count on Christmas",
                "Alessia Cara - Make It To Christmas",
                "Mariah Carey - Christmas",
                "인피니트 - 하얀 고백",
                "Sia - Snowman",
                "EXO - 첫 눈",
                "아이유 - 미리 메리 크리스마스",
                "Michael Buble - Winter Wonderland",
                "Kelly Clarkson - Christmas Eve",
                "f(x) - 12시 15분",
                "Jessie J - Man With The Bag",
                "Backstreet Boys - Last Christmas",
                "Kelly Clarkson & Ariana Grande - Santa, Can't You Hear Me",
                "Sia - Candy Cane Lane",
                "Ava Max - Christmas Without You",
                "Ariana Grande - Santa Tell Me",
                "Sia - Santa's Coming for Us",
                "Mariah Carey - All I Want for Christmas Is You"
        };

        String[] movieTextArray = {
                "아이언맨 3(Iron Man 3), 2013",
                "겨울왕국(Frozen), 2014",
                "대디스 홈(Daddy's Home), 2015",
                "겨울왕국 2(Frozen 2), 2019",
                "로열 크리스마스(A Christmas Prince), 2017",
                "대디스 홈2(Daddy's Home 2), 2017",
                "로열 크리스마스: 세기의 결혼(A Christmas Prince: The Royal Wedding), 2018",
                "러브 하드(Love Hard), 2021",
                "로열 크리스마스: 오 마이 베이비(A Christmas Prince: The Royal Baby), 2019",
                "크리스마스 스위치(The Princess Switch), 2018",
                "크리스마스 스위치: 한 번 더 바꿔?(The Princess Switch: Switched Again), 2020",
                "크리스마스 연대기(The Christmas Chronicles), 2018",
                "크리스마스 연대기: 두 번째 이야기(The Christmas Chronicles), 2020",
                "크리스마스 스위치: 로맨싱 스타(The Princess Switch 3: Romancing the Star). 2021",
                "징글 쟁글: 저니의 크리스마스(Jingle Jangle: A Christmas Journey), 2020",
                "렛 잇 스노우(Let It Snow), 2019",
                "크리스마스로 불리는 소년(A Boy Called Christmas), 2021",
                "호두까기 인형과 4개의 왕국(The Nutcracker and the Four Realms), 2018",
                "라스트 크리스마스(Last Christmas), 2019",
                "로맨틱 홀리데이(The Holiday), 2006",
                "배드 맘스 크리스마스(A Bad Moms Christmas), 2017",
                "캐롤(Carol), 2016",
                "스펜서(SPENCER), 2022",
                "나 홀로 집에(Home Alone), 1991"
        };

        int[] imageResourceIdArray = {
                R.drawable.image_1,
                R.drawable.image_2,
                R.drawable.image_3,
                R.drawable.image_4,
                R.drawable.image_5,
                R.drawable.image_6,
                R.drawable.image_7,
                R.drawable.image_8,
                R.drawable.image_9,
                R.drawable.image_10,
                R.drawable.image_11,
                R.drawable.image_12,
                R.drawable.image_13,
                R.drawable.image_14,
                R.drawable.image_15,
                R.drawable.image_16,
                R.drawable.image_17,
                R.drawable.image_18,
                R.drawable.image_19,
                R.drawable.image_20,
                R.drawable.image_21,
                R.drawable.image_22,
                R.drawable.image_23,
                R.drawable.image_24
        };

        // 날짜에 따른 데이터 설정
        int dayIndex = Integer.parseInt(selectedButtonText) - 1;
        mainText.setText(mainTextArray[dayIndex]);
        musicText.setText(musicTextArray[dayIndex]);
        movieText.setText(movieTextArray[dayIndex]);
        image.setImageResource(imageResourceIdArray[dayIndex]);
    }
}