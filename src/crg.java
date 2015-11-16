// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.phone.ViewVCardActivity;

final class crg
    implements Runnable
{

    final crf a;

    crg(crf crf1)
    {
        a = crf1;
        super();
    }

    public void run()
    {
        ViewVCardActivity.d(a.b);
    }
}
