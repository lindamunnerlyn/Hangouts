// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public final class dcw
{

    private static final boolean a = false;
    private static final HashSet c = new HashSet(Arrays.asList(new Class[] {
        cvw, cws, cwt, cxl, cxk
    }));
    private final aoa b;

    public dcw(aoa aoa1)
    {
        b = aoa1;
    }

    private void a(dmf dmf1, int i, dls dls1)
    {
        if (b.l() && c.contains(dmf1.getClass()))
        {
            dmf1 = String.valueOf(dmf1.getClass().getSimpleName());
            dls1 = String.valueOf(eev.b(b.a()));
            eev.g("Babel", (new StringBuilder(String.valueOf(dmf1).length() + 29 + String.valueOf(dls1).length())).append("Invalid request ").append(dmf1).append(" for account ").append(dls1).toString());
            return;
        }
        dmf1.a(i);
        Context context = g.nU;
        dmf1 = RequestWriter.a(context, dmf1, b.h());
        if (dls1 != null)
        {
            dls1.a(dmf1);
            return;
        } else
        {
            context.startService(dmf1);
            return;
        }
    }

    public void a(dmf dmf1, int i)
    {
        a(dmf1, i, null);
    }

    public void a(Collection collection, int i)
    {
        a(collection, i, null);
    }

    public void a(Collection collection, int i, dls dls1)
    {
        for (collection = collection.iterator(); collection.hasNext(); a((dmf)collection.next(), i, dls1)) { }
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
