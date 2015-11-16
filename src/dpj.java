// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

final class dpj
    implements eni
{

    final dph a;

    dpj(dph dph1)
    {
        a = dph1;
        super();
    }

    public void a(enh enh)
    {
label0:
        {
            Object obj = (fov)enh;
            enh = ((fov) (obj)).c();
            obj = ((fov) (obj)).D_();
            if (eev.a("Babel", 3))
            {
                String s = String.valueOf(obj);
                String s1 = String.valueOf(enh);
                eev.c("Babel", (new StringBuilder(String.valueOf(s).length() + 51 + String.valueOf(s1).length())).append("Aggregated people loaded: status=").append(s).append(" aggregatedPeople=").append(s1).toString());
            }
            if (dph.a(a))
            {
                break label0;
            }
            if (((Status) (obj)).b())
            {
                gdv.b(dph.b(a), enh);
            }
            dph.a(a, enh);
            if (((Status) (obj)).b())
            {
                if (dph.c(a) == null)
                {
                    break label0;
                }
                enh = new dqb(enh);
                dph.c(a).a(a, enh, null);
            }
            return;
        }
        enh.b();
    }
}
