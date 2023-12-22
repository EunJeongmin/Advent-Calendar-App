# Advent-Calendar-App
> 2023년 2학기 동국대학교 모바일프로그래밍 안드로이드 앱 기획 및 개발 과제
<br />

##  🎅🏻 Advent Calendar App 🎄
### 1. 프로젝트 개요
> "Advent Calendar" 어플리케이션은 현대 사회에서 특별한 날들이 더욱 의미 있는 순간으로 여겨지는 분위기를 반영하고자 한다.
### 2. 프로젝트 목표
> 현대 사회에서 특별한 날들은 더 많은 의미를 갖고 있다. 크리스마스는 특히 기쁨, 희망, 그리고 사랑이 가득한 행복한 시간으로 여겨진다. 이 어플리케이션은 사용자들에게 각 날짜마다 새로운 기대를 주고, 크리스마스 분위기를 공유하며 특별한 순간을 만들고자 한다. 따라서 사용자들이 각 날짜에 특별한 사진, 문구, 그리고 음악과 영화 추천을 발견하며 크리스마스의 매력에 빠져들도록 하는 것이 목표이다.
<br />

## 💡 주요 기능
### 1. 크리스마스 디데이
> 상단에 크리스마스까지의 남은 시간을 표시하는 부분이다. 현재 날짜와 크리스마스 사이의 시간을 계산하고, CountDownTimer를 사용하여 1초 간격으로 디데이를 업데이트한다. 화면에는 디데이와 함께 남은 일수, 시간, 분, 초가 표시된다.
### 2. 날짜 버튼 클릭 후 상세보기
> 날짜 버튼이 클릭되면 onClick 메서드가 호출된다. 먼저 isButtonClickable() 메서드를 호출하여 해당 버튼이 클릭 가능한지 확인하고 클릭 가능한 경우에는 Intent를 사용하여 DetailActivity로 이동한다. Intent를 생성할 때, 선택한 버튼의 텍스트(buttonText)를 ‘selectedButtonText’라는 키로 추가 정보를 넘겨준다. DetailActivity로 넘어가면 updateViews 메서드를 호출하여 MainActivity에서 넘겨받은 버튼의 텍스트를 기반으로 날짜를 설정하고, 해당 날짜에 맞는 세부 내용, 즉 텍스트뷰와 이미지뷰를 업데이트한다. DetailActivity의 좌측 상단에 있는 뒤로 가기 버튼(backBtn)에 대한 클릭 이벤트 리스너를 설정하여 현재 액티비티를 종료하고 이전 화면(MainActivity)으로 돌아갈 수 있다.
### 3. 미래의 날짜 오픈 불가
> ‘isButtonClickable’ 메서드를 통해 현재 날짜와 각 버튼에 해당하는 날짜를 비교하여 해당 버튼이 클릭 가능한지 여부를 반환한다. 메서드의 ‘buttonNumber’는 버튼의 날짜를 나타내며, 이를 기반으로 ‘buttonDate’를 설정한다. ‘today.before(buttonDate)’는 현재 날짜가 버튼 날짜 이전인지를 확인하고, 반환값이 true이면 버튼이 클릭 가능한 상태, false이면 버튼을 클릭하여 DetailActivity로 넘어갈 수 없는 상태이다. 이 메서드를 각 버튼의 클릭 이벤트에서 호출하여 클릭 가능 여부를 확인하고, 클릭 가능한 경우 DetailActivity로 이동하고, 클릭이 불가능한 경우는 Toast 메시지를 띄워 아직 해당 날짜의 버튼을 클릭할 수 없음을 알린다.
<br />

## 📱 프로젝트 결과
|  |  |
| -------------- | -------------- | 
|![image](https://github.com/EunJeongmin/Advent-Calendar-App/assets/125721217/83a1c239-21ae-4d6f-b829-780b64e08834)|![image](https://github.com/EunJeongmin/Advent-Calendar-App/assets/125721217/d0de367b-c9ec-4af0-b90d-3f52bf1516a1)|
|앱 실행 시 첫 화면|현재보다 미래의 날짜를 클릭했을 때 화면|
|![image](https://github.com/EunJeongmin/Advent-Calendar-App/assets/125721217/c1362f34-d1fa-4cc9-983b-60dfcf60c887)|![image](https://github.com/EunJeongmin/Advent-Calendar-App/assets/125721217/ec4b680b-a362-468b-b1b0-872edca3f333)|
|상세보기 화면|스크롤을 내린 화면|
<br />

## 🛠️ 기술 스택
<img src="https://img.shields.io/badge/androidstudio-3DDC84?style=for-the-badge&logo=androidstudio&logoColor=white"> <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"> <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
<br />

