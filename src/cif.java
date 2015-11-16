// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.util.SparseArray;
import com.google.android.apps.hangouts.permissions.impl.RationaleActivity;

final class cif
    implements gov
{

    final cie a;

    cif(cie cie1)
    {
        a = cie1;
        super();
    }

    public void a(int i, Intent intent)
    {
        intent = RationaleActivity.a(intent);
        Object obj = (cik)cie.a(a).get(((ciq) (intent)).a);
        cie cie1 = a;
        int j = ((cik) (obj)).a;
        obj = ((ciq) (intent)).b;
        boolean flag;
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cie.a(cie1, j, ((java.util.List) (obj)), true, flag);
        cie.a(a, ((ciq) (intent)).a, ((ciq) (intent)).b);
    }
}
