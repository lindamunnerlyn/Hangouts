// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;

public abstract class dlt
{

    dlp c;

    public dlt()
    {
    }

    public void b()
    {
label0:
        {
            if (c != null)
            {
                if (Looper.myLooper() == Looper.getMainLooper())
                {
                    break label0;
                }
                c.d(this);
            }
            return;
        }
        c.b(this);
    }

    public abstract String c();

    public boolean k()
    {
        return c == null;
    }
}
