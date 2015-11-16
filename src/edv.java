// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioManager;

final class edv
    implements Runnable
{

    final edu a;

    edv(edu edu1)
    {
        a = edu1;
        super();
    }

    public void run()
    {
        if (a.j != null)
        {
            a.j.abandonAudioFocus(null);
            a.j = null;
        }
    }
}
