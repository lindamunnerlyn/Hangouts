// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public final class dii extends dgj
{

    private static final boolean e = false;
    private final boolean a;

    public dii(aoa aoa1, boolean flag)
    {
        super(aoa1);
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
            l = eco.a();
            Context context = g.nU;
            configuration = context.getResources().getConfiguration();
            i = configuration.smallestScreenWidthDp;
            boolean flag1 = ((dbt)hlp.a(context, dbt)).b(context, super.b.b);
            if (e)
            {
                eev.b("Babel", (new StringBuilder(60)).append("RegisterAccountOperation, userWantsIncomingPhoneCalls: ").append(flag1).toString());
            }
            flag = flag1;
            if (flag1)
            {
                break label0;
            }
            Iterator iterator = hlp.c(context, bqd).iterator();
            bqd bqd1;
            do
            {
                flag = flag1;
                if (!iterator.hasNext())
                {
                    break label0;
                }
                bqd1 = (bqd)iterator.next();
            } while (!bqd1.a(context, super.b.b));
            flag1 = true;
            flag = flag1;
            if (e)
            {
                String s = String.valueOf(bqd1);
                eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 55)).append("RegisterAccountOperation, enabling because of handler: ").append(s).toString());
                flag = flag1;
            }
        }
        boolean flag2 = ((dse)hlp.a(g.nU, dse)).a(super.b.a);
        String s2 = def.c().f();
        if (TextUtils.isEmpty(s2))
        {
            eev.f("Babel", "Register account with invalid gcm registration id");
            dcn.a(super.b.b, null);
            return;
        }
        String s1 = eey.b(eey.g(), eey.k());
        bnk.a();
        boolean flag3 = bnk.c();
        String s3 = g.nU.getPackageName();
        boolean flag4 = a;
        boolean flag5 = dcn.j();
        boolean flag6 = super.b.b.q();
        int j = configuration.mcc;
        int k = configuration.mnc;
        if (!super.b.b.a(s1))
        {
            s1 = null;
        }
        a(((dmf) (cwr.a(s2, l, flag3, s3, flag4, i, flag5, flag6, flag, j, k, flag2, s1))));
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
