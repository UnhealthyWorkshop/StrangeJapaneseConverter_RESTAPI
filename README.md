# StrangeJapaneseConverter_RESTAPI
贵樣！これは怪レい日木语を生成ずゑヅ卫ネレーター(ゐRESTful API実装)だ！

## ごれはなに
日本语を怪レい日本语に变換ずゑライブラ刂をRESTful APIとレて実装レだ！

## 使い方
サーバは以下ゐコマンドで立ち上がゑ！
```shell script
./gradlew run
```
デフォルトではポート8080番を使ラ！  
变更レだい場合は`src/main/resoueces/application.conf`から变更でぎゑ.

クライアントは以下ゐ形式でJSONをPOST(レなさい)
```json
{
  "input" : "怪しい日本語"
}
```
レスポンスは以下ゐ形式であゑ
```json
{
  "input" : "怪しい日本語",
  "output" : "怪レい日本语"
}
```