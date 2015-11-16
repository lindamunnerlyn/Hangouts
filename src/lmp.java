// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import java.io.IOException;
import org.chromium.net.HttpNegotiateAuthenticator;

public final class lmp
    implements AccountManagerCallback
{

    final long a;
    final HttpNegotiateAuthenticator b;

    public lmp(HttpNegotiateAuthenticator httpnegotiateauthenticator, long l)
    {
        b = httpnegotiateauthenticator;
        a = l;
        super();
    }

    public void run(AccountManagerFuture accountmanagerfuture)
    {
        byte byte0 = -9;
        accountmanagerfuture = (Bundle)accountmanagerfuture.getResult();
        b.a = accountmanagerfuture.getBundle("spnegoContext");
        char c = byte0;
        accountmanagerfuture.getInt("spnegoResult", 1);
        JVM INSTR tableswitch 0 9: default 191
    //                   0 107
    //                   1 88
    //                   2 112
    //                   3 118
    //                   4 125
    //                   5 132
    //                   6 139
    //                   7 146
    //                   8 153
    //                   9 160;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        break MISSING_BLOCK_LABEL_191;
_L12:
        b.nativeSetResult(a, c, accountmanagerfuture.getString("authtoken"));
        return;
_L2:
        c = '\0';
          goto _L12
_L4:
        c = '\uFFFD';
          goto _L12
_L5:
        c = '\uFEAA';
          goto _L12
_L6:
        c = '\uFEC0';
          goto _L12
_L7:
        c = '\uFEAE';
          goto _L12
_L8:
        c = '\uFEAD';
          goto _L12
_L9:
        c = '\uFEAB';
          goto _L12
_L10:
        c = '\uFEA8';
          goto _L12
_L11:
        c = '\uFEB7';
          goto _L12
        accountmanagerfuture;
_L14:
        b.nativeSetResult(a, -3, null);
        return;
        accountmanagerfuture;
        continue; /* Loop/switch isn't completed */
        accountmanagerfuture;
        if (true) goto _L14; else goto _L13
_L13:
        c = byte0;
          goto _L12
    }
}
