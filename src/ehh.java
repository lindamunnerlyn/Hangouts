// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.wearable.WearableService;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

final class ehh
    implements ekh
{

    final ehg a;

    ehh(ehg ehg1)
    {
        a = ehg1;
        super();
    }

    public void a(ekg ekg)
    {
        ekg = (ftb)ekg;
        if (ekg.B_().e())
        {
            ekg = ekg.iterator();
            int i = 0;
            do
            {
                if (!ekg.hasNext())
                {
                    break;
                }
                fsz fsz1 = (fsz)ekg.next();
                int j = WearableService.a(a.a, fsz1);
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
