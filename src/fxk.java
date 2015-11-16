// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.identity.accounts.api.AccountData;

class fxk
    implements fxi
{

    fxk()
    {
    }

    public fxj a(Context context, Intent intent)
    {
        if (fcp.a(context, intent))
        {
            context = fcp.b(context, intent);
            return new fxj(context.b(), context.c());
        } else
        {
            return null;
        }
    }
}
