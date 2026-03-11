# Mushaf Components - نظام التحديث التلقائي

## 📋 نظرة عامة

هذا الريبو يحتوي على نظام تحديث تلقائي متكامل لتطبيق Mushaf القرآني.

## 🏗️ المكونات

### 1. نظام التحديث (Update System)
- **MushafUpdateManager.kt** - مدير التحديثات
- **MushafApi.kt** - واجهة برمجة التطبيق
- **MushafRetrofitInstance.kt** - إعدادات الاتصال بالـ API
- **MushafApiConfig.kt** - إعدادات الروابط والـ endpoints

### 2. نماذج البيانات (Data Models)
- **ApiModels.kt** - نماذج البيانات المستخدمة في الـ API

### 3. ملفات التحديث (Update Files)
- **Inventory/versions/app_updates.json** - معلومات إصدارات التطبيق
- **Inventory/versions/resources_versions.json** - إصدارات الموارد
- **Inventory/other/urls.json** - روابط التطبيق والدعم

## 🚀 كيفية الاستخدام

### 1. إضافة الاعتماديات
```kotlin
// في build.gradle (app)
implementation 'com.squareup.retrofit2:retrofit:2.9.0'
implementation 'com.jakewharton.retrofit2:converter-kotlinx-serialization:1.0.0'
implementation 'org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0'
```

### 2. تهيئة نظام التحديث
```kotlin
// في Application أو MainActivity
val updateManager = MushafUpdateManager(context)

// فحص التحديثات
updateManager.check4Update()

// فحص التحديثات الحرجة فقط
updateManager.check4CriticalUpdate()
```

### 3. أولويات التحديث
- **CRITICAL (5)**: تحديثات حرجة - إجباري
- **MAJOR (4)**: تحديثات رئيسية - موصى به بشدة
- **MODERATE (3)**: تحديثات متوسطة - اختياري
- **MINOR (2)**: تحديثات ثانوية - اختياري
- **COSMETIC (1)**: تحديثات تجميلية - اختياري

## 📁 بنية الملفات

```
Mushaf-components/
├── Inventory/
│   ├── versions/
│   │   ├── app_updates.json          # تحديثات التطبيق
│   │   └── resources_versions.json  # إصدارات الموارد
│   └── other/
│       └── urls.json               # روابط التطبيق
├── MushafApi.kt                   # واجهة API
├── MushafRetrofitInstance.kt        # إعدادات Retrofit
├── MushafApiConfig.kt             # إعدادات الروابط
├── MushafUpdateManager.kt          # مدير التحديثات
└── ApiModels.kt                   # نماذج البيانات
```

## 🔧 التخصيص

### تعديل روابط API
```kotlin
// في MushafApiConfig.kt
const val MUSHAF_COMPONENTS_ROOT_URL = "https://your-server.com/inventory/"
```

### إضافة تحديث جديد
```json
// في app_updates.json
{
  "version": 118,
  "versionName": "3.0.1",
  "updatePriority": 3,
  "title": "تحديث جديد",
  "description": "وصف التحديث الجديد"
}
```

## 🌐 النشر

### 1. GitHub Pages
```bash
# رفع الملفات لـ GitHub
git add .
git commit -m "Update versions"
git push origin main
```

### 2. CDN (jsDelivr)
الملفات تكون متاحة عبر:
```
https://cdn.jsdelivr.net/gh/1DevNexus/Mushaf-components@latest/Inventory/
```

## 📱 التكامل مع التطبيق

### 1. إذن الإنترنت
```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
```

### 2. فحص التحديث عند بدء التطبيق
```kotlin
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // فحص التحديثات
        val updateManager = MushafUpdateManager(this)
        updateManager.check4Update()
    }
}
```

## 🔄 نظام التحديث التلقائي

- **فحص تلقائي** عند فتح التطبيق
- **تحميل تلقائي** للتحديثات الحرجة
- **إشعارات** للتحديثات المتاحة
- **واجهة مستطيل** لعرض معلومات التحديث

## 📞 الدعم

- **البريد الإلكتروني**: support@mushaf.isysway.com
- **قناة Telegram**: https://t.me/mushaf_channel
- **GitHub Issues**: https://github.com/1DevNexus/Mushaf-components/issues

## 📄 الرخصة

هذا المشروع مرخص تحت رخصة MIT - راجع ملف LICENSE للمزيد من المعلومات.
