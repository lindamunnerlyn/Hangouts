// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class csh extends ctp
{

    private final int a = 2;
    private final int b;

    public csh(ani ani1, ded ded1)
    {
        super(hdx.newBuilder().a(ani1.a()).b(ani1.ae()).a().b(), ded1, "conversations/markeventobserved", "hangouts", new ivd(), new ivf());
        b = ani1.h();
    }

    protected cvn a(kop kop)
    {
        return dee.a((ivf)kop);
    }

    protected void b(kop kop)
    {
        kop = (ivd)kop;
        jlk jlk = ((ded)super.e).a();
        int k = jlk.size();
        kop.a = new ive[k];
        for (int i = 0; i < k; i++)
        {
            ive ive1 = new ive();
            ive1.a = ctq.a(((csk)jlk.get(i)).a());
            List list = ((csk)jlk.get(i)).b();
            int l = list.size();
            ive1.b = new String[l];
            for (int j = 0; j < l; j++)
            {
                ive1.b[j] = (String)list.get(j);
            }

            ((ivd) (kop)).a[i] = ive1;
        }

        kop.requestHeader = a((new cru()).a(b).b(a).b());
    }
}
