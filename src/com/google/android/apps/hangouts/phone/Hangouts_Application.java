// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.app.Application;
import android.content.Context;
import ckm;
import ckn;
import cph;
import gum;
import i;
import ilx;
import ily;
import ilz;
import java.util.Iterator;
import java.util.Set;

public final class Hangouts_Application extends Application
    implements ily
{

    private volatile cph a;
    private final Object b = new Object();

    public Hangouts_Application()
    {
    }

    private cph b()
    {
        c();
        return a;
    }

    private void c()
    {
        if (a == null)
        {
            synchronized (b)
            {
                if (a == null)
                {
                    a = ckm.a().a(new ilz(this)).a();
                }
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object a()
    {
        return b();
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        i.a(this);
    }

    public void onCreate()
    {
        c();
        for (Iterator iterator = a.c().iterator(); iterator.hasNext(); ((ilx)iterator.next()).a()) { }
        super.onCreate();
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        gum.a();
    }

    public void onTrimMemory(int j)
    {
        super.onTrimMemory(j);
        gum.a(j);
    }
}
