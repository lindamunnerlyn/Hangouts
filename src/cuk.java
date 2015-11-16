// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class cuk extends cvt
{

    private final int a = 2;
    private final int b;

    public cuk(aoa aoa1, dfl dfl1)
    {
        super(hio.newBuilder().a(aoa1.a()).b(aoa1.ab()).a(true).a(), dfl1, "conversations/markeventobserved", dmi.a, new jbi(), new jbk());
        b = aoa1.h();
    }

    protected cxr a(kws kws)
    {
        return dfm.a((jbk)kws);
    }

    protected void b(kws kws)
    {
        kws = (jbi)kws;
        jsh jsh = ((dfl)super.e).a();
        int k = jsh.size();
        kws.a = new jbj[k];
        for (int i = 0; i < k; i++)
        {
            jbj jbj1 = new jbj();
            jbj1.a = cvu.a(((cun)jsh.get(i)).a());
            List list = ((cun)jsh.get(i)).b();
            int l = list.size();
            jbj1.b = new String[l];
            for (int j = 0; j < l; j++)
            {
                jbj1.b[j] = (String)list.get(j);
            }

            ((jbi) (kws)).a[i] = jbj1;
        }

        kws.requestHeader = a((new ctx()).a(b).b(a).b());
    }
}
