// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gxw extends hhu
    implements gws
{

    gwy a;
    gms b;

    public gxw()
    {
    }

    public void a(gxe gxe)
    {
        gxe = new ArrayList();
        Iterator iterator = b.a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int i = ((Integer)iterator.next()).intValue();
            gmu gmu1 = b.a(i);
            if (!gmu1.d("logged_in") && !gmu1.d("is_managed_account"))
            {
                gxe.add(Integer.valueOf(i));
            }
        } while (true);
        if (gxe.isEmpty())
        {
            a.b();
            return;
        }
        int ai[] = new int[gxe.size()];
        for (int j = 0; j < gxe.size(); j++)
        {
            ai[j] = ((Integer)gxe.get(j)).intValue();
        }

        gxe = getArguments();
        ap ap;
        if (gxe != null)
        {
            gxe = gxe.getString("dialog_title");
        } else
        {
            gxe = null;
        }
        ap = getChildFragmentManager();
        if (gxe == null)
        {
            gxe = context.getString(g.sO);
        }
        gxt.a(ap, gxe, ai, true);
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gwy)binder.a(gwy);
        b = (gms)binder.a(gms);
    }
}
