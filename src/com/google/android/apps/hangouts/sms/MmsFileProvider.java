// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.sms;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import dto;
import eev;
import java.io.File;
import java.util.Random;

public class MmsFileProvider extends dto
{

    static final String b;

    public MmsFileProvider()
    {
    }

    public static Uri a(Context context)
    {
        Object obj = b;
        long l = Math.abs(dto.a.nextLong());
        obj = (new android.net.Uri.Builder()).authority(((String) (obj))).scheme("content");
        ((android.net.Uri.Builder) (obj)).appendPath(String.valueOf(l));
        if (!TextUtils.isEmpty(null))
        {
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("ext", null);
        }
        obj = ((android.net.Uri.Builder) (obj)).build();
        context = a(((Uri) (obj)).getPath(), context);
        if (!a(((File) (context))))
        {
            context = String.valueOf(context.getAbsolutePath());
            if (context.length() != 0)
            {
                context = "Failed to create temp file ".concat(context);
            } else
            {
                context = new String("Failed to create temp file ");
            }
            eev.g("Babel", context);
        }
        return ((Uri) (obj));
    }

    public static File a(Uri uri, Context context)
    {
        return a(uri.getPath(), context);
    }

    private static File a(String s, Context context)
    {
        return new File(new File(context.getCacheDir(), "rawmms"), String.valueOf(s).concat(".dat"));
    }

    File a(String s)
    {
        return a(s, getContext());
    }

    static 
    {
        Class.forName("com.google.android.apps.hangouts.content.EsProvider");
        String s = "com.google.android.apps.hangouts.sms.MmsFileProvider";
_L2:
        b = s;
        return;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        classnotfoundexception = "com.google.android.apps.hangouts.sms.MmsFileProviderAltBuild";
        if (true) goto _L2; else goto _L1
_L1:
    }
}
