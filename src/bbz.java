// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class bbz
    implements gtd
{

    final bbx a;

    bbz(bbx bbx1)
    {
        a = bbx1;
        super();
    }

    public void a(int i, Intent intent)
    {
        if (i == -1 && intent != null)
        {
            ((asb)bbx.e(a).a(asb)).a(new bca(this, intent));
            return;
        } else
        {
            bbx.h(a);
            return;
        }
    }
}
