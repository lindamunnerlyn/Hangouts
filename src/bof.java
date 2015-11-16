// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Handler;
import java.util.LinkedList;
import java.util.List;

public final class bof
{

    private static bof a = new bof();
    private final LinkedList b = new LinkedList();

    public bof()
    {
    }

    public static bof a()
    {
        gbh.b(a);
        return a;
    }

    public static gcg c()
    {
        bpd bpd1 = bnd.a().t();
        if (bpd1 == null)
        {
            return null;
        } else
        {
            return bpd1.r();
        }
    }

    public void a(Intent intent)
    {
        bpd bpd1 = bnd.a().t();
        if (bpd1 == null)
        {
            ebw.a("Babel_calls", "Got Mesi push notification with no joined call");
            return;
        } else
        {
            bpd1.X().post(new bog(this, intent));
            return;
        }
    }

    public void a(boh boh)
    {
        b.add(boh);
    }

    List b()
    {
        return (LinkedList)b.clone();
    }

    public void b(boh boh)
    {
        gbh.a(b.remove(boh));
    }

}
