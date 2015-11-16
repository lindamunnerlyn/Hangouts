// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.List;

public final class hib
    implements hie
{

    private final Context a;
    private hij b[];

    public hib(Context context)
    {
        a = context;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        List list = hlp.c(a, hij);
        b = (hij[])list.toArray(new hij[list.size()]);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(hig hig1)
    {
        if (b == null)
        {
            a();
        }
        hij ahij[] = b;
        int k = ahij.length;
        for (int i = 0; i < k; i++)
        {
            hij hij1 = ahij[i];
            hig1 = hig1.g;
            hig1 = hij1.a();
        }

        hig1.j = hig1.h.f();
        if (Log.isLoggable("HttpOperation", 3))
        {
            String s = String.valueOf(hig1.j());
            int j;
            if (s.length() != 0)
            {
                "Starting op: ".concat(s);
            } else
            {
                new String("Starting op: ");
            }
        }
        if (hig1.h.e())
        {
            hig1.n = 2;
        }
        if (hig1.j != null)
        {
            hig1.j.a(hig1.i(), hig1.k());
        }
        hig1.n();
        hig1.o();
        if (hig1.j != null)
        {
            hig1.j.a(hig1.o);
            hig1.o.h();
            hig1.j.d();
            hig1.r();
            if (hig1.h.f() == null)
            {
                hig1.j.a("");
            }
        }
        if (hig1.m() && Log.isLoggable("HttpOperation", 4))
        {
            s = String.valueOf(hig1.i());
            j = hig1.k;
            hig1 = String.valueOf(hig1.m);
            (new StringBuilder(String.valueOf(s).length() + 36 + String.valueOf(hig1).length())).append("[").append(s).append("] failed due to error: ").append(j).append(" ").append(hig1);
        }
    }
}
