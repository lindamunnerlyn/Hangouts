// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class gya extends gqn
{

    private final gyf a;

    public gya(String s, gyf gyf1)
    {
        super(s);
        a = gyf1;
    }

    protected grk a(Context context)
    {
        boolean flag = a.a();
        context = new grk(true);
        context.d().putBoolean("are_accounts_ready_for_login", flag);
        return context;
    }
}
