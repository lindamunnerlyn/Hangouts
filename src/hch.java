// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class hch extends hmm
    implements hbc
{

    hbi a;
    gqz b;

    public hch()
    {
    }

    public void a(hbo hbo)
    {
        hbo = new ArrayList();
        Iterator iterator = b.a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int i = ((Integer)iterator.next()).intValue();
            grb grb1 = b.a(i);
            if (!grb1.d("logged_in") && !grb1.d("is_managed_account"))
            {
                hbo.add(Integer.valueOf(i));
            }
        } while (true);
        if (hbo.isEmpty())
        {
            a.b();
            return;
        }
        int ai[] = new int[hbo.size()];
        for (int j = 0; j < hbo.size(); j++)
        {
            ai[j] = ((Integer)hbo.get(j)).intValue();
        }

        hbo = getArguments();
        ap ap;
        if (hbo != null)
        {
            hbo = hbo.getString("dialog_title");
        } else
        {
            hbo = null;
        }
        ap = getChildFragmentManager();
        if (hbo == null)
        {
            hbo = context.getString(g.tp);
        }
        hce.a(ap, hbo, ai, true);
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (hbi)binder.a(hbi);
        b = (gqz)binder.a(gqz);
    }
}
