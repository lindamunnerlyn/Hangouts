// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.wearable.WearableService;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

final class eki
    implements eni
{

    final ekh a;

    eki(ekh ekh1)
    {
        a = ekh1;
        super();
    }

    public void a(enh enh)
    {
        enh = (fvh)enh;
        if (enh.D_().b())
        {
            enh = enh.iterator();
            int i = 0;
            do
            {
                if (!enh.hasNext())
                {
                    break;
                }
                fvf fvf1 = (fvf)enh.next();
                int j = WearableService.a(a.a, fvf1);
                if (j > i)
                {
                    i = j;
                }
            } while (true);
            if (i > 0)
            {
                WearableService.a(a.a, i);
            }
        }
    }
}
