# รายงานผลการทดลอง

นางสาวธัญสิริ ผลไสว 603410291-5

## คำสั่งการแสดงผลผ่าน Logcat

Debug log

```kotlin
Log.debug("This is a debug message")
```

Error log

```kotlin
Log.error("This is an error message with an additional Exception for output", "AndACustomTag", exception )
```

Info log

```kotlin
Log.info("This is an info message")
```

Verbose log

```kotlin
Log.v("tag", "This is an info message") 
```

Warning log

```kotlin
Log.warn("This is a warning message","WithACustomTag")
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

onStart() ก็จะถูกเรียกหลังจาก onCreateทำงาน และจะทำงานอีกครั้งเมื่อ Activity ทำงานอีกครั้ง
```kotlin
----
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

หยุดการทำงานของ Activity ชั่วคราว
```kotlin
override fun onPause() {
        super.onPause()
		Log.i("onPause","Activity Pause")
    }
```

5. onStop() ->

จะถูกเรียกเมื่อ Activity หนึ่งถูกปิดและไปใช้งานอีก Activity หนึ่งแทน
```kotlin
override fun onStop() {
        super.onStop()
		Log.i("onStop","Activity Stop")
    }
```

6. onDestroy() ->

จะถูกเรียกก่อนที่จะปิด Activity หนึ่งๆ
```kotlin
override fun onDestroy() {
        super.onDestroy()
		Log.i("onDestroy","Activity Destroy")
    }
```

7. onRestart() ->

จะถูกเรียกเมื่อ Activity หนึ่งถูกพับไว้แล้วมีการเรียกกลับมาแสดงอีกครั้ง
```kotlin
override fun onRestart() {
        super.onRestart()
		Log.i("onRestart","Activity Restart")
    }
```

## Start new Activity

คำสั่งสำหรับเปิด activity ใหม่

```kotlin
var i = Intent(this,Page2::class.java)
            startActivity(i)
```

คำสั่งสำหรับเปิด activity ใหม่ ผ่านเมนู setting

```kotlin
override fun onOptionsItemSelected(item: MenuItem): Boolean {
	return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
```
