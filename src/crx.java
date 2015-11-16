// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.List;

final class crx
    implements cjh
{

    final Bundle a;
    final crw b;

    crx(crw crw1, Bundle bundle)
    {
        b = crw1;
        a = bundle;
        super();
    }

    public void a(List list, Bundle bundle)
    {
        gdv.a(Integer.valueOf(list.size()), Integer.valueOf(1));
        list = (cji)list.get(0);
        gdv.a(((cji) (list)).a, "android.permission.READ_PHONE_STATE");
        crw.a(b, ((cji) (list)).b);
        crw.a(b, crw.a(b));
        list = b;
        boolean flag;
        if (a == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        crw.b(list, flag);
    }
}
