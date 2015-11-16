// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.identity.accounts.api.AccountData;

class fzo
    implements fzm
{

    fzo()
    {
    }

    public fzn a(Context context, Intent intent)
    {
        if (ffn.a(context, intent))
        {
            context = ffn.b(context, intent);
            return new fzn(context.a(), context.b());
        } else
        {
            return null;
        }
    }
}
