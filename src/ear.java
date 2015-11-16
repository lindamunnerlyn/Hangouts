// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioManager;

final class ear
    implements Runnable
{

    final eaq a;

    ear(eaq eaq1)
    {
        a = eaq1;
        super();
    }

    public void run()
    {
        if (eaq.c(a) != null)
        {
            eaq.c(a).abandonAudioFocus(null);
            eaq.a(a, null);
        }
    }
}
