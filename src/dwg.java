// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class dwg
    implements dtu
{

    final gam a;
    final Context b;

    public dwg(gam gam1, Context context)
    {
        a = gam1;
        b = context;
        super();
    }

    public void a(dtv dtv1)
    {
        gam gam1 = a;
        dws dws1 = dwn.a(b);
        jet jet1 = new jet();
        jet1.a = Integer.valueOf(dtv1.c);
        if (!TextUtils.isEmpty(dtv1.d))
        {
            jet1.b = dtv1.d;
        }
        jet1.d = Integer.valueOf(dtv1.e);
        jet1.e = new inw();
        jet1.e.c = Integer.valueOf(dtv1.b);
        jet1.e.a = Integer.valueOf(dws1.b);
        if (dtv1.f != -1)
        {
            jet1.c = Integer.valueOf(dtv1.f);
        }
        gam1.a(jet1).d();
    }
}
