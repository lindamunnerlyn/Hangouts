// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public final class gyx
{

    private Intent a;
    private boolean b;
    private gwl c;

    public gyx()
    {
    }

    public gyx a()
    {
        b = true;
        return this;
    }

    public gyx a(Intent intent)
    {
        a = intent;
        return this;
    }

    public gyx a(gwl gwl)
    {
        c = gwl;
        return this;
    }

    public ad b()
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("allow_no_accounts", b);
        bundle.putParcelable("account_filter", c);
        bundle.putParcelable("account_intent", a);
        gyu gyu1 = new gyu();
        gyu1.setArguments(bundle);
        return gyu1;
    }
}
