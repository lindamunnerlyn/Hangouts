// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class dzq
    implements dxc
{

    final gda a;
    final Context b;

    public dzq(gda gda1, Context context)
    {
        a = gda1;
        b = context;
        super();
    }

    public void a(dxd dxd1)
    {
        gda gda1 = a;
        eac eac1 = dzx.a(b);
        jlh jlh1 = new jlh();
        jlh1.a = Integer.valueOf(dxd1.c);
        if (!TextUtils.isEmpty(dxd1.d))
        {
            jlh1.b = dxd1.d;
        }
        jlh1.d = Integer.valueOf(dxd1.e);
        jlh1.e = new iub();
        jlh1.e.c = Integer.valueOf(dxd1.b);
        jlh1.e.a = Integer.valueOf(eac1.b);
        if (dxd1.f != -1)
        {
            jlh1.c = Integer.valueOf(dxd1.f);
        }
        gda1.a(jlh1).d();
    }
}
