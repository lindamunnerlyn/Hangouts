// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import cln;
import clp;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class  extends Service
{

    private static final SimpleDateFormat e = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
    private final Handler a = new Handler();
    private final IBinder b = new clp(this);
    private ArrayAdapter c;
    private final ArrayList d = new ArrayList();
    private String f;

    public static SimpleDateFormat a()
    {
        return e;
    }

    public static ArrayList a(e e1)
    {
        return e1.d;
    }

    public static String b(d d1)
    {
        return d1.f;
    }

    public static ArrayAdapter c(f f1)
    {
        return f1.c;
    }

    public static Handler d(c c1)
    {
        return c1.a;
    }

    public void a(ArrayAdapter arrayadapter, String s)
    {
        c = arrayadapter;
        f = s;
        c.clear();
        arrayadapter = d.iterator();
        do
        {
            if (!arrayadapter.hasNext())
            {
                break;
            }
            s = (Intent)arrayadapter.next();
            if (f == null || TextUtils.equals(s.getStringExtra("conversation_id"), f))
            {
                c.add(s);
            }
        } while (true);
        c.notifyDataSetChanged();
    }

    public IBinder onBind(Intent intent)
    {
        return b;
    }

    public void onCreate()
    {
        RealTimeChatService.a(new cln(this));
    }

    public void onDestroy()
    {
    }

    public void onStart(Intent intent, int i)
    {
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        return 1;
    }


    public ()
    {
    }
}
