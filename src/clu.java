// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioManager;

final class clu extends cmu
{

    final AudioManager a;
    final cls b;

    clu(cls cls, String s, AudioManager audiomanager)
    {
        b = cls;
        a = audiomanager;
        super(s);
    }

    public void a()
    {
        a.setMicrophoneMute(false);
    }
}
