// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.util.SparseArray;
import java.util.ArrayList;

final class cjl
    implements gtd
{

    final cjk a;

    cjl(cjk cjk1)
    {
        a = cjk1;
        super();
    }

    public void a(int i, Intent intent)
    {
        intent = new cjw(intent.getIntExtra("original_request_code", 0), (ArrayList)intent.getSerializableExtra("permission_results"));
        Object obj = (cjq)a.a.get(((cjw) (intent)).a);
        cjk cjk1 = a;
        int j = ((cjq) (obj)).a;
        obj = ((cjw) (intent)).b;
        boolean flag;
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cjk.a(cjk1, j, ((java.util.List) (obj)), true, flag);
        cjk.a(a, ((cjw) (intent)).a, ((cjw) (intent)).b);
    }
}
