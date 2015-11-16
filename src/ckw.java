// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class ckw
    implements Runnable
{

    final BabelHomeActivity a;

    public ckw(BabelHomeActivity babelhomeactivity)
    {
        a = babelhomeactivity;
        super();
    }

    public void run()
    {
        if (BabelHomeActivity.e(a) == this && BabelHomeActivity.f(a).b() && dcz.f(BabelHomeActivity.f(a).a()))
        {
            (new ckx(this, BabelHomeActivity.f(a).a())).execute(new Void[0]);
        }
    }
}
