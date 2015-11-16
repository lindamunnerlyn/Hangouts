// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

final class byr
    implements cib
{

    final byg a;
    final byq b;

    byr(byq byq, byg byg1)
    {
        b = byq;
        a = byg1;
        super();
    }

    public void a(List list, Bundle bundle)
    {
        boolean flag1;
        flag1 = false;
        gbh.a(Integer.valueOf(list.size()), Integer.valueOf(2));
        list = list.iterator();
_L4:
        if (!list.hasNext()) goto _L2; else goto _L1
_L1:
        boolean flag;
        bundle = (cic)list.next();
        if (((cic) (bundle)).a.equals("android.permission.ACCESS_FINE_LOCATION") || ((cic) (bundle)).a.equals("android.permission.ACCESS_COARSE_LOCATION"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        if (((cic) (bundle)).b) goto _L4; else goto _L3
_L3:
        flag = flag1;
_L6:
        a.a(flag);
        return;
_L2:
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
