// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public final class dbn
{

    private static final boolean a = false;
    private static final HashSet c = new HashSet(Arrays.asList(new Class[] {
        cts, cuo, cup, cvh, cvg
    }));
    private final ani b;

    public dbn(ani ani1)
    {
        b = ani1;
    }

    private void a(dko dko1, int i, dkb dkb1)
    {
        if (b.n() && c.contains(dko1.getClass()))
        {
            dko1 = String.valueOf(dko1.getClass().getSimpleName());
            dkb1 = String.valueOf(ebw.b(b.a()));
            ebw.g("Babel", (new StringBuilder(String.valueOf(dko1).length() + 29 + String.valueOf(dkb1).length())).append("Invalid request ").append(dko1).append(" for account ").append(dkb1).toString());
            return;
        }
        dko1.a(i);
        Context context = g.nS;
        dko1 = RequestWriter.a(context, dko1, b.h());
        if (dkb1 != null)
        {
            dkb1.a(dko1);
            return;
        } else
        {
            context.startService(dko1);
            return;
        }
    }

    public void a(dko dko1, int i)
    {
        a(dko1, i, null);
    }

    public void a(Collection collection, int i)
    {
        a(collection, i, null);
    }

    public void a(Collection collection, int i, dkb dkb1)
    {
        for (collection = collection.iterator(); collection.hasNext(); a((dko)collection.next(), i, dkb1)) { }
    }

    static 
    {
        hik hik = ebw.n;
    }
}
