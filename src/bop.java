// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.apps.hangouts.hangout.HangoutFragment;
import java.util.Iterator;
import java.util.List;

public final class bop
    implements cib
{

    final HangoutFragment a;

    public bop(HangoutFragment hangoutfragment)
    {
        a = hangoutfragment;
        super();
    }

    public void a(List list, Bundle bundle)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            bundle = (cic)list.next();
            if (!((cic) (bundle)).a.equals("android.permission.CAMERA") || !((cic) (bundle)).b)
            {
                continue;
            }
            HangoutFragment.h(a);
            break;
        } while (true);
    }
}
