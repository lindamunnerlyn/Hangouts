// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class gnb
{

    final Context a;
    final gmm b;
    private final Map c = new HashMap();

    public gnb(Context context, gmm gmm1)
    {
        a = context;
        b = gmm1;
    }

    ell a()
    {
        Object obj = b.d().a();
        Context context = a;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((gmn) (obj)).n();
        }
        return new ell(context, "HANGOUT_LOG_REQUEST", ((String) (obj)));
    }

    public void a(int i)
    {
        gdv.a();
        Object obj = b.d().a();
        gnc gnc1;
        gnc gnc2;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((gmn) (obj)).n();
        }
        gnc2 = (gnc)c.get(obj);
        gnc1 = gnc2;
        if (gnc2 == null)
        {
            gnc1 = new gnc(this);
            c.put(obj, gnc1);
        }
        gnc1.b(i);
    }

    public void b()
    {
        for (Iterator iterator = c.values().iterator(); iterator.hasNext(); ((gnc)iterator.next()).a()) { }
    }
}
