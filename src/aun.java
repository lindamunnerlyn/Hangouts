// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

final class aun
    implements cib
{

    final auk a;

    aun(auk auk1)
    {
        a = auk1;
        super();
    }

    public void a(List list, Bundle bundle)
    {
        if (!g.a(list) || auk.c(a) == null) goto _L2; else goto _L1
_L1:
        int i;
        list = bundle.getString("permission_picker_name");
        i = 0;
_L5:
        if (i >= auk.c(a).size())
        {
            break MISSING_BLOCK_LABEL_80;
        }
        if (!list.equals(((aup)auk.c(a).get(i)).a())) goto _L4; else goto _L3
_L3:
        a.b(i);
_L2:
        return;
_L4:
        i++;
          goto _L5
        i = -1;
          goto _L3
    }
}
