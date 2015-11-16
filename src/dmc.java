// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

final class dmc
    implements ekh
{

    final dma a;

    dmc(dma dma1)
    {
        a = dma1;
        super();
    }

    public void a(ekg ekg)
    {
        Object obj;
label0:
        {
            obj = (fmb)ekg;
            ekg = ((fmb) (obj)).B_();
            obj = ((fmb) (obj)).c();
            if (ebw.a("Babel", 3))
            {
                String s = String.valueOf(ekg);
                String s1 = String.valueOf(obj);
                ebw.c("Babel", (new StringBuilder(String.valueOf(s).length() + 31 + String.valueOf(s1).length())).append("Circle loaded: status=").append(s).append(" circles=").append(s1).toString());
            }
            dma.a(a, ((fqr) (obj)));
            if (ekg.e())
            {
                if (a.b == null)
                {
                    break label0;
                }
                a.b.a(((fqr) (obj)));
            }
            return;
        }
        ((fqr) (obj)).b();
    }
}
