// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.util.Printer;

// Referenced classes of package org.chromium.base:
//            TraceEvent

class <init>
    implements Printer
{

    void a(String s)
    {
        if (TraceEvent.a())
        {
            TraceEvent.b();
        }
    }

    void b(String s)
    {
        if (TraceEvent.a())
        {
            TraceEvent.c();
        }
    }

    public void println(String s)
    {
        if (s.startsWith(">"))
        {
            a(s);
            return;
        } else
        {
            b(s);
            return;
        }
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
