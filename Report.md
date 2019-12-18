# รายงานผลการทดลอง

นางสาวธัญสิริ ผลไสว 603410291-5

## คำสั่งการแสดงผลผ่าน Logcat

Debug log

```kotlin
//Add your code here
```

Error log

```kotlin
//Add your code here
```

Info log

```kotlin
//Add your code here
```

Verbose log

```kotlin
//Add your code here
```

Warning log

```kotlin
//Add your code here
```

## SNACKBAR และ TOST

คำสั่งแสดง Snackbar

```kotlin
Snackbar.make(view, "Nice to meet ya, boi!!", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
```

คำสั่งแสดง Toast

```kotlin
Toast.makeText(this,"Menu Click",Toast.LENGTH_SHORT)
                return true
```

## Android LiveCycle Activity

จงอธิบาการทำงานของเมธอทต่อไปนี้ ว่าเกิดขึ้นเมื่อใดของโปรแกรม พร้อมแสดงตัวอย่างโค้ดการทำงานของเมธอท (กำหนดให้แสดง log message เมื่อมีการทำงานของเมธอท)

1. onCreate() ->

ตั้งค่าเริ่มต้นเพื่อใช้งาน Main Activity
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        Log.i("onClick","Activity created")
    }
```

2. onStart() ->

เรียกใช้งาน
```kotlin
//Add your code here
```

3. onResume() ->

แสดง Preview ของหน้า Main Activity ที่เตรียมจะแสดงบนจอโทรศัพท์
```kotlin
override fun onResume() {
        super.onResume()
        Log.i("onResume","Activity resume")
    }
```

4. onPause() ->

```kotlin
//Add your code here
```

5. onStop() ->

```kotlin
//Add your code here
```

6. onDestroy() ->

```kotlin
//Add your code here
```

7. onRestart() ->

```kotlin
//Add your code here
```

## Start new Activity

คำสั่งสำหรับเปิด activity ใหม่

```kotlin
var i = Intent(this,Page2::class.java)
            startActivity(i)
```

คำสั่งสำหรับเปิด activity ใหม่ ผ่านเมนู setting

```kotlin
//Add your code here
```
