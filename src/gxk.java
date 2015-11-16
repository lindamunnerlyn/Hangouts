// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class gxk
{

    String a;
    gwl b;
    private boolean c;
    private boolean d;

    public gxk()
    {
        c = true;
        d = true;
    }

    public gxk a()
    {
        c = false;
        return this;
    }

    public gxk a(gwl gwl)
    {
        b = gwl;
        return this;
    }

    public gxk a(String s)
    {
        a = s;
        return this;
    }

    public gxk b()
    {
        d = false;
        return this;
    }

    public Bundle c()
    {
        Bundle bundle = new Bundle();
        bundle.putString("dialog_title", a);
        bundle.putBoolean("add_account", c);
        bundle.putBoolean("auto_select_single_logged_out_account", d);
        bundle.putParcelable("account_filter", b);
        return bundle;
    }
}
