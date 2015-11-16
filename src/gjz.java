// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class gjz
{

    final Context a;
    final gjk b;
    private final Map c = new HashMap();

    public gjz(Context context, gjk gjk1)
    {
        a = context;
        b = gjk1;
    }

    eik a()
    {
        Object obj = b.b().a();
        Context context = a;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((gjl) (obj)).n();
        }
        return new eik(context, "HANGOUT_LOG_REQUEST", ((String) (obj)));
    }

    public void a(int i)
    {
        gbh.a();
        Object obj = b.b().a();
        gka gka1;
        gka gka2;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((gjl) (obj)).n();
        }
        gka2 = (gka)c.get(obj);
        gka1 = gka2;
        if (gka2 == null)
        {
            gka1 = new gka(this);
            c.put(obj, gka1);
        }
        gka1.a(i);
    }

    public void b()
    {
        for (Iterator iterator = c.values().iterator(); iterator.hasNext(); ((gka)iterator.next()).a()) { }
    }
}
