// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class bzd
{

    String a;
    String b;

    public bzd()
    {
    }

    public Bundle a()
    {
        Bundle bundle = new Bundle();
        bundle.putString("account_name", a);
        bundle.putString("effective_gaia_id", b);
        return bundle;
    }

    public bzd a(String s)
    {
        a = s;
        return this;
    }

    public bzd b(String s)
    {
        b = s;
        return this;
    }
}
