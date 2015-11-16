// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public final class dgz extends dfa
{

    private static final boolean d = false;
    private final boolean a;

    public dgz(ani ani1, boolean flag)
    {
        super(ani1);
        a = flag;
    }

    public void a()
    {
        Configuration configuration;
        int i;
        long l;
        boolean flag;
label0:
        {
            l = dzk.a();
            Context context = g.nS;
            configuration = context.getResources().getConfiguration();
            i = configuration.smallestScreenWidthDp;
            boolean flag1 = ((dan)hgx.a(context, dan)).b(context, b);
            if (d)
            {
                ebw.b("Babel", (new StringBuilder(60)).append("RegisterAccountOperation, userWantsIncomingPhoneCalls: ").append(flag1).toString());
            }
            flag = flag1;
            if (flag1)
            {
                break label0;
            }
            Iterator iterator = hgx.c(context, bpu).iterator();
            bpu bpu1;
            do
            {
                flag = flag1;
                if (!iterator.hasNext())
                {
                    break label0;
                }
                bpu1 = (bpu)iterator.next();
            } while (!bpu1.a(context, b));
            flag1 = true;
            flag = flag1;
            if (d)
            {
                String s = String.valueOf(bpu1);
                ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 55)).append("RegisterAccountOperation, enabling because of handler: ").append(s).toString());
                flag = flag1;
            }
        }
        boolean flag2 = ((dpl)hgx.a(g.nS, dpl)).a(b.h());
        String s1 = dcx.c().f();
        if (TextUtils.isEmpty(s1))
        {
            ebw.f("Babel", "Register account with invalid gcm registration id");
            dbf.a(b, null);
            return;
        }
        Object obj = ebz.b(ebz.g(), ebz.k());
        bnd.a();
        boolean flag3 = bnd.c();
        String s2 = g.nS.getPackageName();
        boolean flag4 = a;
        boolean flag5 = dbf.j();
        boolean flag6 = b.s();
        int j = configuration.mcc;
        int k = configuration.mnc;
        if (!b.a(((String) (obj))))
        {
            obj = null;
        }
        obj = cun.a(s1, l, flag3, s2, flag4, i, flag5, flag6, flag, j, k, flag2, ((String) (obj)));
        c.a(((dko) (obj)));
    }

    static 
    {
        hik hik = ebw.n;
    }
}
