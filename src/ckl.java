// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class ckl
    implements Runnable
{

    final BabelHomeActivity a;

    public ckl(BabelHomeActivity babelhomeactivity)
    {
        a = babelhomeactivity;
        super();
    }

    public void run()
    {
        BabelHomeActivity.l(a);
    }
}
