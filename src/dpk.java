// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.api.Status;

final class dpk
    implements eni
{

    final dph a;

    dpk(dph dph1)
    {
        a = dph1;
        super();
    }

    public void a(enh enh)
    {
label0:
        {
            Object obj = (foz)enh;
            enh = ((foz) (obj)).c();
            obj = ((foz) (obj)).D_();
            if (eev.a("Babel", 3))
            {
                String s = String.valueOf(obj);
                String s1 = String.valueOf(enh);
                eev.c("Babel", (new StringBuilder(String.valueOf(s).length() + 45 + String.valueOf(s1).length())).append("Non aggregated people loaded: status=").append(s).append(" people=").append(s1).toString());
            }
            if (dph.a(a))
            {
                break label0;
            }
            if (((Status) (obj)).b())
            {
                gdv.b(dph.d(a), enh);
            }
            dph.a(a, enh);
            if (((Status) (obj)).b())
            {
                if (dph.c(a) == null)
                {
                    break label0;
                }
                dph.c(a).a(a, null, enh);
            }
            return;
        }
        enh.b();
    }
}
