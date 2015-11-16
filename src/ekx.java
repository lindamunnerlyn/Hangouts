// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class ekx extends elc
{

    final ekp a;
    private final Map c;

    public ekx(ekp ekp1, Map map)
    {
        a = ekp1;
        super(ekp1, (byte)0);
        c = map;
    }

    public void a()
    {
        int i = ejk.a(a.c);
        if (i != 0)
        {
            ConnectionResult connectionresult = new ConnectionResult(i, null);
            a.a.a(new eky(this, a, connectionresult));
        } else
        {
            if (a.e)
            {
                a.d.p();
            }
            Iterator iterator = c.keySet().iterator();
            while (iterator.hasNext()) 
            {
                ejv ejv1 = (ejv)iterator.next();
                ejv1.a((ekb)c.get(ejv1));
            }
        }
    }
}
