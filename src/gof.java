// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.content.Intent;
import android.os.Bundle;

final class gof
    implements AccountManagerCallback
{

    final ad a;
    final goe b;

    gof(goe goe1, ad ad1)
    {
        b = goe1;
        a = ad1;
        super();
    }

    public void run(AccountManagerFuture accountmanagerfuture)
    {
        try
        {
            if (a.isAdded())
            {
                accountmanagerfuture = (Intent)((Bundle)accountmanagerfuture.getResult()).getParcelable("intent");
                goe.a(b, a, accountmanagerfuture);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AccountManagerFuture accountmanagerfuture)
        {
            throw new IllegalStateException(accountmanagerfuture);
        }
    }
}
