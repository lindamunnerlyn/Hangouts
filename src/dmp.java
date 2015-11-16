// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

final class dmp
    implements ekh
{

    final dmn a;

    dmp(dmn dmn1)
    {
        a = dmn1;
        super();
    }

    public void a(ekg ekg)
    {
label0:
        {
            Object obj = (flz)ekg;
            ekg = ((flz) (obj)).c();
            obj = ((flz) (obj)).B_();
            if (ebw.a("Babel", 3))
            {
                String s = String.valueOf(obj);
                String s1 = String.valueOf(ekg);
                ebw.c("Babel", (new StringBuilder(String.valueOf(s).length() + 51 + String.valueOf(s1).length())).append("Aggregated people loaded: status=").append(s).append(" aggregatedPeople=").append(s1).toString());
            }
            if (dmn.a(a))
            {
                break label0;
            }
            if (((Status) (obj)).e())
            {
                gbh.b(dmn.b(a), ekg);
            }
            dmn.a(a, ekg);
            if (((Status) (obj)).e())
            {
                if (dmn.c(a) == null)
                {
                    break label0;
                }
                ekg = new dni(ekg);
                dmn.c(a).a(a, ekg, null);
            }
            return;
        }
        ekg.b();
    }
}
