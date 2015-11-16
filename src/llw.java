// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Printer;
import org.chromium.base.TraceEvent;

public class llw
    implements Printer
{

    private llw()
    {
    }

    llw(byte byte0)
    {
        this();
    }

    void a(String s)
    {
        if (TraceEvent.a)
        {
            TraceEvent.a();
        }
    }

    void b(String s)
    {
        if (TraceEvent.a)
        {
            TraceEvent.b();
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
}
