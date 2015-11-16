// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;

final class zu extends hp
{

    final zt b;

    zu(zt zt1)
    {
        b = zt1;
        super();
    }

    public void a(View view, mq mq)
    {
        super.a(view, mq);
        if (!b.b.x() && b.b.d() != null)
        {
            b.b.d().a(view, mq);
        }
    }

    public boolean a(View view, int i, Bundle bundle)
    {
        if (super.a(view, i, bundle))
        {
            return true;
        }
        if (!b.b.x() && b.b.d() != null)
        {
            return b.b.d().v();
        } else
        {
            return false;
        }
    }
}
