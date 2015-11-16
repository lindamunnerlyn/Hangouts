// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.StrictMode;
import java.io.File;
import java.util.concurrent.ExecutionException;

public class PathUtils
{

    private static AsyncTask a;
    private static File b;

    private PathUtils()
    {
    }

    private static String a(int i)
    {
        String s = ((String[])a.get())[i];
        return s;
        Object obj;
        obj;
_L2:
        return null;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String getCacheDirectory(Context context)
    {
        return a(2);
    }

    public static String getDataDirectory(Context context)
    {
        return a(0);
    }

    public static String getDatabaseDirectory(Context context)
    {
        return a(1);
    }

    private static String getDownloadsDirectory(Context context)
    {
        context = StrictMode.allowThreadDiskReads();
        String s = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
        StrictMode.setThreadPolicy(context);
        return s;
        Exception exception;
        exception;
        StrictMode.setThreadPolicy(context);
        throw exception;
    }

    public static String getExternalStorageDirectory()
    {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    private static String getNativeLibraryDirectory(Context context)
    {
        context = context.getApplicationInfo();
        if ((((ApplicationInfo) (context)).flags & 0x80) != 0 || (((ApplicationInfo) (context)).flags & 1) == 0)
        {
            return ((ApplicationInfo) (context)).nativeLibraryDir;
        } else
        {
            return "/system/lib/";
        }
    }

    public static String getThumbnailCacheDirectoryPath(Context context)
    {
        if (b == null)
        {
            b = context.getDir("textures", 0);
        }
        return b.getAbsolutePath();
    }
}
