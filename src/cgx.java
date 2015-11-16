// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.List;

final class cgx
    implements cib
{

    final cgw a;

    cgx(cgw cgw1)
    {
        a = cgw1;
        super();
    }

    public void a(List list, Bundle bundle)
    {
        boolean flag;
        if (((cic)list.get(0)).b && ((cic)list.get(1)).b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ebw.e("Babel", (new StringBuilder(13)).append("granted:").append(flag).toString());
        if (flag)
        {
            cgw.a(a);
        }
    }
}
