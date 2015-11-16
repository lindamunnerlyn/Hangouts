// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.List;

final class cqg
    implements cib
{

    final Bundle a;
    final cqf b;

    cqg(cqf cqf1, Bundle bundle)
    {
        b = cqf1;
        a = bundle;
        super();
    }

    public void a(List list, Bundle bundle)
    {
        gbh.a(Integer.valueOf(list.size()), Integer.valueOf(1));
        list = (cic)list.get(0);
        gbh.a(((cic) (list)).a, "android.permission.READ_PHONE_STATE");
        cqf.a(b, ((cic) (list)).b);
        cqf.a(b, cqf.a(b));
        list = b;
        boolean flag;
        if (a == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cqf.b(list, flag);
    }
}
