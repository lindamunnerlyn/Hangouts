// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class azu
    implements aqb
{

    private final SparseArray a = new SparseArray();
    private final Context b;

    public azu(Context context)
    {
        b = context;
    }

    public void a(Bundle bundle, dmt dmt1, ani ani1)
    {
        Object obj = bundle.getParcelableArrayList("save_media_attachments");
        int i = (int)System.currentTimeMillis();
        bundle = new ArrayList();
        obj = ((ArrayList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            drl drl1 = (drl)((Iterator) (obj)).next();
            if (g.f(drl1.b))
            {
                eam eam1 = new eam(drl1.a, ani1.a());
                eam1.c();
                bundle.add(new apw(eam1, this, drl1.b, true, Integer.valueOf(i)));
            }
        } while (true);
        if (!bundle.isEmpty())
        {
            a.append(i, bundle);
            for (bundle = bundle.iterator(); bundle.hasNext(); dmt1.c((dnc)bundle.next())) { }
        }
    }

    public void a(ebh ebh, eab eab, boolean flag, apw apw1, boolean flag1)
    {
        gbh.a(ebh);
        gbh.a(eab);
        int i = g.a((Integer)apw1.l(), 0);
        ebh = (List)a.get(i);
        ebh.remove(apw1);
        if (flag)
        {
            if (ebh.isEmpty())
            {
                a.remove(i);
                Toast.makeText(b, l.sy, 0).show();
            }
            return;
        }
        for (ebh = ebh.iterator(); ebh.hasNext(); ((dnc)ebh.next()).b()) { }
        Toast.makeText(b, l.sx, 0).show();
    }
}
