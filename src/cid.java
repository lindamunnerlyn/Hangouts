// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.List;

final class cid
    implements cjh
{

    final cic a;

    cid(cic cic1)
    {
        a = cic1;
        super();
    }

    public void a(List list, Bundle bundle)
    {
        boolean flag;
        if (((cji)list.get(0)).b && ((cji)list.get(1)).b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        eev.e("Babel", (new StringBuilder(13)).append("granted:").append(flag).toString());
        if (flag)
        {
            cic.a(a);
        }
    }
}
