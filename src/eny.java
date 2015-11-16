// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class eny extends eod
{

    final enq a;
    private final Map c;

    public eny(enq enq1, Map map)
    {
        a = enq1;
        super(enq1, (byte)0);
        c = map;
    }

    public void a()
    {
        int i = eml.a(a.c);
        if (i != 0)
        {
            ConnectionResult connectionresult = new ConnectionResult(i, null);
            a.a.a(new enz(this, a, connectionresult));
        } else
        {
            if (a.e)
            {
                a.d.o();
            }
            Iterator iterator = c.keySet().iterator();
            while (iterator.hasNext()) 
            {
                emw emw1 = (emw)iterator.next();
                emw1.a((enc)c.get(emw1));
            }
        }
    }
}
