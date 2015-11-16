// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.List;

public final class hdk
    implements hdn
{

    private final Context a;
    private hds b[];

    public hdk(Context context)
    {
        a = context;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        List list = hgx.c(a, hds);
        b = (hds[])list.toArray(new hds[list.size()]);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(hdp hdp1)
    {
        if (b == null)
        {
            a();
        }
        hds ahds[] = b;
        int k = ahds.length;
        for (int i = 0; i < k; i++)
        {
            hds hds1 = ahds[i];
            hdp1 = hdp1.g;
            hdp1 = hds1.a();
        }

        hdp1.j = hdp1.h.f();
        if (Log.isLoggable("HttpOperation", 3))
        {
            String s = String.valueOf(hdp1.j());
            int j;
            if (s.length() != 0)
            {
                "Starting op: ".concat(s);
            } else
            {
                new String("Starting op: ");
            }
        }
        if (hdp1.h.e())
        {
            hdp1.n = 2;
        }
        if (hdp1.j != null)
        {
            hdp1.j.a(hdp1.i(), hdp1.k());
        }
        hdp1.n();
        hdp1.o();
        if (hdp1.j != null)
        {
            hdp1.j.a(hdp1.o);
            hdp1.o.h();
            hdp1.j.d();
            hdp1.r();
            if (hdp1.h.f() == null)
            {
                hdp1.j.a("");
            }
        }
        if (hdp1.m() && Log.isLoggable("HttpOperation", 4))
        {
            s = hdp1.i();
            j = hdp1.k;
            hdp1 = String.valueOf(hdp1.m);
            (new StringBuilder(String.valueOf(s).length() + 36 + String.valueOf(hdp1).length())).append("[").append(s).append("] failed due to error: ").append(j).append(" ").append(hdp1);
        }
    }
}
