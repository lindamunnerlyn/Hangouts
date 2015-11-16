// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

public final class cc
{

    private final int a;
    private final CharSequence b;
    private final PendingIntent c;
    private final Bundle d;
    private ArrayList e;

    public cc(int i, CharSequence charsequence, PendingIntent pendingintent)
    {
        this(i, charsequence, pendingintent, new Bundle());
    }

    private cc(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
    {
        a = i;
        b = cf.d(charsequence);
        c = pendingintent;
        d = bundle;
    }

    public Bundle a()
    {
        return d;
    }

    public cc a(dl dl1)
    {
        if (e == null)
        {
            e = new ArrayList();
        }
        e.add(dl1);
        return this;
    }

    public cb b()
    {
        dl adl[];
        if (e != null)
        {
            adl = (dl[])e.toArray(new dl[e.size()]);
        } else
        {
            adl = null;
        }
        return new cb(a, b, c, d, adl);
    }
}
