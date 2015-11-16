// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

final class dmq
    implements ekh
{

    final dmn a;

    dmq(dmn dmn1)
    {
        a = dmn1;
        super();
    }

    public void a(ekg ekg)
    {
label0:
        {
            Object obj = (fmf)ekg;
            ekg = ((fmf) (obj)).c();
            obj = ((fmf) (obj)).B_();
            if (ebw.a("Babel", 3))
            {
                String s = String.valueOf(obj);
                String s1 = String.valueOf(ekg);
                ebw.c("Babel", (new StringBuilder(String.valueOf(s).length() + 45 + String.valueOf(s1).length())).append("Non aggregated people loaded: status=").append(s).append(" people=").append(s1).toString());
            }
            if (dmn.a(a))
            {
                break label0;
            }
            if (((Status) (obj)).e())
            {
                gbh.b(dmn.d(a), ekg);
            }
            dmn.a(a, ekg);
            if (((Status) (obj)).e())
            {
                if (dmn.c(a) == null)
                {
                    break label0;
                }
                dmn.c(a).a(a, null, ekg);
            }
            return;
        }
        ekg.b();
    }
}
