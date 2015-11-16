// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.app.Application;
import android.content.Context;
import clv;
import cqx;
import gyw;
import i;
import irl;
import irm;
import iru;
import java.util.Iterator;
import java.util.Set;

public final class Hangouts_Application extends Application
    implements irm
{

    private final Object a = new Object();
    private volatile cqx b;

    public Hangouts_Application()
    {
    }

    private cqx b()
    {
        c();
        return b;
    }

    private void c()
    {
        if (b == null)
        {
            synchronized (a)
            {
                if (b == null)
                {
                    b = (new clv()).a(new iru(this)).a();
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
        for (Iterator iterator = b.i().iterator(); iterator.hasNext(); ((irl)iterator.next()).a()) { }
        super.onCreate();
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        gyw.a();
    }

    public void onTrimMemory(int j)
    {
        super.onTrimMemory(j);
        gyw.a(j);
    }
}
