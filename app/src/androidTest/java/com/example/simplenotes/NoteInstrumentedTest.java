package com.example.simplenotes;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class NoteInstrumentedTest {

    /* Test untuk memastikan konteks aplikasi benar */
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.simplenotes", appContext.getPackageName());
    }

    /* Test dummy UI element dengan pengecekan package name */
    @Test
    public void checkAppPackage() {
        Context context = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertTrue(context.getPackageName().contains("simplenotes"));
    }
}
