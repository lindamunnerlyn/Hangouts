// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;

final class hjh
    implements hjr
{

    final Activity a;
    final hjg b;

    hjh(hjg hjg, Activity activity)
    {
        b = hjg;
        a = activity;
        super();
    }

    public void a(fsn fsn)
    {
        if (fsn instanceof hjb)
        {
            ((hjb)fsn).a(a);
        }
    }
}
