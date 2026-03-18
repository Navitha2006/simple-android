<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp">

    <EditText
        android:id="@+id/etStart"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Start Range"
        android:inputType="number" />

    <EditText
        android:id="@+id/etEnd"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter End Range"
        android:inputType="number"
        android:layout_marginTop="10dp" />

    <Button
        android:id="@+id/btnGenerate"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Generate Number"
        android:layout_marginTop="15dp" />

    <TextView
        android:id="@+id/tvResult"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Result will appear here"
        android:textSize="20sp"
        android:layout_marginTop="20dp" />

</LinearLayout>
