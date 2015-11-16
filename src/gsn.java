// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.content.Intent;
import android.os.Bundle;

final class gsn
    implements AccountManagerCallback
{

    final ad a;
    final gsm b;

    gsn(gsm gsm, ad ad1)
    {
        b = gsm;
        a = ad1;
        super();
    }

    public void run(AccountManagerFuture accountmanagerfuture)
    {
        gsp gsp1;
        Intent intent;
        gsm gsm;
        ap ap1;
        try
        {
            if (!a.isAdded())
            {
                break MISSING_BLOCK_LABEL_97;
            }
            intent = (Intent)((Bundle)accountmanagerfuture.getResult()).getParcelable("intent");
            gsm = b;
            ap1 = a.getChildFragmentManager();
            gsp1 = (gsp)ap1.a("new.account.launcher");
        }
        // Misplaced declaration of an exception variable
        catch (AccountManagerFuture accountmanagerfuture)
        {
            throw new IllegalStateException(accountmanagerfuture);
        }
        accountmanagerfuture = gsp1;
        if (gsp1 != null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        accountmanagerfuture = new gsp();
        ap1.a().a(accountmanagerfuture, "new.account.launcher").c();
        g.a(new gso(gsm, accountmanagerfuture, intent));
    }
}
