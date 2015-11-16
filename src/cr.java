// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;

public class cr
{

    cf d;
    CharSequence e;
    CharSequence f;
    boolean g;

    public cr()
    {
        g = false;
    }

    public Notification a()
    {
        Notification notification = null;
        if (d != null)
        {
            notification = d.g();
        }
        return notification;
    }

    public void a(cf cf1)
    {
        if (d != cf1)
        {
            d = cf1;
            if (d != null)
            {
                d.a(this);
            }
        }
    }
}
