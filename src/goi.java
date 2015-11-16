// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

final class goi
    implements gnc
{

    private final fxq a;

    goi(fxq fxq1)
    {
        a = fxq1;
    }

    public List a()
    {
        Account aaccount[];
        aaccount = a.a("com.google");
        break MISSING_BLOCK_LABEL_12;
        Object obj;
        obj;
_L2:
        throw new gnf(((Throwable) (obj)));
        ArrayList arraylist = new ArrayList(aaccount.length);
        for (int i = 0; i < aaccount.length; i++)
        {
            arraylist.add((new gnb(aaccount[i].name, i)).b());
        }

        return arraylist;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
