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

final class baj
    implements aqs
{

    private final SparseArray a = new SparseArray();
    private final Context b;

    public baj(Context context)
    {
        b = context;
    }

    public void a(Bundle bundle, dpn dpn1, aoa aoa1)
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
            duf duf1 = (duf)((Iterator) (obj)).next();
            if (g.f(duf1.b))
            {
                edq edq1 = new edq(duf1.a, aoa1.a());
                edq1.c();
                bundle.add(new aqn(edq1, this, duf1.b, true, Integer.valueOf(i)));
            }
        } while (true);
        if (!bundle.isEmpty())
        {
            a.append(i, bundle);
            for (bundle = bundle.iterator(); bundle.hasNext(); dpn1.c((dpw)bundle.next())) { }
        }
    }

    public void a(eef eef, edf edf, boolean flag, aqn aqn1, boolean flag1)
    {
        gdv.a("Expected null", eef);
        gdv.a("Expected null", edf);
        int i = g.a((Integer)aqn1.m(), 0);
        eef = (List)a.get(i);
        eef.remove(aqn1);
        if (flag)
        {
            if (eef.isEmpty())
            {
                a.remove(i);
                Toast.makeText(b, l.rR, 0).show();
            }
            return;
        }
        for (eef = eef.iterator(); eef.hasNext(); ((dpw)eef.next()).b()) { }
        Toast.makeText(b, l.rQ, 0).show();
    }
}
