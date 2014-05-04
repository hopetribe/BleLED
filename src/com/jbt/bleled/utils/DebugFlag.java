package com.jbt.bleled.utils;

import android.util.Log;

public class DebugFlag
{
    public static final boolean DEBUG = false;

    public final static void printfLog(String tag, String msg)
    {
        if (DEBUG)
        {
            Log.d(tag == null ? "BleLED" : tag, msg);
        }
    }
}
