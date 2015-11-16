// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class dnq extends gqn
{

    private final int a;
    private final gxa b;

    public dnq(Context context, int i)
    {
        super(context, "sign_out");
        a = i;
        b = (gxa)hgx.a(context, gxa);
    }

    protected grk a()
    {
        b.a(a);
        grk grk1 = new grk(true);
        grk1.d().putInt("account_id", a);
        return grk1;
    }
}
